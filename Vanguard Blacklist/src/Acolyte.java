
public class Acolyte extends Hive {
	
	protected double speed;
	protected double health;
	
	public void attack()
	{
	damage += 20;	
	damage = damage * attackModifiers;
	}
	public void printHealth()
	{
		System.out.println(health);
	}
	public double damageNum()
	{
		return damage;
	}

}
