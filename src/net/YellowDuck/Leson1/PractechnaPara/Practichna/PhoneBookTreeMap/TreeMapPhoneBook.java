package net.YellowDuck.Leson1.PractechnaPara.Practichna.PhoneBookTreeMap;

import java.util.*;

/**
 * Created by Вася on 20.11.2015.
 */
public class TreeMapPhoneBook {


    void mas() {
        TreeMap<String, String> ph = new TreeMap<>();
        ph.put("Вася", "+38096546464");
        ph.put("Вітя", "+38451894198");
        ph.put("Андрій", "+32186516515");
        ph.put("Толік", "+3216846513");
        ph.put("Мартін", "+65468131668");
        ph.put("Вова", "+31684321681");
        ph.put("Юля", "+35181651682");
        ph.put("Галя", "+35165161155");


        Set<Map.Entry<String, String>> mp = ph.entrySet();

        for (
                Map.Entry<String, String> me : mp)

        {
            System.out.print(me.getKey() + " \t");
            System.out.println(me.getValue());
        }
    }

    TreeMap<String, String> ph = new TreeMap<>();

    void recursia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************************");
        ph.put("Вася", "+38096546464");
        ph.put("Вітя", "+38451894198");
        ph.put("Андрій", "+32186516515");
        ph.put("Толік", "+3216846513");
        ph.put("Мартін", "+65468131668");
        ph.put("Вова", "+31684321681");
        ph.put("Юля", "+35181651682");
        ph.put("Галя", "+35165161155");

        System.out.println("Для пошуку контакту введіть слово <пошук>" + "\n" +
                "Щоб додати контакт введіть слово <додати> " + "\n" +
                "Щоб Вилалити контакт введіть слово <видалити>" + "\n" +
                "Щоб редрагувати контакт введіть слово <редагувати>" + "\n" +
                "Щоб вийти з програми введіть <вийти>");

        String otvet = sc.next();
        if (otvet.equals("пошук")) {
            System.out.println("Введіть шукане ім'я");
            String name = sc.next();
            if (ph.containsKey(name)) {

                System.out.println("*****************************************");
                System.out.println(name + "\t " + ph.get(name));
                System.out.println("*****************************************");
            } else {

                System.out.println("Ім'я немає в  каталозі ");
            }

        } else if (otvet.equals("додати")) {
            System.out.println("Введіть ім'я нового контакта");
            String name = sc.next();
            System.out.println("Введіть номер нового контакта");
            String nomer = sc.next();
            ph.put(name, nomer);

        } else if (otvet.equals("видалити")) {
            System.out.println("Виберіть контакт для видалення");
            String delit = sc.next();
            if (ph.containsKey(delit)) {
                ph.remove(delit);
            } else {
                System.out.println("**********************************");
                System.out.println("Контакта неіснує");
                System.out.println("***********************************");
            }

        } else if (otvet.equals("редагувати")) {
            System.out.println("Введіть ім'я контакта ");
            String name1 = sc.next();
            System.out.println("Введіть змінене ім'я");
            String nameZmina = sc.next();
            System.out.println("Введіть змінений телефонний номер");
            String phoneZmina = sc.next();
            ph.remove(name1);
            ph.put(nameZmina, phoneZmina);
        }
        Set<Map.Entry<String, String>> mp1 = ph.entrySet();

        for (Map.Entry<String, String> me : mp1) {
            System.out.print(me.getKey() + " \t");
            System.out.println(me.getValue());
        }

        if (otvet.equals("вийти")) {

        } else {
            recursia();
        }
    }
}
