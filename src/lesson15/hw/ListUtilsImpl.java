package lesson15.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtilsImpl implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            stringList.add(strings[i]);
        }
        return stringList;

    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        List<Double> sortList = new ArrayList<>();
        sortList.addAll(data);
        Collections.sort(sortList,Collections.reverseOrder());
        return sortList;
    }
}
