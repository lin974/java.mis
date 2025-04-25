package ex06;

public class hw04251 {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 30, 40, 50};
        double newarr[]; // 宣告 newarr 陣列
        newarr = modifyArray(arr); 

        // 印出新陣列內容
        System.out.print("被修改後的陣列內容:");
        for (double val : newarr) { // 修正型別為 double
            if (val == (int) val) { // 去掉小數點後的 .0
                System.out.printf("%d  ", (int) val);
            } else {
                System.out.printf("%.1f  ", val); // 正確格式化浮點數
            }
        }

        System.out.println();

        double avg; // 計算並印出平均值
        avg = average(newarr);
        System.err.println("平均值為: "+avg);
    }

    static double[] modifyArray(int[] arr) {
        double[] result = new double[arr.length]; // 建立新的 double 陣列
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] / 10.0; 
        }
        return result; // 回傳新陣列
    }

    static double average(double[] arr) { // 修改參數型別為 double[]
        double total = 0; // 使用浮點數計算總和
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length; // 返回浮點數平均值
    }
}