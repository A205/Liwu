package ������ϰ;

public class Tank extends Weapon{
	
	public void move(){
		System.out.println("̹���ƶ�");
	}
	
	public void attack(){
		System.out.println("̹�˹���");
	}
	
	//~~~~~~~~~

	public static void main(String[] args) {
		Tank zuoye=new Tank();
		zuoye.attack();
		zuoye.move();
	}	
}