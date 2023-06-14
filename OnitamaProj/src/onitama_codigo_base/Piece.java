package onitama_codigo_base;

/**
 * Classe que contém informações das peças de jogo
 */
public class Piece {
    private Color color;
    private boolean isMaster;
    private boolean isAlive;
    /**
     * Construtor que define a cor e o tipo da peça
     * @param color Cor da peça
     * @param isMaster Se o tipo da peça é mestre ou não
     */
    public Piece(Color color, boolean isMaster) {
    this.color = color;
    this.isMaster = isMaster;
    this.isAlive = true;
    }

    /**
     * Método que devolve a cor da peça
     * @return Enum Color com a cor da peça
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * Método que devolve se é um mestre ou não
     * @return Booleano true para caso seja um mestre e false caso contrário
     */
    public boolean isMaster() {
        return this.isMaster;
    }

    /**
     * Método que devolve se a peça ainda está em jogo ou não
     * @return Booleano true para caso esteja em jogo e false caso contrário
     */
    public boolean isAlive() {
        return this.isAlive;
    }

    public void eliminatePiece(){
        this.isAlive = false;

    }
}
