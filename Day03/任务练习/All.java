package ������ϰ;

public class All {

	//~~~~~~~~~~
	public static void main(String[] args) {
		Army zuoye = new Army(5);// ����һֻ���ӣ���������Ϊ6
		Weapon tank = new Tank();
		Weapon flighter = new Flighter();
		Weapon warship = new WarShip();
		// ��������������
		zuoye.addWeapon(tank);
		zuoye.addWeapon(flighter);
		zuoye.addWeapon(warship);
		zuoye.moveAll();
		zuoye.attackAll();
	}
}

