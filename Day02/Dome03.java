package dome;

public class Dome03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//用for语句求1-100的素数
		for(int i=2;i<=100;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(i);
			}
		}
	}
}
