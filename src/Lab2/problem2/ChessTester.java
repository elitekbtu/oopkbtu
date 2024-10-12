package Lab2.problem2;

public class ChessTester {
    public static void main(String[] args) {
        Position p1 = new Position(2, 'E');
        Position p2 = new Position(3, 'E');
        Position p3 = new Position(5, 'E');
        Position p4 = new Position(3, 'F');

        Pawn pawn = new Pawn(p1);
        Bishop bishop = new Bishop(p3);
        Knight knight = new Knight(p2);
        Rook rook = new Rook(p1);
        King king = new King(p1);
        Queen queen = new Queen(p3);

        System.out.println("Pawn legal move to E3: " + pawn.isLegalMove(p2));
        System.out.println("Pawn legal move to E5: " + pawn.isLegalMove(p3));
        System.out.println("Pawn legal move to F3: " + pawn.isLegalMove(p4));

        System.out.println("Bishop legal move to E5: " + bishop.isLegalMove(new Position(5, 'F')));
        System.out.println("Bishop legal move to E4: " + bishop.isLegalMove(new Position(4, 'D')));
        System.out.println("Bishop legal move to E3: " + bishop.isLegalMove(new Position(3, 'F')));

        System.out.println("Knight legal move to D3: " + knight.isLegalMove(new Position(3, 'D')));
        System.out.println("Knight legal move to E5: " + knight.isLegalMove(new Position(5, 'E')));

        System.out.println("Rook legal move to E2: " + rook.isLegalMove(p1));
        System.out.println("Rook legal move to D3: " + rook.isLegalMove(new Position(3, 'D')));

        System.out.println("King legal move to E3: " + king.isLegalMove(p2));
        System.out.println("King legal move to F3: " + king.isLegalMove(p4));

        System.out.println("Queen legal move to F4: " + queen.isLegalMove(new Position(4, 'F')));
        System.out.println("Queen legal move to E3: " + queen.isLegalMove(p2));
    }
}