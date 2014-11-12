package flyweight;

import java.util.ArrayList;

public class EnemyClient {
	public static void main(String[] args) {
		ArrayList <Enemy> enemies = new ArrayList<Enemy>();
		//fac.createGameobject("enemy","Enemy1ee",200,445,23,change) ;
		for(int i = 0; i < 10000; i++) {
			Enemy nextEnemy = EnemyFactory.getEnemy("Enemy"+i + " ",(float)Math.random()*100);
			nextEnemy.setHealth(5);
			//nextEnemy.setname("Enemy"+i + " ");
			enemies.add(nextEnemy);
			//System.out.print(nextEnemy.getname());
			
//			if(Math.random() >= 0.5) {
//				nextEnemy.setEnemytype("Large Enemy");
//			} else {
//				nextEnemy.setEnemytype("Small Enemy");
//			}
			System.out.println(nextEnemy.getname()+" " + nextEnemy.getEnemytype() + " " + nextEnemy.getHealth());

			//nextEnemy.setHealth((float)Math.random());
			//System.out.println(nextEnemy.getHealth());
		}
		
	}
}
