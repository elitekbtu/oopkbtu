package lab2.problem2;

public class King extends Piece{
    private Position position;
    King(Position position){
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

        return (Math.abs(startX - targetX) <= 1 && Math.abs(startY - targetY) <= 1);
    }
}
