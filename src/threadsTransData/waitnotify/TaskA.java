package threadsTransData.waitnotify;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/30 10:19
 * @comment: 备注
 * @version: V1.0
 */
public class TaskA extends Thread{

    private Object lock;
    public TaskA(Object lock){
        this.lock = lock;
    }

    @Override
    public void run(){

        try {
            synchronized (lock){
                if(MyList.size() != 5){
                    System.out.println("wait begin time = " + System.currentTimeMillis());
                    System.out.println("开始等待");
                    lock.wait();
                    System.out.println("wait end time = " + System.currentTimeMillis());
                    System.out.println("结束等待");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*try {
            synchronized (lock){
                System.out.println("开始wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束wait time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

}
