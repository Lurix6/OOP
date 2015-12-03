package Modul2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Вася on 26.11.2015.
 */
public class Dialog {
Account aka = new Account();
    Scanner sc = new Scanner(System.in);

    String stravaEat ;
    String name;
    int age;
    int height;
    int weight;
    Integer kalorVitra;


    void vitanja(){
        System.out.println("********************|Фітнес програма|************************ ");
        System.out.println("Бажаєте створити НОВИЙ профіль введіть <новий>");
        System.out.println("Бажаєте використати старий профіль введіть <старий>");
        String profil = sc.nextLine();
    }

    void foodEatToDay() {
        System.out.println("Скільки калорій ви витратили сьогодні  " );
        kalorVitra = sc.nextInt();

    }
    void registr() throws IOException {
        System.out.println("Щоб заповнити створити аккаунт дайте відповіді на всі питання");
        System.out.println("1 Ваше ім'я");
        String name =sc.next();
        System.out.println("2 Скільки вам років (рок)");
        Integer age = sc.nextInt();
        System.out.println("3 Який ваш ріст (см)");
        Integer height = sc.nextInt();
        System.out.println("4 Яка ваша вага (кг)");
        Integer weight = sc.nextInt();
        aka.ak(name,age,height,weight);
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
