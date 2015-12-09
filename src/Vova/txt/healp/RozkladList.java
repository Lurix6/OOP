package Vova.txt.healp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Вася on 05.12.2015.
 */
public class RozkladList {
    private List<FoodEntry> rozklad = new ArrayList<>();

    public static final File FILE = new File("test.txt");


    public String findFromList(String day) {
        for (FoodEntry entry : rozklad) {
            if (entry.getDay().contains(day)) {
                int index = rozklad.indexOf(day);
                return entry + " " + rozklad.get(index) + " " + rozklad.get(index + 1) + " " + rozklad.get(index + 2) + " " + rozklad.get(index +3);
            }
        }
        return null;
    }

    public void addFoodEntry(FoodEntry entry) {
        rozklad.add(entry);
    }

    public void loadFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(FILE);


        int listSize = Integer.parseInt(scanner.nextLine());
        rozklad.clear();
        for (int i = 0; i < listSize; i++) {
            String day = scanner.nextLine();
            int para = Integer.parseInt(scanner.nextLine());
            String predmet = scanner.nextLine();
            String vicladach = scanner.nextLine();
            int ocincaStudenta = Integer.parseInt(scanner.nextLine());
            FoodEntry entry = new FoodEntry(day, para, predmet, vicladach , ocincaStudenta);



            rozklad.add(entry);
        }
    }

    void open (){for (int i = 0; i < rozklad.size(); i++) {
        System.out.println(rozklad.get(i));
    }
    }



    public void saveToFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(FILE);

        writer.println(rozklad.size());
        for (FoodEntry entry : rozklad) {
            writer.println(entry.getDay());
            writer.println(entry.getPara());
            writer.println(entry.getPredmet());
            writer.println(entry.getVikladach());
            writer.println(entry.getOcinkaStudenta());
        }

        writer.close();
    }

}

