package lesson12.zoo;

public class Monkey implements ZooAnimal{
    @Override
    public void voice() {
        System.out.println("myakaka");
    }

    @Override
    public void jump() {
        System.out.println("visoko");
    }
}
