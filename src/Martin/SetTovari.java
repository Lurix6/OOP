
package Martin;

/**
 * Created by Администратор on 07.12.2015.
 */

class Product{


    String tovar;
    int price;

    Product( String t , int p ){

        tovar = t;
        price = p;

    }

    public String toString(){
        return   tovar +"\t" + price;
    }


}

