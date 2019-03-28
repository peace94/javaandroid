package lesson14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("qerwet");
        texts.add("qerwsdas");
        texts.add("qerxcv");
        texts.add("qer214");
        texts.add("qwervazxcvt");
        texts.add("qnggf");

        texts.add(0,"!!!!!!!");
        texts.set(0,"+++++");

        System.out.println(texts);

    }
}
