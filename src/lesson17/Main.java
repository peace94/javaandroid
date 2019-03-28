package lesson17;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> holodilnik = new HashMap<>();
        holodilnik.put("Apple",2);
        holodilnik.put("Pear",6);
        holodilnik.put("Cabbage",5);
        holodilnik.put("Carrot",8);
        holodilnik.put("Peach",3);
        holodilnik.put("Grapefruit",2);
        holodilnik.put("Apple",3); //будет apple 3 , ибо он перезаписывает
        System.out.println(holodilnik);
        Set<String> keys = holodilnik.keySet();
        for (String s:
             keys) {
            System.out.println(s);
        }
    }
}
