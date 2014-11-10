package factory;

public class FactoryTest {

public static void main(String[] args)
{
	//GameObjectfactory fac = new GameObjectfactory() ;
	AbstractFactory abstractfacP = FactoryCreator.getFactory("player");
	GameEnemyFactory enemyFactory = new GameEnemyFactory();
	
	//Player play = (Player) fac.createGameobject("player","Player1", 100,23, 12);
	ChangeManager change = new ChangeManager();
	//AbstractFactory abstractfac = FactoryCreator.getFactory("regular enemy");
	Enemy enemy = FactoryCreator.getFactory("regular enemy").createEnemy("regular enemy", "Bob", 50, 25, change);
	
	//Enemy enemy = abstractfac.createEnemy("regular enemy", "Bob", 50, 25, change);
	Enemy enemy2 = FactoryCreator.getFactory("small enemy").createEnemy("small enemy", "George", 75, 30, change);
//	Enemy gameo =(Enemy) fac.createGameobject("enemy","Enemy1",200,45,23,change) ;
//	Enemy gameo3 =(Enemy) fac.createGameobject("enemy","Enemy1ee",200,445,23,change) ;
	//fac.createGameobject("enemy","Enemy1",200,45,23) ;
	System.out.println();
//	System.out.println(gameo.toString()) ;
	System.out.println();
	Player gameo2 =(Player) FactoryCreator.getFactory("player").createGameobject("player","Playa",200,0,56,change) ;
//	gameo3.attachsuib(gameo2);
//	gameo.attachsuib(gameo2);

	gameo2.attach(enemy) ;
	gameo2.attach(enemy2) ;
	enemy.attach(gameo2) ;
	enemy2.attach(gameo2) ;
	gameo2.move();
	System.out.println(gameo2.toString());


//	Enemy en =	(Enemy) fac.createGameobject("enemy","Enemy1",200,45,23) ;

}
	
}
