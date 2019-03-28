package lesson12;

public class Teacher implements Rabotnik {

    @Override
    public void getSalary() {
        System.out.println("я учитель получаю 20к");
    }

    @Override
    public void doWork() {
        System.out.println("я учитель я работаю учителем");

    }
}
