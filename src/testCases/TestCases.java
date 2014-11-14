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
import factory.I_GameWorld_Object;
import factory.I_enemy;
import factory.Obstacle;
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
		int initX = player.getxCoord();

		control.rightButton() ;
		if(initX != player.getxCoord()) {
			fail("Player position changing when paused");
		}
	}

	@Test
	public void testGameMovement() {
		System.out.println("Testing movement");
		//Sets state of game to resume
		engine.setGameState(new ResumeState(engine));

		Player player = (Player) engine.getLevel().getPlayer();
		int initX = player.getxCoord();

		//Moves the player, checks position updates
		control.rightButton();
		if(initX == player.getxCoord()) {
			fail("Player move left not updating");
		}
		initX = player.getxCoord();

		control.leftButton();
		if(initX == player.getxCoord()) {
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
		
		if(!(enemy.gethealthpoints() > 0)) {
			fail("No health value in enemy");
		}
		
		if(!(enemy.getname() instanceof String)) {
			fail("No name for enemy");
		}
		
		if(!(enemy.getxCoord() >= 0)) {
			fail("No X co-ord");
		}
		
		if(!(enemy.getyCoord() >= 0)) {
			fail("No Y co-ord");
		}
	}
	
	@Test
	public void checkPlayer() {
		System.out.println("Checking player created");
		engine.setGameState(new ResumeState(engine));
		
		Player player = (Player) engine.getLevel().getPlayer();
		
		if(!(player.gethealth() > 0)) {
			fail("Player health not generated");
		}
		
		if(!(player.getname() instanceof String)) {
			fail("Player name not generated");
		}
		
		if(!(player.getxCoord() >= 0)) {
			fail("Player X co-ord not created");
		}
		
		if(!(player.getyCoord() >= 0)) {
			fail("Player Y co-ord not created");
		}
	}
	
	@Test
	public void checkObjects() {
		System.out.println("Checking objects created");
		engine.setGameState(new ResumeState(engine));
		
		ArrayList<I_GameWorld_Object> obstacles = engine.getLevel().getObstacles();
		
		Obstacle obstacle = (Obstacle) obstacles.get(0);
		
		if(!(obstacle.getHeight() > 0)) {
			fail("Obstacle height not set");
		}
		
		if(!(obstacle.getObjectId() instanceof String)) {
			fail("Obstacle ID not set");
		}
		
		if(!(obstacle.getWidth() > 0)) {
			fail("Obstacle width not set");
		}
		
		if(!(obstacle.getX_Coord() > 0)) {
			fail("Obstacle X co-ord not set");
		}
		
		if(!(obstacle.getY_Coord() > 0)) {
			fail("Obstacle Y co-ord not set");
		}
	}

	@After
	public void closeGame() {
		//Closes the game
		control.offGame();
	}
}
