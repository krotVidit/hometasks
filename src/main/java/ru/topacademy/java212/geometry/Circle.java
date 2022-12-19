package ru.topacademy.java212.geometry;

public class Circle implements Comparable {
    public final double radius;       // final - котстанта

    public Circle(double radius) {

        this.radius = radius;
    }

    public double circleLength() {
        return 2 * Math.PI * radius;
    }

    public double circleArea() {
        return radius * radius * Math.PI;
    }


    @Override
    public int compareTo(Object o) {
        if (o.getClass()!=this.getClass())
            return -1;
        Circle Circle2 = (Circle) o;
        return Double.compare(radius,Circle2.radius );
    }
}
