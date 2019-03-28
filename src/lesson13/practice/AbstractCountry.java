package lesson13.practice;

import java.util.Scanner;

public abstract class AbstractCountry implements Country {
    private int naselenie;
    private int KolvoKurortov;
    private int ploshad;
    private String capital;
    private boolean visa;

    public int getNaselenie() {
        return naselenie;
    }

    public void setNaselenie(int naselenie) {
        this.naselenie = naselenie;
    }

    public int getKolvoKurortov() {
        return KolvoKurortov;
    }

    public void setKolvoKurortov(int kolvoKurortov) {
        KolvoKurortov = kolvoKurortov;
    }

    public int getPloshad() {
        return ploshad;
    }

    public void setPloshad(int ploshad) {
        this.ploshad = ploshad;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean isVisa() {
        return visa;
    }

    public void setVisa(boolean visa) {
        this.visa = visa;
    }

    @Override
    public void printNaselenie() {
        System.out.println(naselenie);
    }

    @Override
    public void printKolvoKurortov() {
        System.out.println(KolvoKurortov);

    }

    @Override
    public void printPloshad() {
        System.out.println(ploshad);

    }

    @Override
    public String getCapital() {
        return capital;
    }

    @Override
    public boolean needVisa() {
        return visa;
    }
}
