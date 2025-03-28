package ex05;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int aarray[] = new int[5];
    for(int i = 0; i<5 ; i++){
        System.out.printf("請輸入第 %d 同學的成績", i+1);
        int num =  scn.nextInt();
        aarray[i] = num;
        
    }
    int numa = 0;
    int sum = 0;
    for(int a = 0;a<5;a++){
        if(aarray[a] !=0){
            sum+=aarray[a];
            numa++;
        }
    }
    System.out.println("有效成績共有 " + numa + " 筆");

    System.out.printf("有效平均成績為 %.2f%n", (float) sum / numa);


    scn.close();
    }
}
