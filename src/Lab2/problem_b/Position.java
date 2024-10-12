package Lab2.problem_b;

public class Position {
    private final int vertical;
    private final char horizontal;
    Position(int num ,char letter){
        vertical = num;
        horizontal = letter;
    }
    public int getVertical() {
        return vertical;
    }

    public char getHorizontal() {
        return horizontal;
    }
}