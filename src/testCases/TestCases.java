package testCases;

import static org.junit.Assert.fail;

import java.util.ArrayList;

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
import factory.I_enemy;
import factory.Player;
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
		System.out.println("Testing pause");
		//Sets state of game to resume
		engine.setGameState(new ResumeState(engine));
		control.pauseGame();
		GameState state = engine.getGameState();
		//Checks to ensure game has been paused
		if(!(state instanceof PauseState)) {
			fail("Game not pausing");
		}

		//Checks player does not move
		Player player = (Player) engine.getLevel().getPlayer();
		int init_x = player.getxCoord();

		control.rightButton() ;
		if(init_x != player.getxCoord()) {
			fail("Player position changing when paused");
		}
	}

	@Test
	public void testGameMovement() {
		System.out.println("Testing movement");
		//Sets state of game to resume
		engine.setGameState(new ResumeState(engine));

		Player player = (Player) engine.getLevel().getPlayer();
		int init_x = player.getxCoord();

		//Moves the player, checks position updates
		control.rightButton();
		if(init_x == player.getxCoord()) {
			fail("Player move left not updating");
		}
		init_x = player.getxCoord();

		control.leftButton();
		if(init_x == player.getxCoord()) {
			fail("Player move right not updating");
		}
	}

	@Test
	public void testCommands() {
		System.out.println("Testing commands");
		engine.setGameState(new ResumeState(engine));
		
		GameState state = engine.getGameState();
		if(!(state instanceof ResumeState)) {
			fail("Game not starting");
		}
		
		control.pauseGame();
		state = engine.getGameState();
		if(!(state instanceof PauseState)) {
			fail("Pause command not working");
		}
		
		control.resumeGame();
		state = engine.getGameState();
		if(!(state instanceof ResumeState)) {
			fail("Resume command not working");
		}
	}
	
	@Test
	public void checkEnemies() {
		System.out.println("Checking enemies created");
		engine.setGameState(new ResumeState(engine));
		
		ArrayList <I_enemy> enemies = engine.getLevel().getEnemyList();
		
		//Takes first enemy in list
		I_enemy enemy = enemies.get(0);
		
		Integer health = enemy.gethealthpoints();
		
		if(!(health instanceof Integer)) {
			fail("No health value in enemy");
		}
	}

	@After
	public void closeGame() {
		//Closes the game
		control.offGame();
	}
}
