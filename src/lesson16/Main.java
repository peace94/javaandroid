package lesson16;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Tovar> tovary = new HashSet<>();
        Tovar tovar1 = new Tovar(12, 1700, "tovar", 2, 4, 5);
        Tovar tovar2 = new Tovar(52, 1200, "bovar", 5, 12, 4);
        Tovar tovar3 = new Tovar(122, 200, "zovar", 1, 71, 3);
        Tovar tovar4 = new Tovar(15, 1900, "qovar", 3, 64, 1);
        Tovar tovar5 = new Tovar(1, 100, "iovar", 7, 123, 2);
        Tovar tovar6 = new Tovar(67, 1900, "kovar", 4, 98, 5);
        tovary.add(tovar1);
        tovary.add(tovar2);
        tovary.add(tovar3);
        tovary.add(tovar4);
        tovary.add(tovar5);
        tovary.add(tovar6);
        SortingTovars.sortByStrings(tovary);
    }
}
