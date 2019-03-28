package lesson6;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день, как вас зовут?");
        String inputName = scanner.nextLine();
        System.out.println("Privet "+inputName);
        System.out.println("Kak dela?");
        String inputDela = scanner.nextLine();
        if (inputDela.equalsIgnoreCase("horosho")) {
            System.out.println("Отлично, так держать");
        } else {
            System.out.println("не переживай");
        }

    }
}
