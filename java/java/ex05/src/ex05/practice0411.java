package ex05;
public class practice0411 {
    public static void main(String[] args) {
        int temp;
        int anum[] = {8,3,5,4,9,2};
        for(int i = 0;i< anum.length-1;i++){
            for(int j = 0;j<anum.length-1;j++){
                if(anum[j]>anum[j+1]){
                    temp = anum[j];
                    anum[j] = anum[j+1];
                    anum[j+1] = temp;
                }

            }
            System.out.print("Pass "+(i+1)+": ");
            for(int a =0;a< anum.length;a++){
                
                System.out.print(anum[a]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("Sorted result:");
        for(int a =0;a< anum.length;a++){
                
            System.out.print(anum[a]+" ");
        }
    }
    
}
