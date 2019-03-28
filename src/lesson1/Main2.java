package lesson1;

public class Main2 {
    public static void main(String[] args) {
        int vsegoDeneg = 1000;
        int cenaIgrushki = 175;
        int cenaZhwachki = 11;
        int cenaKonfeti = 2;
        int vsegoIgrushek = vsegoDeneg / cenaIgrushki;
        int vsegoZhwachki = (vsegoDeneg - vsegoIgrushek * cenaIgrushki) / cenaZhwachki;
        int vsegoKonfeti = (vsegoDeneg - vsegoIgrushek * cenaIgrushki - vsegoZhwachki * cenaZhwachki) / cenaKonfeti;
        int ostatok = vsegoDeneg - vsegoIgrushek * cenaIgrushki - vsegoZhwachki * cenaZhwachki - vsegoKonfeti * cenaKonfeti;
        System.out.println("vsegoigrushek  " + vsegoIgrushek + "  vsegoZhwachki  " + vsegoZhwachki
                + "  vsegokonfet  " + vsegoKonfeti + "  ostatok  " + ostatok);
    }
}
