package onitama_codigo_base;

import java.util.Random;

/**
 * Classe que contém informações das cartas
 */
public class Card {

    private String name;
    private Color color;
    private Position[] positions;

    /**
     * Construtor que define os principais atributos de uma cara
     * @param name Nome da carta
     * @param color Cor da carta
     * @param positions Todas as posições relativas de movimento
     */
    public Card(String name, Color color, Position[] positions) {
    this.name = name;
    this.color = color;
    this.positions = positions;
    }

    /**
     * Método que devolve o nome da carta
     * @return String que contém o nome da carta
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método que devolve a cor da carta
     * @return Enum Color que contém a cor da carta
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * Método que devolve todas as possíveis posições relativas de movimento.
     * A posição atual da peça é o ponto de origem (0,0). Uma carta possui as possíveis posições de movimento em relação ao ponto de origem.
     * @return Um array de Position contendo todas as possíveis posições de movimento em relação ao ponto de origem
     */
    public Position[] getPositions() {
        return this.positions;
    }

    /**
     * Método que cria todas as cartas do jogo, embaralha-as e devolve as 5 que serão utilizadas na partida.
     * @return Vetor de cartas com todas as cartas do jogo
     */
    public static Card[] createCards() {
        Card[] cards = Card.initializeCards();
        return Card.shuffleCards(cards);
    }
    private static Card[] initializeCards(){
        Card[] cards = new Card[8];

        //----------------TIGER----------------
        Position[] tigerPositions = new Position[2];
        tigerPositions[0] = new Position(-2, 0);
        tigerPositions[1] = new Position(1,0);
        cards[0] = new Card("Tiger", Color.NONE, tigerPositions);

        //---------------DRAGON---------------
        Position[] dragonPositions = new Position[4];
        dragonPositions[0] = new Position(-1,-2);
        dragonPositions[1] = new Position(-1,2);
        dragonPositions[2] = new Position(1,-1);
        dragonPositions[3] = new Position(1,1);
        cards[1] = new Card("Dragon", Color.NONE, dragonPositions);

        //---------------FROG---------------
        Position[] frogPositions = new Position[3];
        frogPositions[0] = new Position(-1,-1);
        frogPositions[1] = new Position(0,-2);
        frogPositions[2] = new Position(1,1);
        cards[2] = new Card("Frog", Color.BLUE, frogPositions);

        //---------------RABBIT----------------
        Position[] rabbitPositions = new Position[3];
        rabbitPositions[0] = new Position(-1,1);
        rabbitPositions[1] = new Position(0,2);
        rabbitPositions[2] = new Position(1,-1);
        cards[3] = new Card("Rabbit",Color.RED, rabbitPositions);

        //----------------CRAB-----------------
        Position[] crabPositions = new Position[3];
        crabPositions[0] = new Position(-1,-0);
        crabPositions[1] = new Position(0,-2);
        crabPositions[2] = new Position(0,2);
        cards[4] = new Card("Crab", Color.NONE, crabPositions);

        //-------------ELEPHANT-----------------
        Position[] elephantPositions = new Position[4];
        elephantPositions[0] = new Position(-1,-1);
        elephantPositions[1] = new Position(-1,1);
        elephantPositions[2] = new Position(0,-1);
        elephantPositions[3] = new Position(0,1);
        cards[5] = new Card("Elephant", Color.NONE, elephantPositions);

        //---------------GOOSE-----------------
        Position[] goosePositions = new Position[4];
        goosePositions[0] = new Position(-1,-1);
        goosePositions[1] = new Position(0,-1);
        goosePositions[2] = new Position(0,1);
        goosePositions[3] = new Position(1,1);
        cards[6] = new Card("Goose", Color.BLUE, goosePositions);

        //---------------ROOSTER----------------
        Position[] roosterPositions = new Position[4];
        roosterPositions[0] = new Position(-1,1);
        roosterPositions[1] = new Position(0,1);
        roosterPositions[2] = new Position(0,-1);
        roosterPositions[3] = new Position(1,-1);
        cards[7] = new Card("Rooster", Color.RED, roosterPositions);

        return cards;
    }
    private static Card[] shuffleCards(Card[] cards){

        Card[] boardCards = new Card[5];
        int i = 0;

        Random random = new Random();

        boardCards[0] = cards[random.nextInt(8)];

        for (int j = 1; j < 5; j++) {
            int randomNumber = random.nextInt(8);
            boolean isDuplicate = false;

            for (Card boardCard : boardCards) {
                if (boardCard != null && boardCard.getName().equals(cards[randomNumber].getName())) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                j--;
                continue;
            }

            boardCards[j] = cards[randomNumber];
        }


        return boardCards;

    }
}


