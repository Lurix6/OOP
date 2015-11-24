package net.YellowDuck.Leson1.PractechnaPara.Practichna.PhoneTreeMapPlusLinkeList;

import java.util.*;

/**
 * Created by Вася on 21.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test test = new Test();


        test.Pitanja();

//
        ArrayList<String> name1 = new ArrayList<>();
        ArrayList<String> phone1 = new ArrayList<>();
        ArrayList<String> adres1 = new ArrayList<>();
        ArrayList<String> eMail1 = new ArrayList<>();
        ArrayList<String> webSayt1 = new ArrayList<>();


        for (int i = 0; ; i++) {

            if (i >=1){test.Pitanja();}

            String otvet = sc.next();

            if (otvet.equalsIgnoreCase("додати")) {
                System.out.println("Введіть наступні данні щоб заповнити контакт . Якщо ви незнаєте ці данні то введіть пропуск." + "\n" + " Ведіть ім'я ");
                String nam = sc.next();
                System.out.print("Телефонний номер");
                String phone = sc.next();

                System.out.print("Адрес");
                String adres = sc.next();
                System.out.print("Емайл ");
                String eMail = sc.next();
                System.out.print("Веб сайт");
                String webSayt = sc.next();


                name1.add(nam);
                phone1.add(phone);
                adres1.add(adres);
                eMail1.add(eMail);
                webSayt1.add(webSayt);

                for (int k = 0; k < name1.size(); k++) {

                    System.out.print("Імя:" + name1.get(k) + " Телефонний номер: " + phone1.get(k) + " Адрес: " + adres1.get(k) + " Емайл: " + eMail1.get(k) + " Вебсайт: " + webSayt1.get(k));
                    break;
                }


            } else if (otvet.equalsIgnoreCase("видалити")) {
                System.out.print("Введіть контакт для видалення");
                String name = sc.next();
                int a = name1.indexOf(name);
                name1.remove(a);
                phone1.remove(a);
                adres1.remove(a);
                eMail1.remove(a);
                webSayt1.remove(a);
            } else if (otvet.equalsIgnoreCase("вийти")) {
                break;
            } else if (otvet.equalsIgnoreCase("знайти")) {
                System.out.print("Введіть контакт для видалення");
                String name = sc.next();
                int a = name1.indexOf(name);
                System.out.println("Імя:" + name1.get(a) + " Телефонний номер: " + phone1.get(a) + " Адрес: " + adres1.get(a) + " Емайл: " + eMail1.get(a) + " Вебсайт: " + webSayt1.get(a));

            }
        }


    }
}
