package newModul2;

import java.util.Scanner;

/**
 * Created by Вася on 03.12.2015.
 */
public class Dialog {
    Record rekord = new Record();
    Profil prof = new Profil();
    Scanner sc = new Scanner(System.in);

    void profil(){
        System.out.println("Щоб розпочати роботу створвть новий профіль\nДля початку введіть своє ім'я");
        String name = sc.nextLine();
        System.out.println("Скільки вам років?");
        int age = sc.nextInt();
        System.out.println("Скільки ви важете ?");
        int weight = sc.nextByte();
        System.out.println("Який ваш ріст");
        int height = sc.nextByte();
       prof.normakalor(weight,height,age);
    }
}