package net.YellowDuck.Leson1.Practichna;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Вася on 19.11.2015.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\tСписок контактів ");
        System.out.println("****************************");
        ArrayList<String> name = new ArrayList<>();
        name.add("Вася П.");
        name.add("Вітя Б.");
        name.add("Павло К.");
        name.add("Юліана П.");
        name.add("Альоша Б.");
        name.add("Вася В.");
        name.add("Іван Ж.");
        name.add("Коля Б.");


        ArrayList<String> phone = new ArrayList<>();
        phone.add("+380937466729");
        phone.add("+380937366729");
        phone.add("+380937986729");
        phone.add("+380937466729");
        phone.add("+380937474729");
        phone.add("+380937452729");
        phone.add("+380937466778");
        phone.add("+380937466734");

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i) + "  \t" + phone.get(i));
        }
        System.out.println("****************************");

        System.out.println("Для пошуку контакту введіть слово <пошук>" + "" +
                "Щоб знайти контакт введіть слово <контакт> ");

        String komanda = sc.next();
        if (komanda.equals("пошук")) {
            System.out.println("Введі ім'я");
            String name0 = sc.next();
            name.contains(new String(name0));
            if (name.contains(name0) == true){

                System.out.println();
            }



        } else {


        }
    }
}



