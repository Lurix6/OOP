package net.YellowDuck.Leson1.PractechnaPara.Practichna.TreeMapModern;

import java.util.Scanner;

/**
 * Created by Вася on 24.11.2015.
 */
public class Test {
Scanner sc = new Scanner(System.in);

    void Adress( String p, String hP, String e, String ad, String web) {
        String phone;
        String eMail;
        String adres;
        String homePhone;
        String webSayt;
        phone = p;
        homePhone = hP;
        eMail = e;
        adres = ad;
        webSayt = web;


        String open = (phone + "\t" + homePhone + "\t" + webSayt + "\t" + adres + "\t" + eMail);
    }
    void Pitanja(){
        System.out.println("*************|Вітаю вас в Телефонному справочнику|******************");
        System.out.println("*************|Можливі дії|******************");
        System.out.println("***Для пошуку контакту введіть слово <пошук>" + "\n" +
                "*** Щоб додати контакт введіть слово <додати> " + "\n" +
                "*** Щоб Вилалити контакт введіть слово <видалити>" + "\n" +
                "*** Щоб редрагувати контакт введіть слово <редагувати>" + "\n" +
                "*** Щоб вийти з програми введіть <вийти>");
    }void Add (){
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

    }



}

