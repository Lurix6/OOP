package newModul2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Вася on 03.12.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Foods foods = new Foods();
        Profil prof = new Profil();

        Record rekord = new Record();
        Scanner sc = new Scanner(System.in);
        Dialog dia = new Dialog();

        System.out.println("Бажаєте створити новий профіль (Так) Інакше ви зайдете під старим профілем");
        String otvet = sc.nextLine();
        if (otvet.equalsIgnoreCase("так")) {


            prof.profil();
            prof.wreeteProf();
            prof.readProfil();
            System.out.println("Вітаю вас " + prof.getName() + " .Профіль успішно створено норма калорій для вас " + prof.getNormaKalor());
            rekord.historiOpenFile();
            rekord.historiClean();
            rekord.historiFail();
            rekord.cleanSpisokStrav();
            rekord.readMySpisikStrav();
        }
        prof.readProfil();
        for (int i = 0; ; i++) {

            System.out.println("\t\tМожливі дії");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++ \nДенна норма калорій " + prof.getNormaKalor() + "\n********************************************");
            System.out.println("Щоб видалити профіль введіть (профіль)якщо ви видалите профіль то програма автоматично вимнеться і очистит всі данні" +
                    "\nДодати звіт про день (додати)\nАбо переглянути історію (історія)\nЩоб вийти з програми набиріть (вийти)" +
                    "\nЩоб очистити історію (очистити)\nМеню страв (меню)\nЩоб відкрити додаткові функції введіть (додатково)\nЩоб додати звіт користуючись базою данних (нова)");
            String variant = sc.nextLine();
            if (variant.equals("нова")) {
                System.out.println("Введіть страву яку ви бажаєте знайти ");
                String searchFood = sc.nextLine();
                foods.readFoods();
                foods.searchFood(searchFood);
                if (foods.getOtvet() == true) {
                    System.out.println("Скільки калорій ви витрали?");
                    Integer kalirijVitrativ = sc.nextInt();
                    rekord.addKalorijBaza(foods.setKalorij(), kalirijVitrativ);
                    rekord.historiFail();
                }

            } else if (variant.equalsIgnoreCase("додати")) {
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
            } else if (variant.equalsIgnoreCase("профіль")) {
                prof.delitProfil();
                rekord.historiOpenFile();
                rekord.historiClean();
                rekord.historiFail();
                rekord.cleanSpisokStrav();
                rekord.readMySpisikStrav();
                System.exit(0);
            } else if (variant.equalsIgnoreCase("додатково")) {
                System.out.println("********************************************************************************");
                System.out.println("Щоб додати нову страву (додати)\nЩоб переглянути додані вами страви (додана)\nЩоб записати додані вами блюда в базу данних(експорт)\n" +
                        "Щоб очистити історію доданих страв (очистити)\nЩоб додати декілька страв відносно одного дня (декілька)");
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
                }
                if (additionally.equalsIgnoreCase("додана")) {
                    rekord.historiOpenFileSpisokStrav();
                    rekord.openFoodForSpisokStrav();
                }
                if (additionally.equalsIgnoreCase("експорт")) {
                    rekord.historiOpenFileSpisokStrav();
                    rekord.readFoodsFul();
                    rekord.cleanSpisokStrav();
                    rekord.feil();
                    rekord.writeMySpisikStravInMainMenu();
                }
                if (additionally.equalsIgnoreCase("очистити")) {
                    rekord.cleanSpisokStrav();
                    rekord.readMySpisikStrav();
                    System.out.println("очищено********************");
                }
                if (additionally.equals("декілька")) {
                    foods.readFoods();
                    foods.recurs();
                }
            } else {
                System.out.println("Ви нічого не ввили потрібні команди повторіть спробу");
            }

        }
    }
}