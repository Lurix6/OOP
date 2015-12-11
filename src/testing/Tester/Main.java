package testing.Tester;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Вася on 11.12.2015.
 */
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Work work = new Work();
    private static ArrayList<Rozklad> list = new ArrayList<Rozklad>();

    public static void main(String[] args) {


        for (int i = 0 ; ; i++){
            System.out.println("Щоб додати Звіт Введіть (додати) також можна вивести на екран наявні (елементи)\n бо очистити (історію) Витягти окремий (день)");
            String otvet = sc.nextLine();
            if(otvet.equalsIgnoreCase("додати")){
                work.add();
                try {
                    saveToFile();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }if (otvet.equalsIgnoreCase("елементи")) {
                for (Rozklad m : list) {
                    System.out.println(m.getDay() + " " + m.getPara() + " " + m.getPredmet() + " " + m.getVikladach() + " " + m.getOcinca()); // àáäûðäà
                }

            }if (otvet.equalsIgnoreCase("історію")){
                list.clear();
            }if(otvet.equalsIgnoreCase("день")){
                System.out.println("Вкажіть день");
                String day = sc.nextLine();
                if (list.contains(day)){
                    int index = list.indexOf(day);

                    System.out.println(list.get(index));
                }else {
                    System.out.println("такого елемента немає в базі");
                }

            }
        }



//        list.add(new Rozklad("Понеділок", 1, "Інженерна графіка", "Марян", "B"));
//        list.add(new Rozklad("Понеділок", 2, "Фізика лекція", "Конопльов", "A"));
//        list.add(new Rozklad("Понеділок", 3, "Англійська", "Ленган", "C"));
//        list.add(new Rozklad("Понеділок", 4, "Немає пари", "", "D"));
//        list.add(new Rozklad("Понеділок", 5, "Немає пари", "", "A"));
//        list.add(new Rozklad("Вівторок", 1, "Фізкольтура", "Невідомо", "B"));
//        list.add(new Rozklad("Вівторок", 2, "Фізичний мрактикум", "Конопльов", "C"));
//        list.add(new Rozklad("Вівторок", 3, "Фізичний практикум", "Конопльов", "B"));
//        list.add(new Rozklad("Вівторок", 4, "Немає пари", "", "D"));
//        list.add(new Rozklad("Вівторок", 5, "Немає пари", "", "C"));
//        list.add(new Rozklad("Середа ", 1, "Немає пари", "", "D"));
//        list.add(new Rozklad("Середа ", 2, "Вища математика", "Карбованець", "B"));
//        list.add(new Rozklad("Середа ", 3, "БЖД", "Росола", "C"));
//        list.add(new Rozklad("Середа ", 4, "Вступ в інформаційну беспеку", "Трофілов", "A"));
//        list.add(new Rozklad("Середа ", 5, "Програмування", "Данилюк", "B"));
//        list.add(new Rozklad("Четвер ", 1, "Англійська", "Ленган", "B"));
//        list.add(new Rozklad("Четвер ", 2, "Програмування", "Данилюк", "C"));
//        list.add(new Rozklad("Четвер", 3, "Немає пари", "", "D"));
//        list.add(new Rozklad("Четвер ", 4, "Лаболаторна з Інженерної та комп'ютер", "Мисло", "C"));
//        list.add(new Rozklad("Четвер", 5, "Немає пари", "", "C"));
//        list.add(new Rozklad("Пятниця ", 1, "Вища математика", "Гайсак", "A"));
//        list.add(new Rozklad("Пятниця ", 2, "Фізика", "Конопльов", "B"));
//        list.add(new Rozklad("Пятниця ", 3, "Немає пари", "", "D"));
//        list.add(new Rozklad("Пятниця ", 4, "Немає пари", "", "C"));
//        list.add(new Rozklad("Пятниця ", 5, "Немає пари", "", "D"));
//




    }
    void add(String day , Integer para, String predmet , String vicklad,String ocinka){

        list.add(new Rozklad(day,para,predmet,vicklad,ocinka));
        System.out.println("додано");
    }

    public static void saveToFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("Baza.txt");

//        writer.println(list.size());
        for (Rozklad entry : list) {
            writer.println(entry.getDay());
            writer.println(entry.getPara());
            writer.println(entry.getPredmet());
            writer.println(entry.getVikladach());
            writer.println(entry.getOcinca());
        }

        writer.close();
    }

    public static void loadFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner("Baza.txt");
        list.clear();
        int listSize = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < listSize; i++) {
            String day = scanner.nextLine();
            int para = Integer.parseInt(scanner.nextLine());
            String pred = scanner.nextLine();
            String vicl = scanner.nextLine();
            String ocinca = scanner.nextLine();
            Rozklad entry = new Rozklad(day, para,pred,vicl,ocinca);
            list.add(entry);
        }
    }


}


