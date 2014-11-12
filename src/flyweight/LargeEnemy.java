package flyweight;

public class LargeEnemy implements Enemy {
	
	 String name ;
	String type;
	float health;
	
	public LargeEnemy(String name,float health)
	{
		this.name = name;
		this.health = health ;
		this.type = "Large Enemy" ;
		
	}

	@Override
	public void setname(String name) {
		this.name = name ;
		
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setEnemytype(String type) {
		// TODO Auto-generated method stub
		this.type = type ;
	}

	@Override
	public String getEnemytype() {
		// TODO Auto-generated method stub
		return type ;
	}

	@Override
	public void setHealth(float hp) {
		this.health = hp * 300 + 50;
		
	}

	@Override
	public float getHealth() {
		// TODO Auto-generated method stub
		return this.health;
	}

}
