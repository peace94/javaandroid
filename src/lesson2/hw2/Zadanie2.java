package lesson2.hw2;

public class Zadanie2 {
    public static void main(String[] args) {
        int kolvoYablon = 5;
        int kolvoGrush = 3;
        int vederSYabloniPo = 6;
        int vederSGrushiPo = 10;
        int sokaSYablok = 4;
        int sokaSGrush = 3;
        int litrNaDnei = 2;
        int skolkoVsegoDnei;
        skolkoVsegoDnei = (kolvoYablon * vederSYabloniPo * sokaSYablok + kolvoGrush * vederSGrushiPo * sokaSGrush) * litrNaDnei;
        System.out.println(skolkoVsegoDnei);


    }
}
