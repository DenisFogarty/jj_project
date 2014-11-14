package factory;

import java.util.HashMap;

import Flyweight.Enemy;
import Flyweight.GameEntity;
import Flyweight.I_GameWorld_Object;
import Flyweight.I_enemy;
import observer.ChangeManager;

//implements the flyweight pattern to conserve memory when creating enemies
public class GameEnemyFactory extends AbstractFactory {
	
	HashMap<String, I_enemy> enemyTypes = new HashMap<String, I_enemy>();//enemy object pool

	public I_enemy createEnemy(String type,String name,int x,int y,ChangeManager changemanager) {
		I_enemy enemy =  enemyTypes.get(type);

		if(enemy == null) {
			if(type.equals("small enemy")) {
				enemy = new Enemy(name, 100, x, y, changemanager);
				enemyTypes.put("Small enemy", enemy);
			}
			else if(type.equals("regular enemy")) {
				enemy = new Enemy(name, 200, x, y, changemanager);
				enemyTypes.put("Regular enemy", enemy);
			}
			else if(type.equals("large enemy")) {
				enemy = new Enemy(name, 300, x, y, changemanager);
				enemyTypes.put("Large enemy", enemy);
			}
		}
		return enemy;
	}

	@Override
	public GameEntity createGameobject(String type, String name, int health,int x, int y, ChangeManager changemanager) {
	    System.out.println("Wrong Factory");
		return null;
	}

	@Override
	public I_GameWorld_Object createGameWorldobject(String type, String id,
			int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		return null;
	}
}
