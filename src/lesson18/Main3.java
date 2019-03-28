package lesson18;

import java.io.File;

public class Main3 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\mi\\Downloads\\1111");
        System.out.println(dir.exists());
        if (!dir.exists()){
            dir.mkdir();
        }
    }
}
