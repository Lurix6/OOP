package newModul2;

import java.io.*;
import java.util.*;

/**
 * Created by ���� on 03.12.2015.
 */
public class Foods {

    Map<String, Integer> mainMenu = new TreeMap<>();
    Map<String, Integer> searchFoods = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    // Читає всі страви з файла ful і записує іх і mainMenu
    void readFoods() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/res/ful.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String strava = scanner.nextLine();
            Integer kalorija = Integer.parseInt(scanner.nextLine());
            mainMenu.put(strava, kalorija);
        }
    }


    void searchFood(String searchFood) {
        for (Map.Entry<String, Integer> entry : mainMenu.entrySet()) {
            if (entry.getKey().contains(searchFood)) {
                searchFoods.put(entry.getKey(), entry.getValue());
                System.out.println(searchFoods.size() + "" + entry.getKey() + "  \t " + entry.getValue());
                nextSearchFood(); }

        }

    }
    void nextSearchFood(){
        if(searchFoods.size() ==0){
            System.out.println("Вбазі немає такої страви");

        }else {
        System.out.println("Оберіть щось ");
        String element = sc.nextLine();
        searchFood1(element);
            prijoim(true);
        }

    }

    // виводит на екран mainMenu
    void readMainMenu() {
        for (Map.Entry<String, Integer> entry : mainMenu.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    int kalorij = 0;

    void searchFood1(String elment) {
        for (Map.Entry<String, Integer> entry : mainMenu.entrySet()) {
            if (entry.getKey().contains(elment)) {

                kalorij = entry.getValue();
                System.out.println(" страву додано");
            }
        }
    }

    int setKalorij() {

        return kalorij;
    }
    boolean res =false;
    void prijoim(boolean ser) {
        this.res = ser;
    }boolean getOtvet(){
        return res;
    }


}



