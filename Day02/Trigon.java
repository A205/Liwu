package dome;

import java.util.Scanner;



public class Trigon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//三角形图案练习
		Scanner input=new Scanner(System.in);
		System.out.println("请输入行号：");
		int num=input.nextInt();
		
		//打印空格
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-i;j++)
			{
				System.out.print(" ");
			}
			
		//打印数字
			for(int k=1;k<=2*i-1;k++)
			{
				
				System.out.print(Integer.toHexString(i));//转换成16进制输出
			
			}
		System.out.println();	
		}
		
	}

}
