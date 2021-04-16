public class Fibonacci {
    private int addCount = 0;

    public int getAddCount() { return addCount; }
    public void resetAddCount() { addCount = 0; }

    public int recursive(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                addCount++;
                return recursive(n - 1) + recursive(n - 2);
        }
    }

    public int iterative(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 2; i <= n; i++) {
            addCount++;
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public int recursiveAccum(int n) {
        return recursiveAccum(n, 0, 1);
    }

    private int recursiveAccum(int n, int a, int b) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return b;
            default:
                addCount++;
                return recursiveAccum(n - 1, b, a + b);
        }
    }

    public int cubesRecurr(int n) {
        if (n == 1) return 1;
        return cubesRecurr(n - 1) + n * n * n;
    }

    public int cubes(int n) {
        if (n == 1 || n == 0) return n;

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i * i * i;
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] input = {3, 10, 20};
        Fibonacci fib = new Fibonacci();
//        for (int i: input) {
//            System.out.println("Recursive solution for: " + i);
//            System.out.println(fib.recursive(i));
//            System.out.println("Addition count: " + fib.getAddCount());
//            System.out.println();
//            fib.resetAddCount();
//
//            System.out.println("Iterative solution for: " + i);
//            System.out.println(fib.iterative(i));
//            System.out.println("Addition count: " + fib.getAddCount());
//            System.out.println();
//            fib.resetAddCount();
//
//            System.out.println("Recursive Accumulator solution for: " + i);
//            System.out.println(fib.recursiveAccum(i));
//            System.out.println("Addition count: " + fib.getAddCount());
//            System.out.println();
//            fib.resetAddCount();
//        }
        System.out.println(fib.cubesRecurr(5));
        System.out.println(fib.cubes(5));

    }
}
