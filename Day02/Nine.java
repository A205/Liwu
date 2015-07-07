package dome;

public class Nine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//九九乘法表的程序
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println("");
		}
	}

}
