package synchronize;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/18 15:28
 * @comment: 备注
 * @version: V1.0
 */
public class Mythread2 extends Thread{

    private HasNum hasNum;

    public Mythread2(HasNum hasNum){
        this.hasNum = hasNum;
    }

    @Override
    public void run(){
        hasNum.addI("b");
    }
}
