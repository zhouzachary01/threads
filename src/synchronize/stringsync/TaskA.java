package synchronize.stringsync;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/23 15:58
 * @comment: 备注
 * @version: V1.0
 */
public class TaskA extends Thread{

    Service service;

    public TaskA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.print("AA");
    }


}
