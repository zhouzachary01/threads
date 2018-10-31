package threadsTransData.waitInterruptException;

import threadsTransData.Service;
import threadsTransData.Thread1;

/**
 * @description:线程间的通信;
 * @author: 周海涛
 * @date: 2018/10/29 16:46
 * @comment: 备注
 * @version: V1.0
 */
public class Test {
    /*
     当线程呈wait()状态时，调用线程对象的interrupt()方法会出现InterruptedException异常
    */


    public static void main(String[] args) {
        try {
            Object lock = new Object();
            Service s1 = new Service();
            Service s2 = new Service();
            Thread1 t1 = new Thread1(lock,s1);
            t1.setName("t1");
            t1.start();
            Thread.sleep(5000);
            t1.interrupt();
       /* Thread2 t2 = new Thread2(lock,s2);
        t1.setName("t2");
        t2.start();*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
