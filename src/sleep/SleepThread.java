package sleep;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/9/26 14:55
 * @comment: 备注
 * @version: V1.0
 */
public class SleepThread extends Thread{

    @Override
    public void run(){

        try {
            System.out.println("run threadName=" + this.currentThread().getName() + "begin");
            Thread.sleep(2000);
            System.out.println("run threadName=" + this.currentThread().getName() + "end");
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
