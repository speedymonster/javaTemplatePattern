/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepattern.templates.game;

/**
 *
 * @author Testing
 */
public class Checkers  extends Game{

    public Checkers(GameInfo gameInfo) {
        super(gameInfo);
    }

    @Override
    protected void createGame() {
      System.out.println("Creating Checkers game");
    }

    @Override
    protected void makeMove() {
        System.out.println("Make Ckeckers moves");
    }

    @Override
    protected void applyRules() {
        System.out.println("Apply checkers rules");
    }
    
}
