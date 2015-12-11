package testing.Tester;

import java.util.Scanner;

/**
 * Created by Вася on 11.12.2015.
 */
public class Rozklad {
    Scanner sc = new Scanner(System.in);
    private String day;
    private Integer para;
    private String predmet;
    private String vikladach;
    private String ocinca;

    public Rozklad (String day, Integer para , String vikladach , String predmet, String ocinca){
        this.day = day;
        this.para = para;
        this.vikladach = vikladach;
        this.predmet = predmet;
        this.ocinca = ocinca;

    }


    public String getVikladach() {
        return vikladach;
    }

    public void setVikladach(String vikladach) {
        this.vikladach = vikladach;
    }

    public String getPredmet() {

        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getOcinca() {

        return ocinca;
    }

    public void setOcinca(String ocinca) {
        this.ocinca = ocinca;
    }

    public Integer getPara() {

        return para;
    }

    public void setPara(Integer para) {
        this.para = para;
    }

    public String getDay() {

        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
