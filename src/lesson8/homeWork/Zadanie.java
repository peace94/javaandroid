package lesson8.homeWork;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        int num1 = getInt();
        char operation = getOpertation();
        int num2 = getInt();
        System.out.println(calc(num1, num2, operation));

    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int chislo = Integer.parseInt(scanner.nextLine());
        return chislo;
    }

    public static char getOpertation() {
        Scanner scanner = new Scanner(System.in);
        char znak = scanner.nextLine().charAt(0);
        return znak;
    }

    public static int calc(int num1, int num2, char operation) {
        int itog = 0;
        if (operation == '+') {
            itog = num1 + num2;
        } else if (operation == '-') {
            itog = num1 - num2;
        } else if (operation == '*') {
            itog = num1 * num2;
        }
        return itog;
    }
}
