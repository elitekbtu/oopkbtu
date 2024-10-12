package Lab2.problem_a;

public class Sphere extends Shape3D {
    private double radius;

    Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4/3)*Math.PI*Math.pow(radius,3);
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
