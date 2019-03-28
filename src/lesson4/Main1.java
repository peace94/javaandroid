package lesson4;


import lesson4.packet.Matematicheskiefunc;

public class Main1 {
    public static void main(String[] args) {
        int result = Matematicheskiefunc.summaTrexChisel(1, 2, 3);
        System.out.println(result);
        double dengi = Matematicheskiefunc.procentBank(1000, 0.05, 6);
        System.out.println(dengi);
        double ploshad = Matematicheskiefunc.ploshadTreug(4, 4, 4);
        System.out.println(ploshad);
        int[] massiv = {1, 2, 3, 4, 5, 6};
        RabotaSMassivom.vivodMassiva(massiv);
    }
}
