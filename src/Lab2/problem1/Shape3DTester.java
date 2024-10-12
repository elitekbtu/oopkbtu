package Lab2.problem1;

import java.util.Vector;
import java.util.Scanner;

public class Shape3DTester {

    public static void main(String[] args) {

        Vector <Shape3D> shapes = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("How  many figures: ");
            int cnt = scanner.nextInt();
            for(int i=0; i<cnt; i++){
                System.out.println("Take one of them: Cube, Cylinder, Sphere");
                String shapeType = scanner.next();
                if(shapeType.equals("Cube")){
                    System.out.println("Give me height of cube: ");
                    double height = scanner.nextDouble();
                    shapes.add(new Cube(height));
                }
                else if(shapeType.equals("Cylinder")){
                    System.out.println("Give me height and radius of cylinder: ");
                    double height = scanner.nextDouble();
                    double radius = scanner.nextDouble();
                    shapes.add(new Cylinder(height, radius));
                }
                else if(shapeType.equals("Sphere")){
                    System.out.println("Give me radius of sphere: ");
                    double radius = scanner.nextDouble();
                    shapes.add(new Sphere(radius));
                }
                else{
                    System.out.println("You can't take any figure!");
                    i--;
                }
            }
            break;
        }

        for (Shape3D shape : shapes) {
            if (shape instanceof Cube) {
                System.out.println("Cube: Volume = " + shape.volume() + ", Surface Area = " + shape.surfaceArea());
            } else if (shape instanceof Cylinder) {
                System.out.println("Cylinder: Volume = " + shape.volume() + ", Surface Area = " + shape.surfaceArea());
            } else if (shape instanceof Sphere) {
                System.out.println("Sphere: Volume = " + shape.volume() + ", Surface Area = " + shape.surfaceArea());
            }
        }
        System.out.println("thanks for using our program ;)");
    }
}