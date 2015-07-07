package dome;

public class Arr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ã°ÅÝÅÅÐò
		int c[]=new int[]{8,5,7,3,6};
		int t=0;
		for(int i=c.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(c[i]<c[j])
				{
					t=c[i];
					c[i]=c[j];
					c[j]=t;
				}
			}
		}
		for(int k=0;k<c.length;k++)
		{
			System.out.println(c[k]);
		}
	}

}
