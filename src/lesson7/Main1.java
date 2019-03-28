package lesson7;

public class Main1 {
    public static void main(String[] args) {
        String text = "TextTxz gfkasd zx";
        String newText = text.replace("T","-");
        newText = newText.replace("x","+");
        System.out.println(newText);

        char charAt2 = text.charAt(2);
        System.out.println(charAt2);
        char[] charsFromText = text.toCharArray();
        System.out.println(charsFromText);
    }
}
