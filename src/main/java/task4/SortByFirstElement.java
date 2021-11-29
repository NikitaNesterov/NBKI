package task4;

import java.util.Comparator;

/**
 * class for custom Comparator
 * @author Nikita Nesterov
 */
public class SortByFirstElement implements Comparator<Record> {
    @Override
    public int compare(Record o1, Record o2) {
        return o1.getKey() - o2.getKey();
    }
}
