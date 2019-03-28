package lesson8;

import java.sql.SQLOutput;

public class Main2 {
    public static void main(String[] args) {
        String text = "sdasda\" asd";
        int apple = 20;
        if (apple > 15) {
            System.out.println("enough");
        } else {
            System.out.println("not enuogh");
        }

        String result = (apple > 15) ? "enough" : "not enough";
        System.out.println(result);
    }
}
