package practice;

import java.util.Scanner;


public class tables {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
	for(int i=1;i<=10;i++) {
		int a=i*number;
		System.out.println(number+"X"+i+"="+a);
			}
	}
}
