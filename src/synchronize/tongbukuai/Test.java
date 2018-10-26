package synchronize.tongbukuai;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/19 13:46
 * @comment: 备注
 * @version: V1.0
 */
public class Test {

    public static void main (String [] args) {
        ObjectService objectService = new ObjectService();
        TaskA taskA = new TaskA(objectService);
        taskA.setName("aaa");
        taskA.start();
        TaskB taskB = new TaskB(objectService);
        taskB.setName("bbb");
        taskB.start();
    }

}
