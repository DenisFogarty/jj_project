package flyweight;

public class EnemyFactory {
	
	public static Enemy ENEMY;
	
	public static Enemy getEnemy(String name,float health) {
		
		
			if(Math.random() >= 0.5) {
				ENEMY = new LargeEnemy(name,health);
			}
			else {
				ENEMY = new SmallEnemy(name,health);
			}
		
		return ENEMY;
		
	}
	
}
