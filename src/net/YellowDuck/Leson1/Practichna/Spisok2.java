package net.YellowDuck.Leson1.Practichna;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Вася on 19.11.2015.
 */
public class Spisok2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Списки кон");
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


    }
}
