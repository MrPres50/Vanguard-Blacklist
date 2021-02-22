
public abstract class Enemy {
	
	protected double health;
	protected double speed;
	protected double damage;
	protected double attackModifiers;
	protected double healthModifiers;
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
