package lesson15;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("asdfxcv");
        strings.add("asv");
        strings.add("axcv");
        strings.add("fxcv");
        strings.add("xcv");

/*
        for(String s: strings){
            System.out.println(s);
        }
*/

        for(Iterator<String> iter = strings.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }

        System.out.println(strings);
    }

}
