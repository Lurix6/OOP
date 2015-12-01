package Modul2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Вася on 28.11.2015.
 */
public class Record {

    Integer sum = 0;
    Integer kalorDob;
    Integer vitrat = 0;
    Integer nabr = 0;

    Integer kalorVi;
    Map<Integer, Integer> tablo = new HashMap<>();


    void Dialod(Integer spogiv, Integer vitrat) {
        this.kalorDob = spogiv;
        this.kalorVi = vitrat;
        tablo.put(kalorDob, kalorVi);


    }

    void histori() {
        Set<Map.Entry<Integer, Integer>> mp1 = tablo.entrySet();
        int day = 0;
        for (Map.Entry<Integer, Integer> me : mp1) {
            day++;
            System.out.println("***День " + day + "\n Спожив :" + me.getKey() + "\t******\tВитратив :" + me.getValue());
            sum += (me.getKey() - me.getValue());

        }
        if (tablo.size() > 0) {
            if (sum < 0 ) {
                System.out.println("Ви втратили  " + sum + "\nЦе погано  :( ");
            } else  {
                System.out.println("Ви набрали " + sum + "непогано :) ");
            }
        }else {
            System.out.println("Історія пуста :)");
        }
    }

    void historiFail() throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter("D:/13.txt"));
        writer.println(tablo.size());
        for (Map.Entry<Integer, Integer> entry : tablo.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());
        }

        writer.close();
    }

    void historiClean() throws IOException {
        tablo.clear();


    }

    void historiOpenFile() throws IOException {
        Map<Integer, Integer> savedContacts = new HashMap<>();
        Scanner scanner = new Scanner(new File("D://13.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            Integer name = Integer.valueOf(scanner.nextLine());
            Integer phone = Integer.valueOf(scanner.nextLine());
            savedContacts.put(name, phone);

        }
        tablo.putAll(savedContacts);

    }


//    void Record() {
//
//        int day = 0;
//        Set<Map.Entry<Integer, Integer>> mp1 = tablo.entrySet();
//        for (Map.Entry<Integer, Integer> me : mp1) {
//            day++;
//            System.out.println("Сьогодні " + tablo.size() + " день \t");
//            System.out.println("Я набрав " + me.getKey() + " Калорій | Витратив " + me.getValue());
//            nabr += me.getKey();
//            vitrat += me.getValue();
//            System.out.println("Cума калорій на сьгонді =" + (nabr - vitrat));
//
//        }
//    }

}