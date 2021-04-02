public class Practice {
    public int fibonacciRecursive(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacciRecursive(n -  1) + fibonacciRecursive(n - 2);
    }
    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.fibonacciRecursive(4));
    }
}
