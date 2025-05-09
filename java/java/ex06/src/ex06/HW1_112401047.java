package ex06;

public class HW1_112401047 {
    class HW2 {
        public static void main(String[] args) {
            int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            rotate(matrix1);
            printMatrix(matrix1);
    
            System.out.println("--------------------------------");
    
            int[][] matrix2 = {
                {15, 3, 19, 32, 1, 11},
                {22, 8, 27, 17, 26, 4},
                {10, 29, 20, 21, 6, 18},
                {5, 23, 28, 33, 9, 2},
                {24, 16, 30, 7, 14, 12},
                {13, 25, 31, 34, 36, 35}
            };
            rotate(matrix2);
            printMatrix(matrix2);
    
            System.out.println("--------------------------------");
    
            int[][] matrix3 = {
                {76, 4, 55, 82, 24, 13, 64, 19, 43, 48},
                {42, 10, 87, 66, 3, 53, 27, 58, 45, 79},
                {92, 50, 98, 5, 20, 100, 11, 36, 60, 21},
                {90, 29, 15, 84, 23, 70, 77, 26, 96, 57},
                {89, 68, 41, 71, 34, 1, 54, 73, 2, 37},
                {97, 6, 44, 91, 75, 63, 14, 56, 62, 80},
                {46, 81, 85, 78, 18, 17, 52, 94, 31, 30},
                {86, 47, 67, 33, 9, 7, 22, 83, 74, 12},
                {32, 28, 65, 40, 39, 95, 61, 35, 88, 59},
                {25, 38, 72, 16, 93, 8, 69, 49, 51, 99}
            };
            rotate(matrix3);
            printMatrix(matrix3);         
        }
    
        private static void rotate(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            int[][] newmartix = new int[row][col];
            for(int i = 0;i<row;i++){
                for(int j= 0;j<col;j++){
                    newmartix[j][row-i-1] = matrix[i][j];
                }
           
            }
            for(int i = 0;i<row;i++){
                for(int j= 0;j<col;j++){
                   matrix[i][j] = newmartix[i][j];
                }
           
            }
            
        }
    
        private static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
    
}
