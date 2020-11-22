package com.aiguigu.day02;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入第一个数： ");
		int num1 = scan.nextInt();
		System.out.println("请输入第二个数： ");
		int num2 = scan.nextInt();
		System.out.println("请输入第三一个数： ");
		int num3 = scan.nextInt();
		int a = 0;
		if(num1 > num2) {
			a = num2;
			num2 = num1;
			num1 = a;
			
		}
		System.out.println("从小到大：" + num1 + "  , " + num2);
		if(num1 < num3) {
			if(num2 < num3 ) {
				
			}else {
				a = num3;
				num3 = num2;
				num2 = a;
			}
		}else {
			a = num1;
			num1 = num3;
			num3 = a;
		}
		System.out.println("从小到大：" + num1 + "  , " + num2 + " , " + num3);
	}
}
