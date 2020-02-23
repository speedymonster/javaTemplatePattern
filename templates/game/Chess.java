package templatepattern.templates.game;

/**
 *
 * @author Raul Sanchez Reyes
 */
public class Chess extends Game{

    public Chess(GameInfo gameInfo) {
        super(gameInfo);
    }

    @Override
    public void createGame() {
                System.out.println("Creating Chess game");
    }

    @Override
    public void makeMove() {
        System.out.println("Make Chess moves");

    }

    @Override
    public void applyRules() {
        System.out.println("Apply Chess rules");
    }
    
}
