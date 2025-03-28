package ex05;
import java.util.Scanner;
public class test20328 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num =  scn.nextInt();
        int numar[][] = new int[num][num];
        for(int a =0;a<num;a++){
            for(int b =0;b<num;b++){
                if(a == b){
                    numar[a][b] = 1;
                }else{
                    numar[a][b] = 0;
                }
            }
        }
        for(int a =0;a<num;a++){
            for(int b =0;b<num;b++){
                System.out.print(numar[a][b]);
            }
            System.out.println();
        }
        scn.close();
    }

    
}
