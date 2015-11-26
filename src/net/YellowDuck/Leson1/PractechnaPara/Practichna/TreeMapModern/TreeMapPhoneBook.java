package net.YellowDuck.Leson1.PractechnaPara.Practichna.TreeMapModern;


import net.YellowDuck.Leson1.PractechnaPara.Practichna.PhoneBookLinkenList.Adress;

import java.util.*;

/**
 * Created by Вася on 20.11.2015.
 */
public class TreeMapPhoneBook {
    Scanner sc = new Scanner(System.in);
    Test test = new Test();
    TreeMap<String, Object> ph = new TreeMap<>();

    void add() {


        System.out.println("Введіть наступні данні щоб заповнити контакт . Якщо ви незнаєте ці данні то введіть пропуск." + "\n" + " Ведіть ім'я ");
        String nam = sc.nextLine();
        System.out.print("Телефонний номер :");
        String phone = sc.nextLine();
        System.out.print("Домашній телефон :");
        String phoneHome = sc.nextLine();

        System.out.print("Адрес :");
        String adres = sc.nextLine();
        System.out.print("Емайл :");
        String eMail = sc.nextLine();
        System.out.print("Веб сайт :");
        String webSayt = sc.nextLine();


        ph.put(nam, new Adress(phone, phoneHome, adres, eMail, webSayt));


        Set<Map.Entry<String, Object>> mp1 = ph.entrySet();

        System.out.println("*************************************************");
        System.out.println("\t\t\t Наявні контакти(Кількість контактів ) " + ph.size());
        for (Map.Entry<String, Object> me : mp1) {
            System.out.print(me.getKey() + "- \t");
            System.out.println(me.getValue());
        }

    }void poshuk(){
        System.out.println("Введіть шукане ім'я :");
        String name = sc.nextLine();

        if (ph.containsKey(name)){

            System.out.println(ph.get(name));
        }else{
            System.out.println("Контакта неіснує");
            System.out.println("***********************************************");
        }
    }void redrag(){
        System.out.println("Введіть ім'я яке ви будете редрагувати");
        String name = sc.next();
        if (ph.containsKey(name)){
            System.out.println(ph.get(name));
            System.out.println("Введіть змінне ім'я :");
            String name1 = sc.nextLine();
            System.out.print("Телефонний номер :");
            String phone = sc.nextLine();
            System.out.print("Домашній телефон :");
            String phoneHome = sc.nextLine();

            System.out.print("Адрес :");
            String adres = sc.nextLine();
            System.out.print("Емайл :");
            String eMail = sc.nextLine();
            System.out.print("Веб сайт :");
            String webSayt = sc.nextLine();

            ph.remove(name);
            ph.put(name1,new Adress(phone ,phoneHome ,adres ,eMail ,webSayt));
        }else {
            System.out.println("Контакта неіснує");
            System.out.println();
        }


    }void delit(){
        System.out.println();
        System.out.println("Введіть контакт який ви бажаєте видалити");
        String name = sc.nextLine();
        if (ph.containsKey(name)){
            ph.remove(name);

        }else{
            System.out.println("Контакта неіснує");
            System.out.println("************************************************");
        }


        Set<Map.Entry<String, Object>> mp1 = ph.entrySet();


        for (Map.Entry<String, Object> me : mp1) {
            System.out.print(me.getKey() + " \t");
            System.out.println(me.getValue());
        }
    }


}

//   for(Map.Entry<String, Object> me : ph.entrySet())
//
//   {
//       System.out.print(me.getKey() + " \t");
//       System.out.println(me.getValue());
//   }
