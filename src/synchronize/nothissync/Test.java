package synchronize.nothissync;

/**
 * @description: synchronized锁非this对象，锁的不能是基本数据类型，需要是包装类的;
 * @author: 周海涛
 * @date: 2018/10/23 9:18
 * @comment: 备注
 * @version: V1.0
 */
public class Test {

    public static void main(String [] args){
        ObjectService objectService = new ObjectService();
        TaskA taskA = new TaskA(objectService);
        taskA.start();
        TaskB taskB = new TaskB(objectService);
        taskB.start();
    }


}
