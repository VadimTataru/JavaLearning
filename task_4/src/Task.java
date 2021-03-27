import java.util.*;

public class Task {
    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        int k = 4;
        int[][] array = new int[m][n];

        array = FillMatrixRandom(array);
        PrintMatrix(array);

        System.out.println();

        array = SnakeShift(array, k);
        PrintMatrix(array);
    }

    public static int[][] SnakeShift(int[][] arr, int k) {
        int [][] arr1 = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i + k < arr.length) {
                    arr1[i+k][j] = arr[i][j];
                } else if(j+1 < arr[0].length) {
                    arr1[i+k-arr.length][j+1] = arr[i][j];
                } else {
                    arr1[i+k-arr.length][0] = arr[i][j];
                }
            }
        }

        return arr1;
    }

    public static void PrintMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] FillMatrixRandom(int[][] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = rand.nextInt(31);
            }
        }

        return arr;
    }

}
