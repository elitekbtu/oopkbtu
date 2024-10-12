package Lab2.problem_b;

public abstract class Piece {
    protected Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract boolean isLegalMove(Position secondPosition);
}