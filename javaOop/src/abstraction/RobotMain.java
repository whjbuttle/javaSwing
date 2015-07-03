package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		
		// 디자인 패턴 : 데코레이션 패턴
		
		BasicBot myBot = new BasicBot();
		GunBot myGun = new GunBot(myBot);
		ShieldBot myShield = new ShieldBot();
		
		myGun.status();
		myGun.chargeEnergy(50);
		myGun.status();
		myGun.shield(30);
		myGun.run();
		myGun.status();
		
		/*myShield.status();
		myShield.chargeEnergy(50);
		myShield.status();
		myShield.run();
		myShield.status();*/
	}
}
