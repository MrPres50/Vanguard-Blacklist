
public abstract class Fallen extends Enemy
{
	
	public void consumeEther()
	{
		if (health >= 140)
		{
			super.health = 200;
		}
		else
		{
			super.health += + 60;
		}
	}

}