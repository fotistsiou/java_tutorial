package fotistsiou.javatutorial.fundamentals.h_oop.advancedSorting;

/* Advanced Sorting */
// -> To sort objects you need to specify a rule that decides how objects should be sorted.
// -> The Comparator and Comparable interfaces allow you to specify what rule is used to sort objects.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<University> universities = new ArrayList<University>();
        universities.add(new University("UOC", 1973));
        universities.add(new University("UNIPI", 1938));

        System.out.println("Universities before with Comparator:");
        int index = 0;
        for (University university : universities) {
            System.out.println(index +". The University " + university.name() + " established in " + university.year());
            index++;
        }

        // Sorting with Comparator
        Comparator sortWithComparator = new SortByYearWithComparator();
        Collections.sort(universities, sortWithComparator);
        System.out.println("Universities after sorting with Comparator:");
        int index2 = 0;
        for (University university : universities) {
            System.out.println(index2 +". The University " + university.name() + " established in " + university.year());
            index2++;
        }

        // Sorting with Comparable
    }
}
