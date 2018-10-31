package threadsTransData.waitnotify;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/30 9:30
 * @comment: 备注
 * @version: V1.0
 */
public class Test {
    /*
       每个锁都有两个队列，一个是就绪队列，一个是阻塞队列，就绪队列存储了将要获得锁的线程，阻塞队列存储量被阻塞的线程，一个线程被唤醒后，
       才会进入就绪队列，等待CPU的调度，一个线程被wait后，就会进入阻塞队列，等待下一次被唤醒；
     */

    public static void main(String [] args){

        try {
            Object lock = new Object();
            TaskA taskA = new TaskA(lock);
            taskA.start();
            Thread.sleep(1000);
            TaskB taskB = new TaskB(lock);
            taskB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*try {
            String lock = new String();
            synchronized (lock){
                System.out.println("同步块之前");
                String newString = new String("");
                lock.wait();
                Thread.sleep(1000);
                lock.notify();
                System.out.println(111);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

}
