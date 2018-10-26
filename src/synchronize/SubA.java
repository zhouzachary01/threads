package synchronize;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/19 9:18
 * @comment: 备注
 * @version: V1.0
 */
public class SubA extends Thread{

    private Sub sub;

    public SubA(Sub sub){
        super();
        this.sub = sub;
    }

    @Override
    public void run(){
        sub.serviceMethod();
    }


}
