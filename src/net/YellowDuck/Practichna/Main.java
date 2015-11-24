package net.YellowDuck.Practichna;

import java.util.*;

/**
 * Created by Вася on 19.11.2015.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\tСписок контактів ");
        System.out.println("****************************");
        ArrayList<String> name = new ArrayList<>();
        name.add("Вася");
        name.add("Вітя");
        name.add("Павло");
        name.add("Юліана");
        name.add("Альоша");
        name.add("Галя");
        name.add("Іван");
        name.add("Коля");


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

        System.out.println("Для пошуку контакту введіть слово <пошук>" + "\n" +
                "Щоб додати контакт введіть слово <контакт> " + "\n" +
                "Щоб Вилалити контакт введіть слово <видалити>" + "\n" +
                "Щоб редрагувати контакт введіть слово <редагувати>");

        String komanda = sc.next();
        if (komanda.equals("пошук")) {
            System.out.println("Введі ім'я");
            String name0 = sc.next();

            if (name.contains(name0) == true) {
                Integer indexPoisk = name.indexOf(name0);
                System.out.println("*******************************");
                System.out.println(name.get(indexPoisk) + "   " + phone.get(indexPoisk));
                System.out.println("*******************************");

            } else {
                System.out.println("Контака неіаснує");
            }

        } else if (komanda.equals("видалити")) {
            System.out.println("Введіть ім'я контакту ");
            String name1 = sc.next();
            if (name.contains(name1) == true) {
                name.remove(name1);
                phone.remove(name1);
            } else {
                System.out.println("Такого котакта немає");
            }

        } else if (komanda.equals("редагувати")) {
            System.out.println("Введіть ім'я контакта ");
            String name1 = sc.next();
            Integer index = name.indexOf(name1);
            System.out.println("Введіть змінене ім'я");
            String nameZmina = sc.next();
            System.out.println("Введіть змінений телефонний номер");
            String phoneZmina = sc.next();
            name.remove(name1);
            phone.remove(index);
            name.add(index, nameZmina);
            phone.add(index, phoneZmina);


        } else {
            System.out.println("Введіть ім'я контакта ");
            String name1 = sc.next();
            if (name.contains(name1)) {
                System.out.println("Ім'я заняте \n Введіть інше ім'я ");
            } else {
                name.add(name1);
                System.out.println("Введіть номер телефона");
                String phone1 = sc.next();
                phone.add(phone1);
            }

        }


        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i) + "  \t" + phone.get(i));
            String key = null, volue;



        }
    }

}



