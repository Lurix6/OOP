package nadajilo;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Вася on 12.12.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Rozklad rozklad = new Rozklad();

        for (int i = 0; ; i++) {
            System.out.println("Щоб переглянути наявний розклад (перегляд)\nЩоб додати данні (додати)\nЩоб вийти з програми(вийти)\nЩоб знайти день або пару (пару)\nЩоб знайти викладача предмет (предмет)\nПерегляд історію доданих (звітів)");
            String otvet = sc.nextLine();
            if (otvet.equalsIgnoreCase("перегляд")) {
                try {
                    rozklad.historiOpenFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                rozklad.show();
            }
            if (otvet.equalsIgnoreCase("додати")) {
                rozklad.addDay();
                try {
                    rozklad.addddNew();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if (otvet.equalsIgnoreCase("вийти")) {
                System.exit(0);
            }
            if (otvet.equalsIgnoreCase("пару")) {
                rozklad.historiOpenFile();
                rozklad.poshukDay();
            }
            if (otvet.equalsIgnoreCase("предмет")) {
                rozklad.historiOpenFile();
                rozklad.poshukViclad();
            }if (otvet.equalsIgnoreCase("звіт")){
                rozklad.readDodani();
                rozklad.showMyData();
            }
        }
    }
}

