package newModul2;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ���� on 04.12.2015.
 */
public class Profil {
    double normaKalorFinal;
    String getName;
    Integer getnormaKalor;
    Map<String, Integer> profi;

    private String name;
    Scanner sc = new Scanner(System.in);



    void profil() {
        System.out.println("Щоб розпочати роботу створвть новий профіль\nДля початку введіть своє ім'я");
        name = sc.nextLine();
        System.out.println("Скільки вам років?");
        int age = sc.nextInt();
        System.out.println("Скільки ви важете ?");
        int weight = sc.nextInt();
        System.out.println("Який ваш ріст");
        int height = sc.nextInt();
        int normaKalor = (int) (655 + (9.6 * weight) + (1.8 * height) - (4.7 * age));
            getName = name;
            getnormaKalor = normaKalor;


        }

    void readProf() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("src/res/profil.txt"));
        writer.println(profi.size());
        for (Map.Entry<String, Integer> entry : profi.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());
        }

        writer.close();


    }
    void readFoodsFul() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/res/profil.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String strava = scanner.nextLine();
            Integer kalorija = Integer.parseInt(scanner.nextLine());
            profi.put(strava, kalorija);

        }
    }


    String getName() {
        return getName;
    }

    Integer getNormaKalor() {
        return getnormaKalor;
    }


}
