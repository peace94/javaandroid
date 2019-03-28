package lesson17;

import java.util.HashMap;
import java.util.Set;

public class Holodilnik {
    private HashMap<String, Integer> producti = new HashMap<>();
    private int emkost = 50;

    public void addProduct(String product, int skolko) {
        if (producti.containsKey(product)) {
            int currentValue = producti.get(product);
            int newValue = currentValue + skolko;
            producti.put(product, newValue);
        } else {
            producti.put(product, skolko);
        }
    }

    public void deleteProduct(String product, int skolko) {
        if (!producti.containsKey(product)) {
            System.out.println("Такого продукта в холодильнике нет");
            return;
        }
        int currentValue = producti.get(product);
        if (skolko > currentValue) {
            System.out.println("вы запрашиваете больше ,чем есть в холодильнике");
            return;
        }
        int newValue = currentValue - skolko;
        if (newValue == 0) {
            producti.remove(product);
        } else {
            producti.put(product, newValue);
        }
    }

    public void printListProduct() {

        Set<String> productsName = producti.keySet();
        for (String s : productsName) {
            System.out.printf("%s - %d кг", s, producti.get(s));
            System.out.println();
        }
    }
}
