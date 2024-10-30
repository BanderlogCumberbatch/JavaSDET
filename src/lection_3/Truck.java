package lection_3;

import java.awt.*;

public class Truck<T extends Number> extends Car implements IWashable, IPaintable<java.awt.Color> { // Generic class; Цвет указывается в Color

    public Truck(T payload) {
        super();
        setDirty(true);
        setWeight(500);
        setPayload(payload);
        count++;
        name = "Truck" + count;
    }

    public Truck(String name, T payload) {
        super();
        setDirty(true);
        setWeight(500);
        setPayload(payload);
        count++;
        this.name = name;
    }

    private java.awt.Color color = new Color(73, 73, 73);

    private T payload;

    private boolean loaded = false;

    protected static String type = "Truck-Kun";

    @Override
    public void paint(java.awt.Color color) {
        this.color = color;
    }


    public void load() {
        if (!loaded) {
            loaded = true;
            setWeight(getWeight() + getPayload().doubleValue());
            System.out.println("Successfully loaded!");
        }
        else {
            System.out.println("This car is already loaded!");
        }
    }

    public void unload() {
        if (loaded) {
            loaded = false;
            setWeight(getWeight() - getPayload().doubleValue());
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

    public java.awt.Color getColor() {
        return color;
    }

    private T getPayload() {
        return payload;
    }

    private void setPayload(T payload) {
        if (payload.doubleValue() < getWeight()) {
            this.payload = payload;
        }
        else {
            System.out.println("Payload must be lesser than weight!");
        }
    }

}
