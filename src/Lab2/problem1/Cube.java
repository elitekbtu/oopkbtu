package Lab2.problem1;

import java.math.*;

public class Cube extends Shape3D{
    private double height;

    Cube(double height){
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.pow(height, 3);
    }

    @Override
    public double surfaceArea() {
        return 6*Math.pow(height, 2);
    }
}
