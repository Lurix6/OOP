package Martin;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Вася on 08.12.2015.
 */

public class Main extends MapStore {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        MapStore tv = new MapStore();
        Menu menu = new Menu();
        menu.Entrance();

        for (int i = 0; ; i++) {

            String otvet = sc.next();
            if (otvet.equalsIgnoreCase("Додати")) {
                tv.Add();
            } else if (otvet.equalsIgnoreCase("Пошук за категоріями товару")) {
                tv.historiOpenFile();
                tv.poshuk();
            } else if (otvet.equalsIgnoreCase("Редрагувати")) {
                tv.historiOpenFile();
                tv.redrag();
            } else if (otvet.equalsIgnoreCase("Вийти")) {
                System.exit(0);
            } else if(otvet.equalsIgnoreCase("Видалити")){
                tv.historiOpenFile();
                tv.delit();
            }else {
                System.out.println("Повторіть введення :");
                System.out.println();
            }
            menu.Entrance();

        }

    }


}
