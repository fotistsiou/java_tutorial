package fotistsiou.javatutorial.g_java_advanced_topics.generics.examples;

public class GenericArray {
    public static void main(String[] args) {
        var stringArray = new ImmutableArray<>(new String[] {"item1", "item2", "item3"});
        var doubleArray = new ImmutableArray<>(new Double[] {1.03, 2.04});

        for (int i = 0; i < stringArray.length(); i++) {
            System.out.print(stringArray.get(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < doubleArray.length(); i++) {
            System.out.print(doubleArray.get(i) + " ");
        }
    }
}

class ImmutableArray<T> {

    private final T[] items;

    public ImmutableArray(T[] items) {
        this.items = items.clone();
    }

    public T get(int index) {
        return items[index];
    }

    public int length() {
        return items.length;
    }
}
