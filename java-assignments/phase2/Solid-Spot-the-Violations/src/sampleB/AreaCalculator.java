package sampleB;

//
//Sample B — Shape area (OCP violation)
//public class AreaCalculator {
//    public double calculate(Object shape) {
//        if (shape instanceof Circle)    return Math.PI * ((Circle)shape).radius *
//                ((Circle)shape).radius;
//        if (shape instanceof Rectangle) return ((Rectangle)shape).width *
//                ((Rectangle)shape).height;
//        // Every new shape = edit this class
//        return 0;
//    }
//}

import java.awt.*;

public class AreaCalculator {

    public double calcArea(IShape shape){
        return shape.calculateArea();
    }
}
