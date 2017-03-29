package wdsr.exercise2.startthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BusinessServiceWithExecutor {
	private NumericHelper helper;
	private ExecutorService executorService;
	
	public BusinessServiceWithExecutor(NumericHelper helper) {
		this.helper = helper;
		this.executorService = Executors.newFixedThreadPool(1);
	}

	/**
	 * Calculates Fibonacci number asynchronously and invokes the callback when result is available.
	 * This method returns immediately. 
	 * @param n Which Fibonacci number should be computed.
	 * @param callback Callback to be invoked when Fibonacci number is found.
	 */
	public void computeFibonacci(int n, FibonacciCallback callback) {
		// TODO Task: execute the logic below using java.util.concurrent.ExecutorService
		// The ExecutorService should be declared as a field, not a local variable.
		MyRunnable myRunnable = new MyRunnable(helper, callback, n);
		executorService.execute(myRunnable);
		executorService.shutdown();
	}
}
