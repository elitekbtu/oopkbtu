package Lab2.problem_b;

public class Queen extends Piece{
    private Position position;
    Queen(Position position){
        this.position = position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (b.getHorizontal() < 'A' || b.getVertical() < 1 || b.getHorizontal() > 'H' || b.getVertical() > 8) {
            return false;
        }
        int startX = position.getHorizontal();
        int startY = position.getVertical();
        int targetX = b.getHorizontal();
        int targetY = b.getVertical();
        return (startX == targetX || startY == targetY || Math.abs(startX - targetX) == Math.abs(startY - targetY));
    }
}
