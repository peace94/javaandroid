package lesson7;

import java.util.Arrays;

public class StringUtils {

    public static String codingMessage(String message) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] codingMessage = message.toCharArray();
        for (int i = 0; i < codingMessage.length; i++) {
            int indexCurrentChar = alphabet.indexOf(codingMessage[i]);
            if (indexCurrentChar != -1) {
                char newChar = alphabet.charAt(indexCurrentChar + 1);
                codingMessage[i] = newChar;
            }
        }
        return Arrays.toString(codingMessage);
    }

    public static int poschitatGlasnie(String message) {
        char[] forCounting = message.toCharArray();
        int sum = 0;
        for (int i = 0; i < forCounting.length; i++) {
            if (forCounting[i] == 'a' || forCounting[i] == 'e' || forCounting[i] == 'i' || forCounting[i] == 'o' || forCounting[i] == 'u' || forCounting[i] == 'y') {
                sum++;
            }
        }
        return sum;
    }

    public static int countSoglasnie(String text) {
        char[] forCounting = text.toCharArray();
        int sum = 0;
        for (int i = 0; i < forCounting.length; i++) {
            if (forCounting[i] == 'b' || forCounting[i] == 'c' || forCounting[i] == 'd' || forCounting[i] == 'f' || forCounting[i] == 'g' || forCounting[i] == 'h' || forCounting[i] == 'j'
                    || forCounting[i] == 's' || forCounting[i] == 'r' || forCounting[i] == 'q' || forCounting[i] == 'p' || forCounting[i] == 'n' || forCounting[i] == 'm' || forCounting[i] == 'l' || forCounting[i] == 'k'
                    || forCounting[i] == 't' || forCounting[i] == 'v' || forCounting[i] == 'w' || forCounting[i] == 'x' || forCounting[i] == 'z') {
                sum++;
            }
        }
        return sum;
    }

    public static String reverse(String text) {
        char[] iznachalniiText = text.toCharArray();
        char[] reverseText = new char[iznachalniiText.length];
        for (int i = 0; i < iznachalniiText.length; i++) {
            reverseText[i] = iznachalniiText[iznachalniiText.length - i - 1];
        }
        return Arrays.toString(reverseText);
    }

    public static String deleteZnakiPrepinania(String text) {
        String newText = text.replace(",", "");
        newText = newText.replace(".", "");
        newText = newText.replace(";", "");
        newText = newText.replace("?", "");
        newText = newText.replace(":", "");
        newText = newText.replace("!", "");
        return newText;
    }


}
