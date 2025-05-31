import java.util.Scanner;
public class bublehw {
        
    public static void main(String[] args) {
        int a[] = {8, 3, 5, 4, 9, 2};
        int temp;
        int n = a.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-1;j++){
                if(a[j]<a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int c =0;c<n;c++){
             System.out.print(a[c]);
             System.out.print(" ");
        }
            
    }
    
}
