
public class mainRunner {

	public static void main(String[] args) {
		Acolyte player1 = new Acolyte();
		Dreg player2 = new Dreg();
		Enemy test = new Dreg();
		
		player1.printHealth();
		test.attack();
		double attackDamage = test.damageNum();
		player1.takeDamage(attackDamage);
		player1.printHealth();
		
		System.out.println();
		
		player2.printHealth();
		player2.consumeEther();
		player2.printHealth();
		
		player1.attack();
		attackDamage = player1.damageNum();
		player2.takeDamage(attackDamage);
		player2.printHealth();
		player1.attack();
		player1.attack();
		player1.attack();
		player1.attack();
		player1.attack();
		player1.attack();
		player1.attack();
		attackDamage = player1.damageNum();
		player2.takeDamage(attackDamage);
		player2.checkHealth();
		
		System.out.println("");
		
		Dreg poorSoul = new Dreg();
		player1.resetDamage();
		player1.useSoulfire();
		player1.attack();
		attackDamage =player1.damageNum();
		poorSoul.takeDamage(attackDamage);
		poorSoul.printHealth();
		poorSoul.consumeEther();
		poorSoul.printHealth();
		poorSoul.checkHealth(); 
		
		player2.setDregHealth();
		player2.printHealth();
		player2.consumeEther();
		player2.printHealth();
	}
}
