package lesson1.hw1;

public class Zadanie2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(s);
    }

}
