package synchronize.nothissync;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/23 9:42
 * @comment: 备注
 * @version: V1.0
 */
public class TaskB extends Thread{

    private ObjectService objectService;

    public TaskB(ObjectService objectService){
        this.objectService = objectService;
    }

    @Override
    public void run(){
        objectService.addNum();
    }

}
