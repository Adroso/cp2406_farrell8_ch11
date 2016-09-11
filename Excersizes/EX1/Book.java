package EX1;

import javax.swing.*;

/**
 * Created by Adroso360 on 11/09/2016.
 */
public abstract class Book {
    String bookName = new String();
    double bookPrice;

    public Book(String ti){
        bookName = ti;
    }


    public String getbookName() {
        return bookName;
    }

    public double getPrice() {
        return bookPrice;
    }
    public abstract void setPrice();
}