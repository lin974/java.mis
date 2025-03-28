package ex03;

import java.util.Scanner;

public class ttest2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char grade;
		System.out.print("請輸入成績(0-100)");
		int x = scn.nextInt();
		if(x<100 && x>0) {
			
		switch(x/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
		default:
			grade ='F';
				}
	}else {
		System.out.print("error");
		
	}
	System.out.println("等級: "+grade);
	}
}
