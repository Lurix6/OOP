package Modul2;

import java.util.Scanner;

/**
 * Created by Вася on 26.11.2015.
 */
public class Dialog {
    Scanner sc = new Scanner(System.in);

    Foods fd = new Foods();
    String stravaEat ;
    String name;
    int age;
    int height;
    int weight;



    void vitanja(){
        System.out.println("********************|Фітнес програма|************************ ");
        System.out.println("Бажаєте створити НОВИЙ профіль введіть <новий>");
        System.out.println("Бажаєте використати старий профіль введіть <старий>");
        String profil = sc.nextLine();
    }

    void foodEatToDay() {
        System.out.println("Введіть страву яку ви сьгодіні їли " );

    }

    void pitanja(){
        System.out.println("Скільки ви сьгодні калорій спожили ");
        String kalorijSpozhivToodaj = sc.nextLine();
        System.out.println("Скільки ви калорій сьогодні втратили ");
        String kalorijVitrativToodaj = sc.nextLine();
    } void vitanjaNoProfil(){
        System.out.println("********************|Фітнес програма|************************ ");
        System.out.println("Вітаю вас в нові програмі яка допоможе вам контролювати ваш раціон .");
        System.out.println();

    }
}
