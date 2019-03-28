package lesson4.packet;

public class Matematicheskiefunc {
    //модификатор доступа (4 вида) public , private
    //статичность (кому метод принадлежит , т.е. классу или объекту) static , а если его нет то принадлежность объекту
    //возвращаемый тип (может быть любой или void , т.е. не возвращает ничего)
    //название метода с маленькой буквы
    public static int summaTrexChisel(int a, int b, int c) {
        int summa = a + b + c;
        return summa;
    }

    public static double procentBank(double vklad, double procent, int let) {
        double vsegoDeneg = vklad;
        for (int i = 0; i < let; i++) {
            vsegoDeneg = vsegoDeneg + vsegoDeneg * procent;
        }
        return (vsegoDeneg - vklad);
    }

    public static double ploshadTreug (int a, int b, int c){
        int p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }


}
