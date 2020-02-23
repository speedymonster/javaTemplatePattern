/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepattern;

import templatepattern.templates.game.Checkers;
import templatepattern.templates.game.Chess;
import templatepattern.templates.game.Game;
import templatepattern.templates.game.GameInfo;


/**
 *
 * @author Testing
 */
public class TemplatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game game = new Chess(new GameInfo());
        game.playGame();
        
        game = new Checkers(new GameInfo());
        game.playGame();
    }
    
}
