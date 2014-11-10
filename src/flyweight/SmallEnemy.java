package flyweight;

public class SmallEnemy implements Enemy {
private String name ;
private  String type ;
private float health;

  public SmallEnemy(String name,float health)
   {
	this.name = name;
	this.health = health ;
	this.type = "Small Enemy" ;
	
  }



	public float health(float hp) {
		hp = hp * 100 + 50;
		return hp;
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
	
	public void setEnemytype(String type)
	{
		this.type =type ;
	}
	

	@Override
	public String getEnemytype() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public void setHealth(float hp) {
		// TODO Auto-generated method stub
		this.health = hp * 50 + 100;
	}

	@Override
	public float getHealth() {
		// TODO Auto-generated method stub
		return this.health;
	}

}
