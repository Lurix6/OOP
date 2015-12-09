package Vova.txt;

/**
 * Created by Вася on 08.12.2015.
 */
public class FoodEntry  {
    private String day;
    private Integer para;
    private String predmet;
    private String vikladach;


    public FoodEntry(String day, int para, String predmet, String vikladach) {
        this.day = day;
        this.para = para;
        this.predmet = predmet;
        this.vikladach = vikladach;
    }

    public FoodEntry(String day, int para) {   this.day = day;
        this.para = para;
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

    public int getPara() {

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
