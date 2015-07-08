package 任务练习;

public class All {

	//~~~~~~~~~~
	public static void main(String[] args) {
		Army zuoye = new Army(5);// 定义一只军队，武器上限为6
		Weapon tank = new Tank();
		Weapon flighter = new Flighter();
		Weapon warship = new WarShip();
		// 定义三种武器。
		zuoye.addWeapon(tank);
		zuoye.addWeapon(flighter);
		zuoye.addWeapon(warship);
		zuoye.moveAll();
		zuoye.attackAll();
	}
}

