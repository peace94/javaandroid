package lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(5);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(1);
        num2.add(7);
        num2.add(6);
        num2.add(5);

        CollectionUtilsImpl utils = new CollectionUtilsImpl();
        Collection<Integer> result1 = utils.union(num1, num2);
        System.out.println(result1);

        Collection<Integer> result2 = utils.intersection(num1, num2);
        System.out.println(result2);

        Collection<Integer> result3 = utils.unionWithoutDuplicate(num1, num2);
        System.out.println(result3);

        Collection<Integer> result4 = utils.intersectionWithoutDuplicate(num1, num2);
        System.out.println(result4);

        Collection<Integer> result5 = utils.difference(num1, num2);
        System.out.println(result5);
    }
}
