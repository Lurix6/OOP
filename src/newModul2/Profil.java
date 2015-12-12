package newModul2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ���� on 04.12.2015.
 */
public class Profil {
    private static String getName;
    private static Integer getnormaKalor;
    Map<String, Integer> profi = new HashMap<>();

    public static final File FILE = new File("src/res/profilnew.txt");
    private static Integer saveGetNormaKalor;
    private static String name;
    Scanner sc = new Scanner(System.in);

/**
 Реєстрація створення профіля і обрахування нори калорій для профіля
  */
    void profil() {
        System.out.println("Щоб розпочати роботу створвть новий профіль\nДля початку введіть своє ім'я");
        name = sc.nextLine();
        System.out.println("Скільки вам років?");
        int age = sc.nextInt();
        System.out.println("Скільки ви важете ?");
        int weight = sc.nextInt();
        System.out.println("Який ваш ріст");
        int height = sc.nextInt();
        Integer normaKalor = (int) (655 + (9.6 * weight) + (1.8 * height) - (4.7 * age));
        getName = name;
        getnormaKalor = normaKalor;
        profi.put(getName(), getNormaKalor());


    }
    /**
     Записуємо дані з мапи profi в txt
     */
    void wreeteProf() throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter(FILE));
        writer.println(profi.size());
        for (Map.Entry<String, Integer> entry : profi.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());
        }

        writer.close();


    }/**
     Очищаємо мапу profi i записуємо в profilnew.txt попожню мапу
     */

    void delitProfil() throws IOException {
        profi.clear();
        wreeteProf();
    }

    /**
     * Вичитуємо дання з profilnew.txt і виносимо їх в публічний доступ
     */
    void readProfil() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(String.valueOf(FILE)));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String name = scanner.nextLine();
            Integer norma = Integer.parseInt(scanner.nextLine());
            profi.put(name, norma);
            getName = name;
            getnormaKalor = norma;
        }
    }


    String getName() {
        return getName;
    }

    Integer getNormaKalor() {
        return getnormaKalor;
    }


}
