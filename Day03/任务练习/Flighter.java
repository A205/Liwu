package ������ϰ;

public class Flighter extends Weapon{
	
	public void move(){
		System.out.println("ս���ƶ�");
	}
	
	public void attack(){
		System.out.println("ս������");
	}
	
	//~~~~~~~~~~~
	
	public static void main(String[] args) {
		Flighter zuoye = new Flighter();
		zuoye.attack();
		zuoye.move();
	}
}
