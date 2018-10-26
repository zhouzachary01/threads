package synchronize.staticsync;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/23 14:00
 * @comment: 备注
 * @version: V1.0
 */
public class TaskC extends Thread{

    ObjectService objectService;

    public TaskC(ObjectService objectService){
        this.objectService = objectService;
    }


    @Override
    public void run(){
        objectService.printC();
    }

}
