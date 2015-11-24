package net.YellowDuck.Leson1.PractechnaPara.Practichna.PhoneTreeMapPlusLinkeList;

/**
 * Created by Вася on 24.11.2015.
 */
public class Test {


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
    }



}

