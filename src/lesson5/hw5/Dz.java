package lesson5.hw5;

public class Dz {
    public static void main(String[] args) {
        int sum = 0;
        int[][] numbers = {{8, 6, 3, 7}, {2, 5, 17, 18},{8,15,23,16}};
        //второе задание
        /*for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum = sum + numbers[i][j];
            }
        }
        System.out.println(sum);*/
        //первое задание
        int stlb = 1;
        int strk = -2;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                L:
                for (int k = 0; k < numbers.length; k++) {
                    for (int l = 0; l < numbers[i].length; l++) {

                        if (numbers[i][j] >= numbers[k][l]) {
                            if (numbers[i][j] % numbers[k][l] == 0) {
                                if (j == l && i == k) {
                                    stlb = -1;
                                    strk = -1;
                                } else {
                                    stlb = j;
                                    strk = i;
                                    break L;
                                }
                            } else {
                                stlb = -1;
                                strk = -1;
                            }
                        } else if (numbers[k][l] % numbers[i][j] == 0) {
                            if (j == l && i == k) {
                                stlb = -1;
                                strk = -1;
                            } else {
                                stlb = j;
                                strk = i;
                                break L;
                            }
                        } else {
                            stlb = -1;
                            strk = -1;
                        }
                    }
                }
                if (stlb == -1 && strk == -1) {
                    System.out.print("_" + " ");
                } else {
                    System.out.print(numbers[strk][stlb] + " ");
                }

            }
            System.out.println();
        }

    }
}
