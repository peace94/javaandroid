package lesson12;

public class Main1 {
    public static void main(String[] args) {
        Main1 main =  new Main1();
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Shofer shofer1 = new Shofer(23,"Sam");
        Shofer shofer2 = new Shofer(24, "Anatoliy");
        Shofer shofer3 = shofer1;
        System.out.println(shofer1.equals(shofer2));
        System.out.println(shofer1.toString());

        Rabotnik[] rabotniki = {teacher1,teacher2,shofer1,shofer2};
        for (int i = 0; i < rabotniki.length; i++) {
            rabotniki[i].doWork();
        }



    }
}
