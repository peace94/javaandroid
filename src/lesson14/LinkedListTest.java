package lesson14;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> collections = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            collections.add("afdasdfas"+i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            collections.get(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2-startTime2);
    }
}
