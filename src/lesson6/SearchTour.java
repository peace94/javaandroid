package lesson6;

public class SearchTour {
    public static void printTourByCountry(String country, String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            if (country.equalsIgnoreCase(tours[i][0])) {
                for (int j = 0; j < tours[i].length; j++) {
                    if (j == tours[i].length - 1) {
                        System.out.print(tours[i][j]);
                    } else {
                        System.out.print(tours[i][j] + ", ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void printTourByStar(String star, String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][3].equalsIgnoreCase(star)) {
                for (int j = 0; j < tours[i].length; j++) {
                    if (j == tours[i].length - 1) {
                        System.out.print(tours[i][j]);
                    } else {
                        System.out.print(tours[i][j] + ", ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void printTourByCena(int cena1, int cena2, String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            if ((Integer.parseInt(tours[i][1]) >= cena1) && (Integer.parseInt(tours[i][1]) <= cena2)) {
                for (int j = 0; j < tours[i].length; j++) {
                    if (j == tours[i].length - 1) {
                        System.out.print(tours[i][j]);
                    } else {
                        System.out.print(tours[i][j] + ", ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void printSevenDayTours(String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][2].equalsIgnoreCase("7 дней")) {
                for (int j = 0; j < tours[i].length; j++) {
                    if (j == tours[i].length - 1) {
                        System.out.print(tours[i][j]);
                    } else {
                        System.out.print(tours[i][j] + ", ");
                    }
                }
                System.out.println();
            }

        }
    }

    public static void printPansionatTours(String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][4].equalsIgnoreCase("Пансионат")) {
                for (int j = 0; j < tours[i].length; j++) {
                    if (j == tours[i].length - 1) {
                        System.out.print(tours[i][j]);
                    } else {
                        System.out.print(tours[i][j] + ", ");
                    }
                }
                System.out.println();
            }

        }
    }

    public static void printSummaCen(String[][] tours) {
        int sum = 0;
        for (int i = 0; i < tours.length; i++) {
            sum=sum+Integer.parseInt(tours[i][1]);
        }
        System.out.println(sum);
    }


}

