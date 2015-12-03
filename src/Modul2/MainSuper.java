package Modul2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Вася on 26.11.2015.
 */
public class MainSuper {
    public static void main(String[] args) throws IOException {
        Dialog dia = new Dialog();
        Foods foods = new Foods();
        Scanner sc = new Scanner(System.in);
        Record rek = new Record();
        Account aka = new Account();


//        System.out.println("Якщо бажаєте створити новий профіль введіть (новий). Якщо не бажаєте то просто клацніт на Enter");
//        String profil = sc.nextLine();
//        if (profil.equalsIgnoreCase("новий")) {
//            aka.cleanAccount();
//            rek.historiClean();
//            rek.historiFail();
//
//            dia.registr();
//
//        }


        for (int i = 0; ; i++) {

            System.out.println("\t\tМожливі дії ");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Додати звіт про день (додати)\nАбо переглянути історію (історія)\nЩоб вийти з програми набиріть (вийти)" +
                    "\nЩоб очистити історію (очистити)\nНорма калорій на сьгодні :" + "\nЩоб відкрити меню страв ф додати страву введіть (страва)" +
                    "\nоб переглянути список наявних страв введіть (МЕНЮ)");
            String variant = sc.nextLine();
            if (variant.equalsIgnoreCase("додати")) {
                System.out.println("Скільки ви согоні спожили Калорій?");
                Integer kalirijSpogiv = sc.nextInt();
                System.out.println("Скільки калорій ви витрали?");
                Integer kalirijVitrativ = sc.nextInt();
                rek.Dialod(kalirijSpogiv, kalirijVitrativ);
                rek.historiOpenFile();
                System.out.println("Звіт додано \n********************************************");
            } else if (variant.equalsIgnoreCase("вийти")) {
                System.exit(0);
            } else if (variant.equalsIgnoreCase("історія")) {
                rek.historiOpenFile();
                rek.historiFail();
                rek.histori();
            } else if (variant.equalsIgnoreCase("очистити")) {
                rek.historiClean();
                rek.historiFail();
                System.out.println("Очищено");
            } else if (variant.equalsIgnoreCase("страва")) {
                System.out.println("Якщо бажаєте додати в базу даних страву то введіть (додати).\nЯкщо бажаєте додати звіт іжі на сьгодні (що я їв)");
                String variantStrava = sc.nextLine();
                if (variantStrava.equalsIgnoreCase("додати")) {
                    System.out.println("Ведіть страву");
                    String strava = sc.nextLine();
                    System.out.println("Скільки калорій має ця страва в 100г");
                    Integer calor = sc.nextInt();
                    foods.novaStrava(strava, calor);

                } else if (variantStrava.equalsIgnoreCase("Що я їв")) {
                    dia.foodEatToDay();
                    System.out.println("Введть страву яку ви їли");
                    foods.poshook();
                    rek.historiOpenFile();
                    rek.historiFail();

                }

            }else if (variant.equalsIgnoreCase("меню")){


                foods.menu();
            }


        }

//        dia.vitanjaNoProfil();
//        dia.foodEatToDay();
//        String stravaEat = sc.nextLine();
//        dia.youEat(stravaEat);
//

    }
}
