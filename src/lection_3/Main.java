package lection_3;

import java.awt.*;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isDivisible = x -> x % 13 == 0;  // Лямбда-выражение, которое возвращает true если переданное число делится без остатка на 13.
        System.out.println(isDivisible.test(13));

        Supplier<Double> Discriminant = (a, b, c) -> pow(b, 2) - 4*a*c; // Лямбда-выражение, которое возвращает дискриминант (D = b^2 — 4ac)
        System.out.println(Discriminant.get(1.0, 2.0, 1.0));

        Passenger car = new Passenger();

        car.sayMyNameAndWeight();
        System.out.println(car.getColor());
        car.paint("Red");
        System.out.println(car.getColor());

        Truck<Double> car1 = new Truck<>(266.66);   // Дробный тип грузоподъёмности

        car1.sayMyNameAndWeight();
        System.out.println(car1.getColor());
        car1.paint(new Color(255, 0, 0));
        System.out.println(car1.getColor());
        car1.load();
        System.out.println(car1.getWeight());

        Truck<Integer> car2 = new Truck<>(300); // Целочисленный тип грузоподъёмности

        car2.sayMyNameAndWeight();
        car2.load();
        System.out.println(car2.getWeight());

        Car.printCount();
    }
}
