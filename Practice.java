/**
 * author:weiyue xie
 * email:xiewygz@163.com
 * the function of the script is to get a string from user and reverse it .
 */
package cn.edu.scnu.xiewygz;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = getString();
		System.out.println(reverseTheString(str));

	}
	static String getString(){
		/**
		 * get the input string from console.
		 */
		System.out.println("please enter the senctence you want to reverse:");
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	static String reverseTheString(String str){
		/**
		 * reverse the sectence you pass into the function.
		 */
		String[] words = str.split(" ");
		String rev = "";
		for(int i = words.length -1;i>=0;i--){
			rev += words[i]+ " ";
		}
		return rev;
	}
	

}
