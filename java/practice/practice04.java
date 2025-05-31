import java.util.Scanner;
public class practice04{
    public static void modifyArray(int[] array) {
        len = array.length;
        for(i= 0;i<len;i++){
            array[i] = array[i]/10;

        }

    }
    public static double average(int[] scores){
        int zero = 0;
        for(int a = 0;a<scores.length;a++){
            zero+=scores[a];
        }
        double avg = (double)zero/scores.length;
        return avg;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int arr[] = {10, 20, 30, 40, 50};
        int num = arr.length;
        for(int j = 0;j<num;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println("avg="+average(arr));

        
        
        scn.close(); 
    }

}


    

