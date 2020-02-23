package templatepattern.templates.game;

/**
 *
 * @author Raul Sanchez Reyes
 */
public abstract class Game {
    protected GameInfo _GameInfo;
    
    public Game(GameInfo gameInfo){
       this._GameInfo = gameInfo;
    }
    
    protected abstract void createGame();
    protected abstract void makeMove();
    protected abstract void applyRules();
    
    public void playGame(){
        createGame();
        makeMove();
        applyRules();
        closeGame();
    }
    
    protected void closeGame(){
        System.out.println("Close game:"+this.getClass().getName());
        System.out.println("--------------------");
    }
    
}
