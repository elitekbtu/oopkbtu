package Lab2.problem2;

public class Pawn extends Piece {
    private Position position;

    Pawn(Position position) {
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
        // Ensure the target position is within the valid board limits
        if (b.getHorizontal() < 'A' || b.getVertical() < 1 || b.getHorizontal() > 'H' || b.getVertical() > 8) {
            return false;
        }

        int startX = position.getHorizontal();
        int startY = position.getVertical();
        int targetX = b.getHorizontal();
        int targetY = b.getVertical();

        // Check if the pawn is moving forward one square
        if (targetX == startX && targetY == startY + 1) {
            return true; // Standard move
        }
        // Check for the initial two-square move
        if (startY == 2 && targetX == startX && targetY == startY + 2) {
            return true; // Initial double move
        }
        // Check for capturing
        if (Math.abs(targetX - startX) == 1 && targetY == startY + 1) {
            return true; // Capturing move
        }

        return false; // Not a legal move
    }
}