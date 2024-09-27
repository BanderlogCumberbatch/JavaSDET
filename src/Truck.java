public class Truck extends Car implements IWashable {

    public Truck() {
        super();
        setDirty(true);
        setWeight(500);
        setPayload(getWeight()/2);
        type = "Truck";
        name = type + name;
    }

    public Truck(String name) {
        super();
        setDirty(true);
        setWeight(500);
        setPayload(getWeight()/2);
        type = "Truck";
        this.name = type + name;
    }

    private int payload;

    private boolean loaded = false;


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
