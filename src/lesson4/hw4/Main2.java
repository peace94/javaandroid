package lesson4.hw4;

    public class Main2 {
        public static void main(String[] args) {
            int[] mass1 = {4, 6, 8, 3, 9};
            int[] mass2 = new int[mass1.length];
            for (int i = 0; i < mass1.length; i++) {
                if (i == mass1.length - 1) {
                    mass2[i] = mass1[0];
                } else {
                    mass2[i] = mass1[i + 1];
                }
            }
            for (int i = 0; i < mass2.length; i++) {
                System.out.println(mass2[i]);
            }
        }
    }
