package fibonacci;

/**
 * Fibonacci
 *
 * @CreatedBy MKgn
 */
class Fibonacci {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        System.out.println(fibonacci.fib(2));

    }

    int fib(int n) {
        //a(n) = a(n -1) + a(n - 2)
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
