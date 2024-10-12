package Lab2.problem2;

public class Knight extends Piece {
    private Position position;

    Knight(Position position) {
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
        int deltaX = Math.abs(b.getHorizontal() - position.getHorizontal());
        int deltaY = Math.abs(b.getVertical() - position.getVertical());

        return (deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2);
    }
}