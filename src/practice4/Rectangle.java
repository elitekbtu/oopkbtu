package practice4;

public class Rectangle extends Shape {
    protected int width;
    protected int height;

    public Rectangle(Color color, int x, int width, int height) {
        super(color, x);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(int sizeMultiplier) {
        for (int i = 0; i < height * sizeMultiplier; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            if (color == Color.RED) {
                System.err.println("*".repeat(width * sizeMultiplier));
            } else {
                System.out.println("*".repeat(width * sizeMultiplier));
            }
        }
    }
}