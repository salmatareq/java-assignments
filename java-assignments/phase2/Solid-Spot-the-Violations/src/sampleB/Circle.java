package sampleB;

public class Circle implements IShape {
private double radius;
    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
