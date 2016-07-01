/**
 * author:weiyue xie
 * email:xiewygz@163.com
 * the script is used to compute the number of the peak the mum buy.
 */
package cn.edu.scnu.xiewygz;

import java.util.Scanner;

public class Recursion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(System.in);
		//String str = input.nextLine();
		System.out.println("My name is WeiYue,nice to see you.");
		//System.out.println(str);
		int number = BuyNut(3);
		System.out.println("小明妈妈一共买的桃子数为："+number);
		
	}
	static int BuyNut(int days){
		/**
		 * 用递归方式计算所买桃子数，每天吃掉一半再加上一个，最后一天剩1个，问一共有多少个桃子。
		 */
		if (days == 1)
			return 1;
		else 
			return 2*(BuyNut(days-1))+2;
	}

}
