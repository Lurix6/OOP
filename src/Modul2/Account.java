package Modul2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Вася on 01.12.2015.
 */
public class Account {

    Map<Integer, Integer> akaDataInteger = new HashMap<>();
    Map<String, String> akaDataString = new HashMap<>();
    ArrayList<Integer> akaDataInt = new ArrayList<>();
    ArrayList<String> akaDataStr = new ArrayList<>();


     String name;
     int age;
     int height;
     int weight;
     int normaKalor;



    void ak(String name, int age, int height, int weight) throws IOException {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        akaDataInteger.put(age, age);
        akaDataInteger.put(height, height);
        akaDataInteger.put(weight, weight);
        normaKalor = (int) (655 + (9.6 * weight) + (1.8 * height) - (4.7 * age));
        akaDataInteger.put(normaKalor, normaKalor);
        akaDataString.put(name, name);

//        PrintWriter writer = new PrintWriter(new FileWriter("D:/modul2/Aka/newAkaDataInteger.txt"));
//        for (Map.Entry<Integer, Integer> entry : akaDataInteger.entrySet()) {
//            writer.println(entry.getKey());
//            writer.println(entry.getValue());
//        }writer.close();
//        PrintWriter writer1 = new PrintWriter(new FileWriter("D:/modul2/Aka/newAkaDataString.txt"));
//        for (Map.Entry<String, String> entry1 : akaDataString.entrySet()) {
//            writer1.println(entry1.getKey());
//            writer1.println(entry1.getValue());
//        }
//
//        writer.close();

        OutputStream f = new FileOutputStream("D:/modul2/Aka/newAkaDataInt", true);
        OutputStreamWriter writer = new OutputStreamWriter(f);
        BufferedWriter out = new BufferedWriter(writer);
        for(int i = 0; i < akaDataInt.size(); i++)
        {
            out.write(akaDataInt.get(i));
            out.flush();
        }

        OutputStream f1 = new FileOutputStream("D:/modul2/Aka/newAkaDataStr", true);
        OutputStreamWriter writer1 = new OutputStreamWriter(f);
        BufferedWriter out1 = new BufferedWriter(writer);
        for(int i = 0; i < akaDataStr.size(); i++)
        {
            out1.write(akaDataStr.get(i));
            out1.flush();
        }

    }
    void readFile() throws FileNotFoundException {
        Map<Integer, Integer> integerData = new HashMap<>();
        Scanner scanner = new Scanner(new File("D:/modul2/Aka/newAkaDataInteger.txt"));
        int sizeInteger = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sizeInteger; i++) {
            Integer data = scanner.nextInt();
            Integer data1 = scanner.nextInt();
            integerData.put(data, data1);
        }
        Map<String, String> stringData = new HashMap<>();
        Scanner scanner1 = new Scanner(new File("D:/modul2/Aka/newAkaDataString.txt"));
        int sizeString = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sizeString; i++) {
            String dataString = scanner.nextLine();
            String dataString1 = scanner.nextLine();
            stringData.put(dataString, dataString1);
        }



    }void cleanAccount(){
        akaDataInteger.clear();
        akaDataString.clear();
    }


}




