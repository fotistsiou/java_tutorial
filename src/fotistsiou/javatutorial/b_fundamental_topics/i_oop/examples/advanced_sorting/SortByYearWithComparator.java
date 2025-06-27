package fotistsiou.javatutorial.b_fundamental_topics.i_oop.examples.advanced_sorting;

import java.util.Comparator;

// 1. Create a Comparator
public class SortByYearWithComparator implements Comparator {

    // 2. Override compare() method
    @Override
    public int compare(Object o1, Object o2) {
        // 3.  Make sure that the objects are University objects
        University university1 = (University) o1;
        University university2 = (University) o2;

        // 4. Compare the yearOfEstablishment of both objects
        // -> (return -1): The first university has a smaller year
        // -> (return 1):  The first university has a larger year
        // -> (return 0): Both universities have the same year
        if (university1.year() < university2.year()) return -1;
        if (university1.year() > university2.year()) return 1;
        return 0;
    }
}
