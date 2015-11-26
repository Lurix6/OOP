package net.YellowDuck.Leson1.PractechnaPara.Practichna.TreeMapModern;

import java.util.LinkedList;

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

class Open{
    public static void main(String[] args) {
        LinkedList<Adress> m1 = new LinkedList<>();
        m1.add(new Adress( "dslkgn","gdsgd", "sdfgd","gssgs","hdfsdg"));

        for (Adress ellements : m1){
            System.out.println(ellements + "\n");
            System.out.println();
        }
    }
}

