public abstract class Hive extends Enemy
{

	public abstract void attack();
	public void useSoulfire()
	{
		attackModifiers += 0.5;
	}

}

