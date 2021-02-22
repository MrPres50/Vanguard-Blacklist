
public class Dreg extends Fallen{
	
	protected double health;
	protected double speed;
	protected double damage;
	protected double attackModifiers;
	protected double healthModifiers;
	
	public Dreg (double h, double s, double d, double aM, double hM)
	{
		health = h;
		speed = s;
		damage = d;
		attackModifiers = aM;
		healthModifiers = hM;
	}
	
	
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