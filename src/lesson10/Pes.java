package lesson10;

public class Pes extends Animal {
    public Pes() {

    }

    public Pes(int age, String name, int price) {
        super(name, age, price);
    }

    @Override
    public void print() {
        System.out.printf("Пёс:Имя - %s, цена - %d, возраст - %d", this.getName(), this.getAge(), this.getPrice());
        System.out.println();
    }
}
