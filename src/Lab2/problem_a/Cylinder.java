package Lab2.problem_a;

public class Cylinder extends Shape3D {
    private double height;
    private double radius;

    Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    @Override
    public double volume() {
        return height*Math.pow(radius, 2)*Math.PI;
    }

    @Override
    public double surfaceArea() {
        return  2*Math.pow(radius, 2) + 2*Math.PI*height;
    }
}
