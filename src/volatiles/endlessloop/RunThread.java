package volatiles.endlessloop;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/24 17:04
 * @comment: 备注
 * @version: V1.0
 */
public class RunThread extends Thread {

    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run(){
        System.out.println("进入run方法");
        while (isRunning == true){

        }
        System.out.println("退出run方法");
    }
}
