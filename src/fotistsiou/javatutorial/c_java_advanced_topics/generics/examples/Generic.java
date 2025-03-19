package fotistsiou.javatutorial.c_java_advanced_topics.generics.examples;

public class Generic {
    public static void main(String[] args) {
        var obj1 = new GenericType<>(10);
        var obj2 = new GenericType<>("abc");

        Integer number = obj1.get();
        String string = obj2.get();

        System.out.println(number);
        System.out.println(string);
    }
}

class GenericType<T> {

    /**
     * A field of "some type"
     */
    private T t;

    /**
     * Takes a value of "some type" and assigns it to the field
     */
    public GenericType(T t) {
        this.t = t;
    }

    /**
     * Returns a value of "some type"
     */
    public T get() {
        return t;
    }

    /**
     * Takes a value of "some type", assigns it to a field and then returns it
     */
    public T set(T t) {
        this.t = t;
        return this.t;
    }
}
