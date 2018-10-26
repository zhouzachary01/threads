package volatiles.atomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/25 10:07
 * @comment: 备注
 * @version: V1.0
 */
public class MyService {

    public static AtomicLong aiRef = new AtomicLong();
    public static Long lo = new Long(0);

    synchronized public void addNum(){
        /*System.out.println(Thread.currentThread().getName() + "加了100后的值是:" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);*/


        lo += 100;
        System.out.println(Thread.currentThread().getName() + "加了100后的值是:" + lo);
        lo += 1;


    }

}
