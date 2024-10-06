package fotistsiou.javatutorial.fundamentals.i_oop.advancedSorting;

/* Comparable */
// -> The Comparable interface allows an object to specify its own sorting rule with a compareTo() method.
// -> The Comparable interface method takes an object as an argument and compares the comparable with the argument
//    to decide which one should go first in a list.
// -> The compare() method should return a number which is:
//    - Negative if the comparable should go first in a list.
//    - Positive if the other object should go first in a list.
//    - Zero if the order does not matter.

// 1. Create a Class that implements the Comparable Interface
public class ComparableSchool implements Comparable{
    // 2. Define the Attributes
    private String name;
    private int year;

    // 3. Create the Contractor
    public ComparableSchool(String n, int y) {
        this.name = n;
        this.year = y;
    }

    // 4. Create the Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // 5. Override compareTo() method
    @Override
    public int compareTo(Object o) {
        // 6. Decide how this object compares to other objects
        // -> (return -1): This object is smaller than the other one
        // -> (return 1):  This object is larger than the other one
        // -> (return 0): Both objects are the same
        ComparableSchool other = (ComparableSchool) o;
        if(this.getYear() < other.getYear()) return -1;
        if(this.getYear() > other.getYear()) return 1;
        return 0;
    }
}
