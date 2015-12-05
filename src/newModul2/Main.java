package newModul2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Вася on 03.12.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Foods foods = new Foods();
        Record rekord = new Record();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; ; i++) {

            System.out.println("\t\tМожливі дії ");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Додати звіт про день (додати)\nАбо переглянути історію (історія)\nЩоб вийти з програми набиріть (вийти)" +
                    "\nЩоб очистити історію (очистити)\nМеню страв (меню)\nЩоб відкрити додаткові функції введіть (додатково)\nЩоб додати звіт користуючись базою данних (нова)");
            String variant = sc.nextLine();
            if (variant.equals("нова")){
                System.out.println("Введіть страву яку ви бажаєте знайти ");
                String searchFood = sc.nextLine();
                foods.readFoods();
                foods.searchFood(searchFood);
                if (foods.getOtvet() == true ) {
                    System.out.println("Скільки калорій ви витрали?");
                    Integer kalirijVitrativ = sc.nextInt();
                    rekord.addKalorijBaza(foods.setKalorij(), kalirijVitrativ);
                    rekord.historiFail();
                }

            }else if (variant.equalsIgnoreCase("додати")) {
                System.out.println("Скільки ви согоні спожили Калорій?");
                Integer kalirijSpogiv = sc.nextInt();
                System.out.println("Скільки калорій ви витрали?");
                Integer kalirijVitrativ = sc.nextInt();
                rekord.addKalorijBaza(kalirijSpogiv, kalirijVitrativ);
                rekord.historiFail();
                System.out.println("Звіт додано \n********************************************");
            } else if (variant.equalsIgnoreCase("вийти")) {
                System.exit(0);
            } else if (variant.equalsIgnoreCase("історія")) {
                rekord.historiOpenFile();
                rekord.histori();
            } else if (variant.equalsIgnoreCase("очистити")) {
                rekord.historiClean();
                rekord.historiFail();
            } else if (variant.equalsIgnoreCase("меню")) {
                foods.readFoods();
                foods.readMainMenu();
            } else if (variant.equalsIgnoreCase("додатково")) {
                System.out.println("********************************************************************************");
                System.out.println("Щоб додати нову страву (додати)\nЩоб переглянути додані вами страви (додана)\nЩоб записати додані вами блюда в базу данних(експорт)\n" +
                        "Щоб очистити історію доданих страв (очистити)");
                System.out.println("********************************************************************************");
                String additionally = sc.nextLine();
                if (additionally.equalsIgnoreCase("додати")) {
                    System.out.println("Введіть назву нової страви");
                    String newStrava = sc.nextLine();
                    System.out.println("Яка калорійність цієї страви ?");
                    Integer newKalorijnistStravi = sc.nextInt();
                    rekord.addFoodForSpisokStrav(newStrava, newKalorijnistStravi);
                    rekord.readMySpisikStrav();
                    System.out.println("Страву додано\n***********************************************");
                } if(additionally.equalsIgnoreCase("додана")) {
                    rekord.historiOpenFileSpisokStrav();
                    rekord.openFoodForSpisokStrav();
                }if (additionally.equalsIgnoreCase("експорт")){
                    rekord.historiOpenFileSpisokStrav();
                    rekord.readFoodsFul();
                }if (additionally.equalsIgnoreCase("чистити")){
                    rekord.clean2();
                    rekord.readMySpisikStrav();
                    System.out.println("очищено********************");
                }
            } else {
                System.out.println("Ви нічого не ввили потрібні команди повторіть спробу");
            }

        }
    }
}