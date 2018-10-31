package threadsTransData;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/30 11:03
 * @comment: 备注
 * @version: V1.0
 */
public class Service {
    public void testMethod(Object lock){
        try {
            synchronized (lock){

                System.out.println("begin wait()" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
                Thread.sleep(3000);
                lock.wait();
                System.out.println("end wait()" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
