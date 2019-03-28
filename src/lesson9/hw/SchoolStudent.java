package lesson9.hw;

public class SchoolStudent {
    String kruzhok;
    double srOcenka;
    String name;
    int vozrast;

    public SchoolStudent() {

    }

    public SchoolStudent(double srOcenka) {
        this.srOcenka = srOcenka;
    }

    public SchoolStudent(double srOcenka, String name) {
        this.srOcenka = srOcenka;
        this.name = name;
    }

    public SchoolStudent(double srOcenka, String name, String kruzhok) {
        this.srOcenka = srOcenka;
        this.name = name;
        this.kruzhok = kruzhok;
    }

    public SchoolStudent(double srOcenka, String name, String kruzhok, int vozrast) {
        this.srOcenka = srOcenka;
        this.name = name;
        this.kruzhok = kruzhok;
        this.vozrast = vozrast;
    }

    public void setkruzhok(String kruzhok) {
        this.kruzhok = kruzhok;
    }

    public void setsrOcenka(double srOcenka) {
        this.srOcenka = srOcenka;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setvozrast(int vozrast) {
        this.vozrast = vozrast;
    }

    public int getvozrast() {
        return vozrast;
    }

    public double getsrOcenka() {
        return srOcenka;
    }

    public String getkruzhok() {
        return kruzhok;
    }

    public String getname() {
        return name;
    }
}


