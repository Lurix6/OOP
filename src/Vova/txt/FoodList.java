package Vova.txt;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Вася on 08.12.2015.
 */
public class FoodList  {

    private List<FoodEntry> List = new ArrayList<>();

    public static final File FILE = new File("src/Vova/txt/txt/text.txt");

    public FoodList(String понеділок, int i, String s, String марян) {
    }


    public FoodEntry findFromListDay(String day) {
        for (FoodEntry entry : List) {
            if (entry.getDay().equals(day)) {
                return entry;
            }
        }
        return null;
    }

    public void addFoodEntry(FoodEntry entry) {

        List.add(entry);
    }

    public void loadFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(FILE);


        int listSize = Integer.parseInt(scanner.nextLine());
        List.clear();
        for (int i = 0; i < listSize; i++) {
            String day = scanner.nextLine();
            int para = Integer.parseInt(scanner.nextLine());
            FoodEntry entry = new FoodEntry(day, para);

            String nextLine;

            nextLine = scanner.nextLine();
            if (!"null".equals(nextLine)) {
                entry.setPredmet(new String(nextLine));
            }

            nextLine = scanner.nextLine();
            if (!"null".equals(nextLine)) {
                entry.setVikladach(new String(nextLine));
            }


            List.add(entry);
        }
    }

    public void saveToFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(FILE);
//
//        writer.println(foodMap.size());
//        for (Map.Entry<String, FoodEntry> entry : foodMap.entrySet()) {
//            writer.println(entry.getValue().getTitle());
//            writer.println(entry.getValue().getCaloriesPer100g());
//        }

        writer.println(List.size());
        for (FoodEntry entry : List) {
            writer.println(entry.getDay());
            writer.println(entry.getPara());
            writer.println(entry.getPredmet());
            writer.println(entry.getVikladach());
        }

        writer.close();
    }

    void readFoodsFul() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/res/ful.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String day = scanner.nextLine();
            Integer para = Integer.parseInt(scanner.nextLine());
            String predmet = scanner.nextLine();
            String vicladach = scanner.nextLine();
//           List.add(day, para, predmet, vicladach);

        }
    }



}
