public class ProdFib { // must be public for codewars

    public static long[] productFib(long prod) {
        // your code
        return ProdFib.isGreater(new Fib(), prod);
    }

    public static long[] isGreater(Fib fib, long prod) {
        if ((fib.fibOne * fib.fibTwo) < prod) {
            return isGreater(new Fib(fib), prod);
        } else if ((fib.fibOne * fib.fibTwo) == prod) {
            return new long[]{fib.fibOne, fib.fibTwo, 1};
        } else {
            return new long[]{fib.fibOne, fib.fibTwo, 0};
        }
    }
}


class Fib {
    public long fibOne;
    public long fibTwo;

    public Fib() {
        this.fibOne = 0;
        this.fibTwo = 1;
    }

    public Fib(Fib fib) {
        this.fibOne = fib.fibTwo;
        this.fibTwo = fib.nextNumber();
    }

    public long nextNumber() {
        return fibOne + fibTwo;
    }


}