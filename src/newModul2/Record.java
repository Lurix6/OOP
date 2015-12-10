package newModul2;

/**
 * Created by Вася on 03.12.2015.
 */

import java.io.*;
import java.util.*;

/**
 * Created by Вася on 28.11.2015.
 */
public class Record {
    Integer sum = 0;

    Map<Integer, Integer> tablo = new LinkedHashMap<>();
    Map<String, Integer> spisikStrav = new HashMap<>();
    Map<String , Integer> mainMenu = new LinkedHashMap<>();

    //додає звіти в tablo
    void addKalorijBaza(Integer kalorAdd, Integer kalorVit) {
        tablo.put(kalorAdd, kalorVit);
    }

    //Відображає історію
    void histori() {
        Set<Map.Entry<Integer, Integer>> mp1 = tablo.entrySet();
        int day = 0;
        for (Map.Entry<Integer, Integer> me : mp1) {
            day++;
            System.out.println("***День " + day + "\n Спожив :" + me.getKey() + "\t******\tВитратив :" + me.getValue());
            sum += (me.getKey() - me.getValue());


        }
        if (tablo.size() == 0) {
            System.out.println("Історія пуста :)");
        }
    }

            //читає та записує історію в tablo
    void historiOpenFile() throws IOException {
        Map<Integer, Integer> savedContacts = new HashMap<>();
        Scanner scanner = new Scanner(new File("src/res/histori.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            int name = Integer.parseInt(scanner.nextLine());
            int phone = Integer.valueOf(scanner.nextLine());
            savedContacts.put(name, phone);
            tablo.putAll(savedContacts);

        }
    }

    //читає історію histori
    void historiFail() throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter("src/res/histori.txt"));
        writer.println(tablo.size());
        for (Map.Entry<Integer, Integer> entry : tablo.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());
        }

        writer.close();
    }

    // очищає історію відвдувань histori
    void historiClean() throws IOException {
        tablo.clear();


        //очищає історію 2
    }void cleanSpisokStrav() throws IOException {
        spisikStrav.clear();


    }


// Робота над збережиними стравами та доданими новим контактом

    //Витягає додані страви і кидаємо іх в spisokStrav
    void historiOpenFileSpisokStrav() throws IOException {
        Map<String, Integer> savedContacts = new HashMap<>();
        Scanner scanner = new Scanner(new File("src/res/2.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String strava = scanner.nextLine();
            int kalorij = Integer.valueOf(scanner.nextLine());
            savedContacts.put(strava, kalorij);

        }
        spisikStrav.putAll(savedContacts);
    }

    //записує нові страви в іторію histori З spisokStrav
    void readMySpisikStrav() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("src/res/2.txt"));
        writer.println(spisikStrav.size());
        for (Map.Entry<String, Integer> entry : spisikStrav.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());
        }

        writer.close();


    }

    // додає нові страви в колекцію spisokStrav
    void addFoodForSpisokStrav(String newFood, Integer kalorija) throws FileNotFoundException {
        spisikStrav.put(newFood, kalorija);
    }

    // виводит на екран колекцію pisokStrav
    void openFoodForSpisokStrav() {
        for (Map.Entry<String, Integer> entry : spisikStrav.entrySet()) {
            System.out.println(entry.getKey() + " -\t " + entry.getValue());
        }
    }



     //Експорт pisokStrav
    void readFoodsFul() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/res/ful.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String strava = scanner.nextLine();
            Integer kalorija = Integer.parseInt(scanner.nextLine());
            mainMenu.put(strava, kalorija);

        } mainMenu.putAll(spisikStrav);
    }
    //записуємо MySpisikStrav в MainMenu на (src/res/ful.txt)
    void  writeMySpisikStravInMainMenu() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("src/res/ful.txt"));
        writer.println(mainMenu.size());
        for (Map.Entry<String, Integer> entry : mainMenu.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());
        }

        writer.close();


    } void  feil() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("src/res/ful.txt"));
        writer.println(spisikStrav.size());
        for (Map.Entry<String, Integer> entry : spisikStrav.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());
        }

        writer.close();


    }

    void delitDataFromMainManu(){
        mainMenu.clear();
    }



}




