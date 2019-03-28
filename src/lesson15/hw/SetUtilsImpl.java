package lesson15.hw;

import java.util.*;

public class SetUtilsImpl implements SetUtils{
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {

        return null;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet<Integer>  orderSet = new LinkedHashSet<>();
        orderSet.add(val1);
        orderSet.add(val2);
        orderSet.add(val3);
        orderSet.add(val4);
        orderSet.add(val5);

        return orderSet;
    }
}
