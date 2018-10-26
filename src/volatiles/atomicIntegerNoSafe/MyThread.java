package volatiles.atomicIntegerNoSafe;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/25 10:09
 * @comment: 备注
 * @version: V1.0
 */
public class MyThread extends Thread {

    private MyService myService;
    public MyThread(MyService myService){
        super();
        this.myService = myService;
    }
    @Override
    public void run(){
        myService.addNum();
    }

}
