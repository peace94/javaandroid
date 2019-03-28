package lesson10;

public class Main1 {
    public static void main(String[] args) {
        Animal animal = new Animal("Jorj", 12, 13400);
        Lion lion = new Lion(11, "Lev", 387);
        Lion lion2 = new Lion(21, "Lev2", 561);
        Lion lion3 = new Lion(13, "Lev3", 612);
        Pes pes1 = new Pes(4, "Pes1", 166);
        Pes pes2 = new Pes(5, "Pes2", 253);
        Pes pes3 = new Pes(6, "Pes3", 721);
        /*lion.setAge(3);
        lion.setName("Vasya");
        lion.setPrice(13222);*/
        animal.print();
        lion.print();
        Animal[] zoo = new Animal[6];
        zoo[0] = pes1;
        zoo[1] = lion;
        zoo[2] = pes2;
        zoo[3] = lion2;
        zoo[4] = lion3;
        zoo[5] = pes3;
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].print();
        }

    }
}
