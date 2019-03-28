package lesson10;

public class Animal {
    private String name;
    private int age;
    private int price;

    public Animal(){
        super();
    }
    public Animal(String name, int age, int price){
        this.name=name;
        this.age=age;
        this.price=price;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getPrice() {
        return price;
    }
    public void print(){
        System.out.printf("Животное:Имя - %s, цена - %d, возраст - %d",this.name,this.age,this.price);
        System.out.println();
    }
}
