package 任务练习;

public class Flighter extends Weapon{
	
	public void move(){
		System.out.println("战机移动");
	}
	
	public void attack(){
		System.out.println("战机攻击");
	}
	
	//~~~~~~~~~~~
	
	public static void main(String[] args) {
		Flighter zuoye = new Flighter();
		zuoye.attack();
		zuoye.move();
	}
}
