package practice4;

public class Triangle extends Shape {

    public Triangle(Color color, int x) {
        super(color, x);
    }

    @Override
    public void draw(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < x; j++)
                System.out.print(" ");  // Keep spacing uniform

            if (color == Color.BLACK)
                System.out.println("/\\");  // Entire shape in black
            else
                System.err.println("/\\");  // Entire shape in red
        }
    }
}