package lesson15.hw;

import lesson14.CollectionUtilsImpl;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        int e=5;
        SetUtilsImpl utils = new SetUtilsImpl();
        Set<Integer> result = utils.customOrderSet(a,b,c,d,e);
        for (Integer num:
                result) {
            System.out.println(num);
        }

    }
}
