package 任务练习;

public class Army {

	//~~~~~~~~~~
	public Weapon[]w;
	public int count=0;
	public Army(int a){
		this.w=new Weapon[a];
	}
	public void addWeapon(Weapon wa){
		if (count<w.length){
			w[count]=wa;
			count++;
		}
		else{
			System.out.println("无法装备武器");
		}
	}
		public void attackAll(){
			for (int i=0;i<count;i++){
				w[i].attack();
			}
		}
		public void moveAll(){
			for (int i=0;i<count;i++){
				w[i].move();
			}
		}
}

