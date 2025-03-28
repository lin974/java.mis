package ex04;

import java.util.Scanner;
public class test321 {
	public static void main(String[] args) {
		
		int total = 0;
		int num =  scn.nextInt();
		for(int i = 0;i<=num;i++) {
			if(i%3 == 0 || i%5 == 0) {
				if(i%7 !=0) {
					continue;
				}
			}
			total+=i;
		}
		System.out.printf("符合條件的數字為 %d", total);
		scn.close();
	}

}
