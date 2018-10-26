package synchronize;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/19 9:25
 * @comment: 备注
 * @version: V1.0
 */
public class SubB extends Thread{

    private Sub sub;

    public SubB(Sub sub){
        super();
        this.sub = sub;
    }

    @Override
    public void run(){
        sub.serviceMethod();
    }

}
