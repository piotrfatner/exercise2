package wdsr.exercise2.startthread;

import java.util.concurrent.Callable;

/**
 * Created by Piotr on 2017-03-29.
 */
public class MyCallable implements Callable<Integer> {
    private NumericHelper helper;

    public MyCallable(NumericHelper helper){
        this.helper = helper;
    }

    @Override
    public Integer call() throws Exception {
        return helper.nextRandom();
    }
}
