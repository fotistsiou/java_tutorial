package fotistsiou.javatutorial.fundamentals.g_oop;

public class Academic {
    private String name;
    private String type;

    public Academic() {}

    public Academic (
        String name,
        String type
    ){
        this.name = name;
        this.type= type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    void announce() {
        System.out.println("The " + type + " " + name + ".");
    }
}
