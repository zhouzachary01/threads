package synchronize;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/19 10:58
 * @comment: 备注
 * @version: V1.0
 */
public class TaskA extends Thread{

    private Task task;
    public TaskA(Task task){
        super();
        this.task = task;
    }


    @Override
    public void run(){
        task.doLongTimeTask();
    }

}
