package ������ϰ;

public class WarShip extends Weapon{
	
	public void move(){
		System.out.println("ս���ƶ�");
	}
	
	public void attack(){
		System.out.println("ս������");
	}
	
	//~~~~~~~~
	
	public static void main(String[] args) {
		WarShip zuoye = new WarShip();
		zuoye.attack();
		zuoye.move();
	}
}
