package lesson4.hw4;

public class Zadanie {
    public static void mensheeis4(int a, int b, int c, int d) {
        if (a <= b && a <= c && a <= d) {
            System.out.println(a);
        } else if (b <= a && b <= c && b <= d) {
            System.out.println(b);
        } else if (c <= a && c <= b && c <= d) {
            System.out.println(c);
        } else System.out.println(d);

    }

    public static void printChisel(int count, int print) {
        for (int i = 0; i < count; i++) {
            System.out.println(print);
        }
    }

    public static void printChetMass(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }

    public static void printSymbols(char[] a) {
        for (int i = 0; i < a.length; i = i + 2) {
            System.out.println(a[i]);
        }
    }
}
