package nadajilo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Вася on 12.12.2015.
 */
public class Rozklad {
    Scanner sc = new Scanner(System.in);
    public static Map<String, String> roz = new LinkedHashMap<>();
    public static Map<String, String> addroz = new LinkedHashMap<>();

    public static void main(String[] args) {
//        roz.put("Понеділок 1 ", "Інженерна графіка - Марян - B");
//        roz.put("Понеділок 2 ", "Фізика лекція - Конопльов -A");
//        roz.put("Понеділок 3 ", "Англійська - Ленган -C");
//        roz.put("Понеділок 4 ", "Немає пари");
//        roz.put("Понеділок 5 ", "Немає пари");
//        roz.put("Вівторок 1 ", "Фізкольтура -Невідомо - B");
//        roz.put("Вівторок 2 ", "Фізичний мрактикум - Конопльов - C");
//        roz.put("Вівторок 3 ", "Фізичний практикум - Конопльов - B");
//        roz.put("Вівторок 4 ", "Немає пари");
//        roz.put("Вівторок 5 ", "Немає пари");
//        roz.put("Середа  1 ", "Немає пари");
//        roz.put("Середа  2 ", "Вища математика - Карбованець - B");
//        roz.put("Середа 3 ", "БЖД - Росола - C");
//        roz.put("Середа 4 ", "Вступ в інформаційну беспеку - Трофілов - A");
//        roz.put("Середа  5 ", "Програмування - Данилюк - B");
//        roz.put("Четвер  1 ", "Англійська - Ленган - B");
//        roz.put("Четвер 2 ", "Програмування - Данилюк - C");
//        roz.put("Четвер 3 ", "Немає пари");
//        roz.put("Четвер 4 ", "Лаболаторна з Інженерної та комп'ютер - Мисло - B");
//        roz.put("Четвер 5 ", "Немає пари");
//        roz.put("Пятниця 1 ", "Вища математика - Гайсак - A");
//        roz.put("Пятниця  2 ", "Фізика - Конопльов - B");
//        roz.put("Пятниця 3 ", "Немає пари");
//        roz.put("Пятниця 4 ", "Немає пари");
//        roz.put("Пятниця 5 ", "Немає пари");
//
//        PrintWriter writer = null;
//        try {
//            writer = new PrintWriter("src/nadajilo/Baza.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        writer.println(roz.size());
//        for (Map.Entry<String, String> entry : roz.entrySet()) {
//            writer.println(entry.getKey());
//            writer.println(entry.getValue());
//        }
//
//        writer.close();
    }

    void historiOpenFile() throws IOException {
        Map<String, String> savedContacts = new HashMap<>();
        Scanner scanner = new Scanner(new File("src/nadajilo/Baza.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String key = scanner.nextLine();
            String valve = scanner.nextLine();

            savedContacts.put(key, valve);

        }
        roz.putAll(savedContacts);
    }

    void poshukDay() {
        System.out.println("Ведіть пару");
        Scanner consoleScanner = new Scanner(System.in);
        String s = consoleScanner.nextLine();

        for (Map.Entry<String, String> entry : roz.entrySet()) {
            if (entry.getKey().contains(s)) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

    }

    void poshukViclad() {
        System.out.println("Ведіть викладача , предмет");
        Scanner consoleScanner = new Scanner(System.in);
        String s = consoleScanner.nextLine();

        for (Map.Entry<String, String> entry : roz.entrySet()) {
            if (entry.getValue().contains(s)) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

    }


    public void addDay() {
        System.out.println();
        System.out.println("Вкажіть дeнь  ");
        String day = sc.nextLine();
        System.out.println("Введіть пару (число)");
        String para = sc.nextLine();
        System.out.println("Введіть предмет");
        String pred = sc.nextLine();
        System.out.println("Введіть Фамілію викладача");
        String name = sc.nextLine();
        System.out.println("Оцініть пару (A-F)");
        String ocinka = sc.nextLine();
        String key = day + " " + para;
        String value = pred + " - " + name + " - " + ocinka;

        addroz.put(key, value);

    }

    void show() {
        for (Map.Entry<String, String> entry : roz.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

    }

    void addddNew() throws FileNotFoundException {


        PrintWriter writer = new PrintWriter("src/nadajilo/Baza+1.txt");
        writer.println(addroz.size());
        for (Map.Entry<String, String> entry : addroz.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());
        }

        writer.close();
    }

    void showMyData() {
        for (Map.Entry<String, String> entry : addroz.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }

    void readDodani() throws FileNotFoundException {
        Map<String, String> savedContacts = new HashMap<>();
        Scanner scanner = new Scanner(new File("src/nadajilo/Baza+1.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String key = scanner.nextLine();
            String valve = scanner.nextLine();

            savedContacts.put(key, valve);

        }
        addroz.putAll(savedContacts);
    }
}






