package lesson3.hw3;

public class Zadanie3 {
    public static void main(String[] args) {
        /*int[] drb1 = {1, 8};
        int[] drb2 = {2, 6};
        int zn1 = drb1[1]; //в этой переменной получится общий знаменатель
        int zn2 = drb2[1];
        while (zn2 != 0) {
            int tmp = zn1 % zn2;
            zn1 = zn2;
            zn2 = tmp;
        }
        System.out.println(drb1[1] / zn1 * drb2[1]);*/
        int z1 = 22;
        int z2 = 8;
        for (int i = 1; i > 0; i++) {
            if (i % z1 == 0 && i % z2 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
