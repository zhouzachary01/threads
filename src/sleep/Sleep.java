package sleep;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/9/26 14:51
 * @comment: 备注
 * @version: V1.0
 */
public class Sleep {

    public static void main(String [] args){

        SleepThread sleepThread = new SleepThread();
        Thread thread1 = new Thread(sleepThread,"a1");
        System.out.println("begin=" + System.currentTimeMillis());
        thread1.run();//直接调用线程run方法，main的线程被暂停2秒
        thread1.start();//启动线程，main和thread1的线程是异步执行的，所以会先打印，后执行thread1的线程；
        System.out.println("end=" + System.currentTimeMillis());
    }

}
