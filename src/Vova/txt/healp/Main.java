package Vova.txt.healp;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Вася on 05.12.2015.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        RozkladList rozklad = new RozkladList();
        rozklad.addFoodEntry(new FoodEntry("Понеділок", 1 ,"Інженерна графіка" ,"Марян",3));
        rozklad.addFoodEntry(new FoodEntry("Понеділок", 2 ,"Фізика лекція" ,"Конопльов",4));
        rozklad.addFoodEntry(new FoodEntry("Понеділок", 3 ,"Англійська" ,"Ленган",4));
        rozklad.addFoodEntry(new FoodEntry("Понеділок", 4 ,"Немає пари" ,"",5));
        rozklad.addFoodEntry(new FoodEntry("Понеділок", 5 ,"Немає пари" ,"",5));
        rozklad.addFoodEntry(new FoodEntry("Вівторок", 1 ,"Фізкольтура" ,"Невідомо",4));
        rozklad.addFoodEntry(new FoodEntry("Вівторок", 2 ,"Фізичний мрактикум" ,"Конопльов",4));
        rozklad.addFoodEntry(new FoodEntry("Вівторок", 3 ,"Фізичний практикум" ,"Конопльов",4));
        rozklad.addFoodEntry(new FoodEntry("Вівторок", 4 ,"Немає пари" ,"",5));
        rozklad.addFoodEntry(new FoodEntry("Вівторок", 5 ,"Немає пари" ,"",5));
        rozklad.addFoodEntry(new FoodEntry("Середа", 1 ,"Немає пари" ,"",5));
        rozklad.addFoodEntry(new FoodEntry("Середа", 2 ,"Вища математика" ,"Карбованець",4));
        rozklad.addFoodEntry(new FoodEntry("Середа", 3 ,"БЖД" ,"Росола",3));
        rozklad.addFoodEntry(new FoodEntry("Середа", 4 ,"Вступ в інформаційну беспеку" ,"Трофілов",4));
        rozklad.addFoodEntry(new FoodEntry("Середа", 5 ,"Програмування" ,"Данилюк",5));
        rozklad.addFoodEntry(new FoodEntry("Четвер", 1 ,"Англійська" ,"Ленган",4));
        rozklad.addFoodEntry(new FoodEntry("Четвер", 2 ,"Програмування" ,"Данилюк",5));
        rozklad.addFoodEntry(new FoodEntry("Четвер", 3 ,"Немає пари" ,"",5));
        rozklad.addFoodEntry(new FoodEntry("Четвер", 4 ,"Лаболаторна з Інженерної та комп'ютерної графіки (15:00)" ,"Мисло",4));
        rozklad.addFoodEntry(new FoodEntry("Четвер", 5 ,"Немає пари" ,"",5));
        rozklad.addFoodEntry(new FoodEntry("Пятниця", 1 ,"Вища математика" ,"Гайсак",3));
        rozklad.addFoodEntry(new FoodEntry("Пятниця", 2 ,"Фізика" ,"Конопльов",4));
        rozklad.addFoodEntry(new FoodEntry("Пятниця", 3 ,"Немає пари" ,"",5));
        rozklad.addFoodEntry(new FoodEntry("Пятниця", 4, "Немає пари", "", 5));
        rozklad.addFoodEntry(new FoodEntry("Пятниця", 5, "Немає пари", "", 5));



        rozklad.saveToFile();
        rozklad.open();

        rozklad.loadFromFile();
        System.out.println("Вкажіть шуканий день");
        String days = sc.nextLine();
        rozklad.findFromList(days);

    }

}

