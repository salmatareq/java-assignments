package sampleB;

public class Rectangle implements IShape{
    private double height;
    private double width;

    @Override
    public double calculateArea() {
        return height*width;
    }
}
