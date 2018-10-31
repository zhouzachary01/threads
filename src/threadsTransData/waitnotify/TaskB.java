package threadsTransData.waitnotify;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/30 10:23
 * @comment: 备注
 * @version: V1.0
 */
public class TaskB extends Thread {

    private Object lock;
    public TaskB (Object lock){
        this.lock = lock;
    }

    @Override
    public void run(){

        try {
            synchronized (lock){
                for(int i = 0;i < 10;i ++){
                    MyList.add();
                    if(MyList.size() == 5){
                        lock.notify();//通知唤醒另一个等待的锁，但是要等到此线程获取到的对象锁执行完成，才会释放锁
                        System.out.println("已发出通知。。。");
                    }
                    System.out.println("添加了 " + (i + 1) + "个元素");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*try {
            synchronized (lock){
                System.out.println("开始notify time=" + System.currentTimeMillis());
                lock.notify();
                System.out.println("结束notify time=" + System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
