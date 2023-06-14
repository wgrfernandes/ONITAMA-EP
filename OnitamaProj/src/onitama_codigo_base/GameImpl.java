package onitama_codigo_base;

public class GameImpl implements Game {
    private Card[] cards;
    private Piece[] pieces;
    private Player player1;
    private Player player2;
    private Position position;
    private Spot spots;
    private Card tableCard;

    @Override
    public Color getSpotColor(Position position) {
        if (position.getRow() == 0 && position.getCol() == 2) {
            return Color.BLUE;
        }

        if (position.getRow() == 4 && position.getCol() == 2) {
            return Color.RED;
        }

        return Color.NONE;
    }

    @Override
    public Piece getPiece(Position position) {
        if(this.spots.getPosition() == position && this.spots.getPiece() != null){
            return this.spots.getPiece();
        }

        return null;
    }

    @Override
    public Card getTableCard() {
        return this.tableCard;
    }

    @Override
    public Player getRedPlayer() {
        if(player1.getPieceColor() == Color.RED){
            return player1;
        } else return player2;
    }

    @Override
    public Player getBluePlayer() {
        if(player1.getPieceColor() == Color.BLUE){
            return player1;
        } else return player2;
    }

    @Override
    public void makeMove(Piece piece, Card card, Position position) throws IncorrectTurnOrderException, IllegalMovementException, InvalidCardException, InvalidPieceException {

    }

    @Override
    public boolean checkVictory(Color color) {
        return false;
    }

    @Override
    public void printBoard() {

    }
}
