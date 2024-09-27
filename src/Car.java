
public abstract class Car {

    protected String name = "Car";

    private int weight = 100;

    private boolean dirty = false;

    static String type;


    static void printType() {  // Статический метод
        System.out.println(type);
    }

    public void sayMyNameAndWeight() {
        System.out.println("Weight of " + name + " is " + weight);
    }

    // Геттеры и сеттеры

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public Boolean getDirty() {
        return dirty;
    }

}
