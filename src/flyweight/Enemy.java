package flyweight;

public interface Enemy {

	//String name = "Bob";
   public void setname(String name);
   public String getname() ;
   public void setEnemytype(String type);
   public String getEnemytype();
   public void setHealth(float hp);
   public float getHealth();
}
