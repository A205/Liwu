package lianxi;

import java.util.Scanner;

public class Exe04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("|1、增加1个姓名|");
		System.out.println("|2、显示全部姓名|");
		System.out.println("|3、退出程序|");
		System.out.println("|请输入选择（1-3）：");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		String aString="";
		switch(num)
		{
		case 1:aString="|增加1个姓名|";break;
		case 2:aString="|显示全部姓名|";break;
		case 3:aString="|退出程序|";break;
		}
		System.out.println(aString);
	}

}

