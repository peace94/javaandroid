package lesson2;

public class Main1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int c = 5;
        if (a == b && b == c && a == c){
            System.out.println("это равносторонний треугольник");
        }
        if (a!=b&&b!=c&&a!=c) System.out.println("это разносторонний треугольник");



    }
}
