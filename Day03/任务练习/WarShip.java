package 任务练习;

public class WarShip extends Weapon{
	
	public void move(){
		System.out.println("战船移动");
	}
	
	public void attack(){
		System.out.println("战船攻击");
	}
	
	//~~~~~~~~
	
	public static void main(String[] args) {
		WarShip zuoye = new WarShip();
		zuoye.attack();
		zuoye.move();
	}
}
