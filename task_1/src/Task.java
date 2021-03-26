import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numsCount = 0;

        System.out.printf("Введите колличество чисел: ");
        numsCount = in.nextInt();

        double [] nums = new double[numsCount];

        for (int i = 0; i < numsCount; i++) {
            System.out.printf("Введите число [%d]", i+1);
            nums[i] = in.nextDouble();
            System.out.println(nums[i]);
        }

        bubbleSort(nums);

        System.out.printf("Введённые числа:\n");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\n Второе минимальное значение:" + nums[nums.length-2]);
    }

    public static void bubbleSort(double[] num) {
        int j;
        boolean flag = true;   // устанавливаем наш флаг в true для первого прохода по массиву
        double temp;   // вспомогательная переменная

        while (flag) {
            flag = false;    // устанавливаем флаг в false в ожидании возможного свопа (замены местами)
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) { // измените на > для сортировки по возрастанию
                    temp = num[j];         // меняем элементы местами
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;  // true означает, что замена местами была проведена
                }
            }
        }
    }
}
