package net.YellowDuck.Leson1.PractechnaPara.Practichna.TreeMapModern;

import java.util.Scanner;

/**
 * Created by Вася on 26.11.2015.
 */
public class Main extends TreeMapPhoneBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMapPhoneBook pb = new TreeMapPhoneBook();
        Test test = new Test();
        test.Pitanja();
        for (int i = 0; ; i++) {

            String otvet = sc.next();
            if (otvet.equalsIgnoreCase("Додати")) {
                pb.add();
            } else if (otvet.equalsIgnoreCase("Пошук")) {
                pb.poshuk();
            } else if (otvet.equalsIgnoreCase("Редрагувати")) {
                pb.redrag();
            } else if (otvet.equalsIgnoreCase("Вийти")) {
                System.exit(0);
            } else if(otvet.equalsIgnoreCase("Видалити")){
                pb.delit();
            }else {
                System.out.println("Повторіть введення :");
                System.out.println();
            }
            test.Pitanja();

        }
    }
}
