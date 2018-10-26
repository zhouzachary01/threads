package synchronize.tongbukuai;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/19 13:29
 * @comment: 备注
 * @version: V1.0
 */
public class TaskA extends Thread {

    private ObjectService objectService;

    public TaskA(ObjectService objectService){
        super();
        this.objectService = objectService;
    }

    @Override
    public void run(){
        super.run();
        objectService.serviceMethodA();
    }

}
