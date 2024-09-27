package lection_1;

public class Truck extends Car implements IWashable {

    public Truck() {
        super();
        setDirty(true);
        setWeight(500);
        setPayload(getWeight()/2);
        count++;
        name = "Truck" + count;
    }

    public Truck(String name) {
        super();
        setDirty(true);
        setWeight(500);
        setPayload(getWeight()/2);
        count++;
        this.name = name;
    }

    private int payload;

    private boolean loaded = false;

    protected static String type = "Truck";


    public void load() {
        if (!loaded) {
            loaded = true;
            setWeight(getWeight() + getPayload());
            System.out.println("Successfully loaded!");
        }
        else {
            System.out.println("This car is already loaded!");
        }
    }

    public void unload() {
        if (loaded) {
            loaded = false;
            setWeight(getWeight() - getPayload());
            System.out.println("Successfully unloaded!");
        }
        else {
            System.out.println("This car is not loaded!");
        }
        setDirty(true);
    }

    @Override
    public void wash() {
        if (getDirty() && !loaded) {
            setDirty(false);
            System.out.println("Successfully washed!");
        }
        else if (loaded) {
            System.out.println("Cannot wash loaded cars!");
        }
        else {
            System.out.println("This car is not dirty!");
        }
    }

    private int getPayload() {
        return payload;
    }

    private void setPayload(int payload) {
        this.payload = payload;
    }
}
