package newModul2;

/**
 * Created by Вася on 04.12.2015.
 */
public class Profil {

    int normakalor (int weight, int height, int age){

        int normaKalor = (int) (655 + (9.6 * weight) + (1.8 * height) - (4.7 * age));
        return normaKalor;
    }
}
