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
		System.out.println("С������һ�����������Ϊ��"+number);
		
	}
	static int BuyNut(int days){
		/**
		 * �õݹ鷽ʽ����������������ÿ��Ե�һ���ټ���һ�������һ��ʣ1������һ���ж��ٸ����ӡ�
		 */
		if (days == 1)
			return 1;
		else 
			return 2*(BuyNut(days-1))+2;
	}

}
