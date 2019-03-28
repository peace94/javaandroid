package lesson6;


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String[][] tours = {{"Греция", "15000", "7 дней", "5 звёзд", "всё включено"},
                {"Италия", "10000", "5 дней", "3 звёзд", "Пансионат"},
                {"Турция", "18000", "8 дней", "4 звёзд", "Полупансионат"},
                {"Франция", "14000", "6 дней", "6 звёзд", "Пансионат"},
                {"Саратов", "1000", "7 дней", "1 звёзд", "всё сложно"},
                {"Италия", "500", "27 дней", "1 звёзд", "всё включено"},};
        /*System.out.println("в какую страну хотите поехать?");
        Scanner scanner = new Scanner(System.in);
        String inputCountry = scanner.nextLine();
        SearchTour.printTourByCountry(inputCountry,tours);
        System.out.println("Введите звёздность");
        String inputStar = scanner.nextLine();
        SearchTour.printTourByStar(inputStar,tours);
        System.out.println("Введите диапазон цены(через ентер)");
        int cena1 = Integer.parseInt(scanner.nextLine());
        int cena2 = Integer.parseInt(scanner.nextLine());
        SearchTour.printTourByCena(cena1,cena2,tours);*/
        SearchTour.printSevenDayTours(tours);
        SearchTour.printPansionatTours(tours);
        SearchTour.printSummaCen(tours);
    }
}
