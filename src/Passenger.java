public class Passenger extends Car implements IWashable, IPaintable {

    public Passenger() {
        super();
        setDirty(true);
        type = "Passenger";
        name = type + name;
    };

    public Passenger(String name) {
        super();
        setDirty(true);
        type = "Passenger";
        this.name = type + name;
    }

    private String color = "Grey";

    private int seats = 3;


    @Override
    public void paint(String color) {
        this.color = color;
    }

    @Override
    public void wash() {
        if (getDirty()) {
            setDirty(false);
            System.out.println("Successfully washed!");
        }
        else {
            System.out.println("This car is not dirty!");
        }
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    protected void setSeats(int seats) {
        this.seats = seats;
    }
}
