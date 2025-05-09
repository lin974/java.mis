package ex06;
import java.util.Arrays;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 5, 7, 9, 11, 13};
        int[] arr2 = new int[]{2, 4, 6, 8, 10};
        System.out.println(binarySort(arr1, 7));
        System.out.println(binarySort(arr2, 5));
    }

    static int binarySort(int[] a, int b) {
        int along = a.length;
        int half = along / 2;

        // 基本情況處理
        if (along == 0) {
            return -1;  // 如果陣列為空，返回 -1
        }

        if (a[half] == b) {
            return half;  // 如果找到目標元素，返回索引
        } else if (a[half] < b) {
            int[] arr = Arrays.copyOfRange(a, half + 1, along);
            int result = binarySort(arr, b);
            if (result == -1) {
                return -1;  // 沒有找到
            }
            return half + 1 + result;  // 計算相對於原始陣列的位置
        } else {
            int[] arr = Arrays.copyOfRange(a, 0, half);
            return binarySort(arr, b);  // 繼續搜尋左半邊
        }
    }
}
