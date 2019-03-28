package lesson17;

public class Main1 {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("apple",2);
        holodilnik.addProduct("apple", 1);
        holodilnik.addProduct("pear",3);
        holodilnik.addProduct("plum",1);
        holodilnik.addProduct("cream",4);
        holodilnik.printListProduct();
        holodilnik.deleteProduct("pear",3);
        holodilnik.printListProduct();

    }
}
