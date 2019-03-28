package lesson9;

public class Book {
    private int Pages;
    private String nazvanie;
    private String author;
    private int cena;
    private int godIzdaniya;

    public Book() {
    }

    public Book(String n, String a) {
        nazvanie = n;
        author = a;
    }

    public Book(int p, String n, String a, int c, int g) {
        Pages = p;
        nazvanie = n;
        author = a;
        cena = c;
        godIzdaniya = g;
    }
    public void pechat (){
        System.out.println("Название книги"+nazvanie+"автор"+author);
        System.out.printf("Название кинги - %s, автор - %s",nazvanie,author);

    }
}
