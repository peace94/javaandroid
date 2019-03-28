package lesson3.hw3;

public class Zadanie1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
