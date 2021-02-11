
public abstract class Enemy {
	
	public double health = 100;
	protected double speed;
	protected double damage;
	public double attackModifiers = 1;
	protected double healthModifiers = 0;
	public abstract void attack();
	
	public void takeDamage(double damage)
	{
		healthModifiers = damage;
		health -= healthModifiers;
	}
	
	public void checkHealth()
	{
		if (health < 1)
		{
			System.out.println("Your character has died.");
		}
		else
		{
			System.out.println("The Battle continues.");
		}
	}
	public void resetDamage()
	{
		damage = 0;
	}
	public double damageNum()
	{
		return damage;
	}

	

}
