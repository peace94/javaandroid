package lesson9;

public class Student {

    private int vozrast;
    private String name;
    private String surname;

    public double perimetr (int a, int b, int c){
        return a+b+c;
    }
    public void setName(String n){
        name=n;
    }
    public void setVozrast (int v){
         vozrast=v;
    }
    public void setSurname (String s){
        surname=s;
    }
    public String getName (){
        return name;
    }

}
