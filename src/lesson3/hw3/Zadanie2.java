package lesson3.hw3;

public class Zadanie2 {
    public static void main(String[] args) {
        double vklad = 10000;
        int let = 7;
        double procent = 0.09;
        double vsegoDeneg = vklad;
        for (int i = 0; i < let; i++) {
            vsegoDeneg = vsegoDeneg + vsegoDeneg * procent;
        }
        System.out.println(vsegoDeneg - vklad);
    }
}
