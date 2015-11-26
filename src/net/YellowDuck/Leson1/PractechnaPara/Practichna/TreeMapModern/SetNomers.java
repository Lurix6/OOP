package net.YellowDuck.Leson1.PractechnaPara.Practichna.TreeMapModern;

/**
 * Created by Вася on 24.11.2015.
 */
     class Adress {
    String phone;
    String eMail;
    String adres;
    String homePhone;
    String webSayt;
    Adress( String p ,String hP, String e, String ad, String web   ){

        phone = p;
        homePhone = hP;
        eMail = e;
        adres = ad;
        webSayt = web;
    }

        public String toString(){
            return   phone +"\t" + homePhone +"\t" + webSayt +"\t" + adres + "\t" + eMail;
        }
}



