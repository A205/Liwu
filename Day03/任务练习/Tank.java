package 任务练习;

public class Tank extends Weapon{
	
	public void move(){
		System.out.println("坦克移动");
	}
	
	public void attack(){
		System.out.println("坦克攻击");
	}
	
	//~~~~~~~~~

	public static void main(String[] args) {
		Tank zuoye=new Tank();
		zuoye.attack();
		zuoye.move();
	}	
}