package practice4;

public class Circle extends Shape {
    int radius;

    public Circle(Color color, int x, int radius) {
        super(color, x);
        this.radius = radius;
    }

    @Override
    public void draw(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < x; j++)
                System.out.print(" ");

            if (color == Color.RED)
                System.err.println("()");
            else
                System.out.println("()");
        }
    }
}