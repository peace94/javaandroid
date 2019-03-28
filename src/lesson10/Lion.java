package lesson10;

public class Lion extends Animal {
    public Lion() {
    }

    public Lion(int age, String name, int price) {
/*      this.setAge(age);
        this.setName(name);
        this.setPrice(price);*/
        super(name, age, price);
    }
    public void voice(){
        System.out.println("");
    }

    @Override
    public void print() {
        System.out.printf("Лев:Имя - %s, цена - %d, возраст - %d", this.getName(), this.getAge(), this.getPrice());
        System.out.println();
    }
}
