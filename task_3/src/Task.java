import java.util.*;

public class Task {
    public static void main(String[] args) {
        int n = 6;
        int[] arrX = new int[n];
        int[] arrY = new int[n];

        arrX = FillArray(arrX);
        arrY = FillArray(arrY);

        Intersection(arrX, arrY);
    }

    public static int[] FillArray(int [] arr) {
        Random rand = new Random();
        ArrayList<Integer> arrList = new ArrayList<>();
        while (arrList.size() < arr.length) {
            int v = rand.nextInt(2*arr.length + 1);
            if(!arrList.contains(v)) {
                arrList.add(v);
            }
        }
        arr = arrList.stream().mapToInt(i -> i).toArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        return arr;
    }

    public static void Intersection(int[] arr_1, int[] arr_2) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr_1.length; i++) {
            for (int j = 0; j < arr_2.length; j++) {
                if(arr_1[i] == arr_2[j]) {
                    arrList.add(arr_1[i]);
                }
            }
        }
        System.out.print(arrList);
    }

}
