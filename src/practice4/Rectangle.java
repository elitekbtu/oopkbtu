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
        for (int i = 0; i < sizeMultiplier; i++) {
            if (color == Color.BLACK) {
                for (int j = 0; j < height; j++) {
                    for (int k = 0; k < width; k++) {
                        System.out.print('*');
                    }
                    System.out.println();
                }
            } else {
                for (int j = 0; j < height; j++) {
                    for (int k = 0; k < width; k++) {
                        System.err.print('*');
                    }
                    System.err.println();
                }
            }
            System.err.println('\n');
            System.out.println('\n');
        }
    }
}