package lesson5;

public class Main1 {
    public static void main(String[] args) {
        int[][] numbers = {{2, 3, 4, 6}, {2, 5, 8, 3}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
