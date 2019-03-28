package lesson9.hw;

public class Game {
    String genre;
    int year;
    String publisher;
    int gameTime;

    public Game() {

    }

    public Game(int year) {
        this.year = year;
    }

    public Game(int year, String publisher) {
        this.year = year;
        this.publisher = publisher;
    }

    public Game(int year, String publisher, String genre) {
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
    }

    public Game(int year, String publisher, String genre, int gameTime) {
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.gameTime = gameTime;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGameTime(int gameTime) {
        this.gameTime = gameTime;
    }

    public int getGameTime() {
        return gameTime;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }
}
