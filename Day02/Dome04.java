package dome;

import java.time.chrono.JapaneseChronology;

public class Dome04 {

 public static void main(String [] args) {
	 
	 int sum=0;
	 int all[]=new int[20];//学生总分
	 
	 int ping01[]=new int[5];
	 int ping[]=new int[5];//平均值
	 
	 //为20*5二维数组赋予0~100随机值
	 int score[][]=new int[20][5];
	 for(int i=0;i<20;i++)
	 {
		 for(int j=0;j<5;j++)
		 {
			 float b=(float) Math.random()*100;
			 score[i][j]=(int) b;
		 }
	 }
 
	 //列表的形式输出各位学生的成绩
	 String name[]={"C++","Java","Servlet","JSP","EJB"};
	 for(int i=0;i<5;i++)
	 {
		 System.out.print(name[i]+"\t");
	 }
	 System.out.println();
	 
	 for(int i=0;i<20;i++)
	 {
		 for(int j=0;j<5;j++)
		 {
			 System.out.print(score[i][j]+"\t"); 
			 all[i]+=score[i][j];//求每个人的总分
		 }
		 System.out.println();
		 
	 }
	 
	 
 //从all[0]到all[19]就是每个人的总分
	 for(int i=0;i<all.length;i++)
	 {
		 System.out.println("第"+i+"个人总分"+all[i]);
	 }
 
//求每科的平均分
	for(int j=0;j<5;j++)
	{
		for(int i=0;i<20;i++)
		{
			ping01[j]+=score[i][j];
		}
		ping[j]=ping01[j]/20;
		System.out.println(name[j]+"的平均分"+ping[j]);
	}
 }
}



