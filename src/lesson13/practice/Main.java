package lesson13.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите название страны:");
        Scanner scanner = new Scanner(System.in);
        String inputCountry = scanner.next();
        AbstractCountry country = null;
        if (inputCountry.equalsIgnoreCase("Германия")) {
            country = new Germany();
            country.setKolvoKurortov(2);
            country.setNaselenie(123);
            country.setCapital("2312");
            country.setPloshad(2133222);
            country.setVisa(true);
        }
        if (inputCountry.equalsIgnoreCase("Италия")) {
            country = new Italy();
            country.setKolvoKurortov(2);
            country.setNaselenie(123);
            country.setCapital("2312");
            country.setPloshad(2133222);
            country.setVisa(true);
        }
        System.out.println("что вы хотите узнать о стране?");
        System.out.println("1 - население");
        System.out.println("2 - площадь");
        System.out.println("3 - курорты");
        System.out.println("4 - Столица");
        System.out.println("5 - виза");
        int inputAction = scanner.nextInt();
        switch (inputAction){
            case 1:
                country.printNaselenie();
                break;
            case 2:
                country.printPloshad();
                break;
            case 3:
                country.printKolvoKurortov();
                break;
            case 4:
                break;
            case 5:

                break;
                default:
                    System.out.println("Неверно введено число");

        }

    }
}
