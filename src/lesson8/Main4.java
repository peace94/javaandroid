package lesson8;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main4 {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        int summa = 0;
        for (int i = 0; i < 100000; i++) {
            summa = summa + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - currentTime);
        System.out.println(currentTime);
        Date d = new Date(currentTime);
        System.out.println(d);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd 'at' HH:mm:ss");
        System.out.println(dateFormat.format(currentTime));
    }
}
