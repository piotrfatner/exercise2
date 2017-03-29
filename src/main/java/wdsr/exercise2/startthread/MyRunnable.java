package wdsr.exercise2.startthread;

/**
 * Created by Piotr on 2017-03-29.
 */
public class MyRunnable implements Runnable {
    private NumericHelper helper;
    private FibonacciCallback callback;
    private int n;

    public MyRunnable(NumericHelper helper, FibonacciCallback callback, int n){
        this.helper = helper;
        this.callback = callback;
        this.n = n;
    }

    @Override
    public void run() {
        long value = helper.findFibonacciValue(n);
        callback.fibonacciComputed(value);
    }
}
