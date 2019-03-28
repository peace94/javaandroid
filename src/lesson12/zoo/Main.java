package lesson12.zoo;

public class Main {
    public static void main(String[] args) {
        ZooAnimal[] animal = new ZooAnimal[5];
        animal[0]= new Monkey();
        animal[1]= new Monkey();
        animal[2]= new Lion();
        animal[3]= new Monkey();
        animal[4]= new Lion();

        for (int i = 0; i < animal.length; i++) {
            animal[i].jump();
        }
    }

}
