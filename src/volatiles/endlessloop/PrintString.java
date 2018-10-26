package volatiles.endlessloop;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/24 16:26
 * @comment: 备注
 * @version: V1.0
 */
public class PrintString implements Runnable {

    private boolean isContinuePrint = true;


    public void printstringMethod(){
        while (isContinuePrint == true){
            try {
                System.out.println("run threadName=" + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run(){
        printstringMethod();
    }




    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }


}
