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

        System.out.println("Universities before sorting with Comparator:");
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

        // Sorting with Comparator Using a Lambda Expression
        Collections.sort(universities, (obj1, obj2) -> {
            University a = (University) obj1;
            University b = (University) obj2;
            if (a.year() < b.year()) return -1;
            if (a.year() > b.year()) return 1;
            return 0;
        });
        System.out.println("Universities after sorting with Comparator using a Lambda Expression:");
        int index3 = 0;
        for (University university : universities) {
            System.out.println(index3 +". The University " + university.name() + " established in " + university.year());
            index3++;
        }

        // Sorting with Comparable
        ArrayList<ComparableSchool> schools = new ArrayList<ComparableSchool>();
        schools.add(new ComparableSchool("2o Rethymno", 2010));
        schools.add(new ComparableSchool("7o Hraklion", 1995));
        schools.add(new ComparableSchool("3o Rethymno", 1985));
        schools.add(new ComparableSchool("10o Hraklion", 2020));
        System.out.println("Schools before sorting with Comparable:");
        int index4 = 0;
        for (ComparableSchool school : schools) {
            System.out.println(index4 +". The School " + school.getName() + " established in " + school.getYear());
            index4++;
        }
        Collections.sort(schools);
        System.out.println("Schools after sorting with Comparable:");
        int index5 = 0;
        for (ComparableSchool school : schools) {
            System.out.println(index5 +". The School " + school.getName() + " established in " + school.getYear());
            index5++;
        }
    }
}
