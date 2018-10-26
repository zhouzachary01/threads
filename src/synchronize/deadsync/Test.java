package synchronize.deadsync;

/**
 * @description: 线程的死锁;
 * @author: 周海涛
 * @date: 2018/10/24 9:48
 * @comment: 备注
 * @version: V1.0
 */
public class Test {

    //线程的死锁是程序设计的bug，在设计程序时，要避免双方互相持有对方的锁的情况；
    //只要互相等待对方释放锁，就有尽可能出现死锁；

    public static void main(String [] args){
        try {
            DeadThread d1 = new DeadThread();
            d1.setFlag("a");
            Thread t1 = new Thread(d1);
            t1.start();
            Thread.sleep(1000);
            d1.setFlag("b");
            Thread t2 = new Thread(d1);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
