package factory;

import java.util.HashMap;

public class GameEnemyFactory extends AbstractFactory {
	HashMap<String, Enemy> enemyTypes = new HashMap<String, Enemy>();

	public Enemy createEnemy(String type,String name,int x,int y,ChangeManager changemanager) {
		Enemy enemy = (Enemy) enemyTypes.get(type);

		//Checks for enemy type
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
	public GameObject createGameobject(String type, String name, int health,int x, int y, ChangeManager changemanager) {
	    System.out.println("Wrong Factory");
		return null;
	}
}
