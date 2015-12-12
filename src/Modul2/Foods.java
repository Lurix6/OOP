package Modul2;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Вася on 28.11.2015.
 */
public class Foods {
    Map<String, Integer> savedFood = new TreeMap<>();

    Integer addCalor;
    String strava;
    Record rek = new Record();
    Map<String, Integer> novaStravaMap = new TreeMap<>();
    Dialog dia = new Dialog();

    void novaStrava(String strava, Integer calor) throws IOException {
        this.addCalor = calor;
        this.strava = strava;


        novaStravaMap.put(strava, addCalor);

        PrintWriter writer = new PrintWriter(new FileWriter("D:/modul2/new/novaStrava.txt"));
        for (Map.Entry<String, Integer> entry : novaStravaMap.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());
        }

        writer.close();
        savedFood.putAll(novaStravaMap);
    }


    void poshook() throws FileNotFoundException {


        String name = null;
        Integer kalor = null;


        Scanner scanner = new Scanner(new File("D:/modul2/new/ful.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            name = scanner.nextLine();
            kalor = scanner.nextInt();

        }
        savedFood.put(name, kalor);

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (Map.Entry<String, Integer> entry : savedFood.entrySet()) {
            if (entry.getKey().contains(s)) {
                System.out.println(entry.getKey() + "- " + entry.getValue());
                rek.addKalorijBaza(Integer.valueOf(entry.getValue()), dia.kalorVitra);

            }
        }
    }


    void menu() throws IOException {


        for (Map.Entry<String, Integer> entry : savedFood.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}






