package testCases;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import command.Command;
import command.Control;
import command.OffGameCommand;
import command.PauseGameCommand;
import command.PlayerLeftCommand;
import command.PlayerRightCommand;
import command.ResumeGameCommand;
import State.GameEngine;
import State.GameState;
import State.PauseState;
import State.ResumeState;

public class TestCases {

	private static GameEngine engine;
	private static Control control;

	@Before
	public void setup() {
		engine = new GameEngine();

		control = new Control();
		Command pr = new PlayerRightCommand(engine) ;
		Command pl = new PlayerLeftCommand(engine) ;
		Command pg = new PauseGameCommand(engine) ;
		Command og = new OffGameCommand(engine) ;
		Command rg = new ResumeGameCommand(engine) ;
		control.setCommand(pr, pl, pg, og, rg);

		engine.startgame(true);
	}

	@Test
	public void testGamePauseState() {
		//Sets state of game to resume
		engine.setGameState(new ResumeState(engine));
		control.pauseGame();
		GameState state = engine.getGameState();
		//Checks to ensure game has been paused
		if(!(state instanceof PauseState)) {
			fail("Game not pausing");
		}
		//Closes the game
		control.offGame();
	}

	@Test
	public void testGameMovement() {
		//Sets state of game to resume
		engine.setGameState(new ResumeState(engine));
		
		control.rightButton();
		control.leftButton();
	}
}
