package synchronize;

/**
 * @description: 检验同步锁的不继承性（父类）;
 * @author: 周海涛
 * @date: 2018/10/19 9:09
 * @comment: 备注
 * @version: V1.0
 */
public class Main {

    synchronized public void serviceMethod(){
        try {
            System.out.println("main begin threadmethodName=" + Thread.currentThread().getName() + "  time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("mian end threadmethodName=" + Thread.currentThread().getName() + "  time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
