package dome;

import java.util.Scanner;

public class Dome01 {

	/**
	 * @param args
	 */
	
	//用switch语句的例子
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int day=scanner.nextInt();
		String dayString="";
		switch(day)
		{
		case 1:dayString="星期一";break;
		case 2:dayString="星期二";break;
		case 3:dayString="星期三";break;
		case 4:dayString="星期四";break;
		case 5:dayString="星期五";break;
		case 6:dayString="星期六";break;
		case 7:dayString="星期日";break;
		default :dayString="错误";
		}
		
		System.out.println(dayString);
		
	}

}
