package lesson12;

import java.util.Objects;

public class Shofer implements Father, Rabotnik{

    private int vozrast;
    private String name;

    public Shofer(){

    }

    public Shofer(int vozrast, String name) {
        this.vozrast = vozrast;
        this.name = name;
    }

    @Override
    public void otveztiRebenkaVDetsad() {
        System.out.println("Я шофер, отвожу ребенка на служебной машинее");
    }

    @Override
    public void zabratRebenkaIzSada() {
        System.out.println("я шофер забираю ребенка из сада");
    }

    @Override
    public void getSalary() {
        System.out.println("Я шофер получаю деньги за работу");

    }

    @Override
    public void doWork() {
        System.out.println("I'm shofer and I edu");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shofer shofer = (Shofer) o;
        return vozrast == shofer.vozrast &&
                Objects.equals(name, shofer.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(vozrast, name);
    }

    @Override
    public String toString() {
        return "Shofer{" +
                "vozrast=" + vozrast +
                ", name='" + name + '\'' +
                '}';
    }
}
