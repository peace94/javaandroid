package lesson3;

public class MainMassivi {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] numbersOne = new int[7];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(numbers[4]);
    }
}
