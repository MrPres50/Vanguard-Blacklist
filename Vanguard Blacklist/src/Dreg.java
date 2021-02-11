
public class Dreg extends Fallen{
	protected double speed = 7;
	
	
	public void attack()
	{
	damage += 20;	
	}
	public void printHealth()
	{
		System.out.println(health);
	}
	public void damage()
	{
		System.out.println(damage);
	}
  public void setDregHealth()
  {
    super.health = 120;
  }

}