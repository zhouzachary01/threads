package interrupt;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/9/26 16:14
 * @comment: 备注
 * @version: V1.0
 */
public class Interrupt {

    public static void main(String [] args){

        try {
            InterruptThread interruptThread = new InterruptThread();
            interruptThread.start();
            Thread.sleep(1);
            //System.out.println(thread1.interrupted());//监测的那份钱线程是否已经中断；
            //thread1.stop();//线程暴力停止；
            interruptThread.interrupt();//停止线程；
            //System.out.println(thread1.interrupted());//监测的那份钱线程是否已经中断；
            //thread1.stop();//线程暴力停止；
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
