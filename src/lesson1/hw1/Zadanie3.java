package lesson1.hw1;

public class Zadanie3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 3;
        if (a == b && b == c) System.out.println("ravnostoronnii");
        else
            if ((a == b && b != c) || (a == c && b != c) || (b == c && a != c)) System.out.println("ravnobedrennii");
            else System.out.println("raznostoronnii");
    }
}

