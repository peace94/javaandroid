package lesson15;

import java.util.HashSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Coin moneta1 = new Coin(2.5,1990,2);
        Coin moneta2 = new Coin(1,1992,5);
        Coin moneta3 = new Coin(5,2000,6);
        Coin moneta4 = new Coin(2.5,1990,2);
        Coin moneta5 = new Coin(5,2007,9);

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(moneta1);
        coins.add(moneta2);
        coins.add(moneta3);
        coins.add(moneta4);
        coins.add(moneta5);
        for (Coin coin: coins) {
            System.out.println(coin);
        }
        System.out.println(moneta1.equals(moneta4));

    }
}
