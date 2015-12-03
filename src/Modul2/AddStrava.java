package Modul2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Вася on 28.11.2015.
 */
public class AddStrava extends Food {
    void novaStrava(String Strava , Integer calor) throws IOException {

        Map<String, Integer> novaStrava = new TreeMap<>();
        novaStrava.put(Strava, calor);

        PrintWriter writer = new PrintWriter(new FileWriter("D:/modul2/new/novaStrava.txt"));
        for (Map.Entry<String, Integer> entry : novaStrava.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());
        }

        writer.close();
    }


}