package testing.Tester;

import java.util.Scanner;

/**
 * Created by Вася on 11.12.2015.
 */
public class Work {
    Main m = new Main();
    public Scanner sc = new Scanner(System.in);

     void regrag(){
        System.out.println("Введіть день який ви бажаєте змінити");
        String day = sc.nextLine();
         System.out.println("Введіть пару (число)");
         Integer para = sc.nextInt();


    }
    public void add(){
        System.out.println("Вкажіть день");
        String day = sc.nextLine();
        System.out.println("Введіть пару (число)");
        Integer para = Integer.valueOf(sc.nextLine());
        System.out.println("Введіть предмет");
        String predmet1 = sc.nextLine();
        System.out.println("Введіть викладача ");
        String viklad = sc.nextLine();
        System.out.println("Введіть оцінку");
        String ocinca = sc.nextLine();
        m.add(day,para,predmet1,viklad,ocinca);
    }
}
