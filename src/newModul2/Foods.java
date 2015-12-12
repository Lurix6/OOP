package newModul2;

import java.io.*;
import java.util.*;

/**
 * Created by ���� on 03.12.2015.
 */
public class Foods {
    int sum = 0;
    static String strava;

    Record rek = new Record();
    Map<String, Integer> putAll = new LinkedHashMap<>();
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
    /**
     Функція виводить всі наявні страви За вказаними даними і переходит в nextSearchFood() .
     */

    void searchFood(String searchFood) {
        for (Map.Entry<String, Integer> entry : mainMenu.entrySet()) {
            if (entry.getKey().contains(searchFood)) {
                searchFoods.put(entry.getKey(), entry.getValue());
                System.out.println("" + entry.getKey() + "  \t " + entry.getValue());
            }

        }
        nextSearchFood();

    }

    /**
     Умовно приймає з функції  searchFood  список страв і дозволяє зробити вибір страви Якщо ви вибрали страву то вона кидає
     true в prijoim (true показник що функція пройшла успішно)
     */
    void nextSearchFood() {
        if (searchFoods.size() == 0) {
            System.out.println("Вбазі немає такої страви");

        } else {
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

    boolean res = false;

    void prijoim(boolean ser) {
        this.res = ser;
    }

    boolean getOtvet() {
        return res;
    }


    /**
     За допомогую цього метода можно додавати декілька страв за один день
     */

    void recurs() throws IOException {
        System.out.println("Введіть страву ");
        strava = sc.nextLine();
        searchFoods.clear();

        int sum1 = 0;

        for (Map.Entry<String, Integer> entry : mainMenu.entrySet()) {
            if (entry.getKey().contains(strava)) {
                searchFoods.put(entry.getKey(), entry.getValue());
                System.out.println("" + entry.getKey() + "  \t " + entry.getValue());
                sum1 += entry.getValue();
            }
        }
        if (searchFoods.size() == 1) {
            sum += sum1;
            System.out.println("Страву додано ");
            System.out.println("Якщо хочите додати ще страву то напишіть (так) інакше ми продовжимо збирати нові данні ????");
            String otvet = sc.nextLine();
            if (otvet.equals("так")) {
                recurs();

            }else{
                System.out.println("Скільки калорій ви витратили з а сьгоднішній день ");
                Integer kalorVitrat = sc.nextInt();

                rek.addKalorijBaza(sum, kalorVitrat);
                rek.historiFail();
            }
        } else if (searchFoods.size() >= 2) {
            System.out.println("Оберіть одну з цих страв");
            recurs();
            sum1 = 0 ;
        } else if (searchFoods.size() == 0) {
            System.out.println("В базі данних немає такої страви виберіть іншу");
            recurs();
            sum1 = 0;
        }

    }

}



