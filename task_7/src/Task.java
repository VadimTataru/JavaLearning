import java.util.Stack;

public class Task {
    public static void main(String[] args) {

        System.out.println("Результат: " + Binom(11,13));
    }

    public static long Factorial(int k) {
        long result = 1;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 1; i < k; i++) {
            stack.push(i+1);
        }

        if(k == 0 || k == 1) {
            return result;
        } else if(k > 1) {
            for(int i = 1; i < k; i++) {
                result *= stack.pop();
            }
        }

        return result;
    }

    public static int Binom(int m, int n){
        int k = n-m;
        if(m == 0 || m == n) {
            return 1;
        } else {
            return (int)(Factorial(n) / (Factorial(m) * Factorial(k)));
        }
    }

}
