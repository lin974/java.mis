import java.util.Scanner;
public class binarysearch0502 {
    public static int binarySearch(int []arr,int target,
int left, int right){
    int ans;
    int mid = (int)(left+right)/2;
    if(left == right && arr[left]!=target){
        return -1;
    }
    if(arr[mid]<target){
        ans = binarySearch(arr, target, mid, right-1);
    }else if(arr[mid]>target){
        ans = binarySearch(arr, target, left, mid-1);

    }else{
        ans = mid;
    }
    return ans;


}
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7,9,11};
        int target1 = 7;
        int arr2[] = {2,4,6,8,10};
        int target2 = 5;
        System.out.println("arr1 ");
        System.out.println(binarySearch(arr1, target1, 0, arr1.length-1));

        System.out.println("arr2 ");
        System.out.println(binarySearch(arr2, target2, 0, arr2.length-1));

        
    }
    
}
