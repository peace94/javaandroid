package lesson7;

public class Main4 {
    public static void main(String[] args) {
        String message = "qwetrtd, af!a:df;";
        String newString = StringUtils.codingMessage(message);
        System.out.println(newString);
        System.out.println(StringUtils.poschitatGlasnie(message));
        System.out.println(StringUtils.countSoglasnie(message));
        String text = StringUtils.reverse(message);
        System.out.println(text);
        String replacement = StringUtils.deleteZnakiPrepinania(message);
        System.out.println(replacement);
    }
}
