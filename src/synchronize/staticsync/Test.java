package synchronize.staticsync;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/23 13:59
 * @comment: 备注
 * @version: V1.0
 */
public class Test {
    //对象锁和类锁是不同的锁，所以多个线程同时执行这2个不同锁的方法时，是异步的
    //taskA和taskB是类锁，即同一个锁，A和B按顺序执行，即同步的，而C是对象锁，和A/B不是同一个锁，所以C和A、B是异步执行的
    //类锁可以对所有的对象实例起作用，而对象锁不行
    public static void main(String [] args){
        ObjectService objectService = new ObjectService();
        TaskA taskA = new TaskA(objectService);
        taskA.setName("aaa");
        taskA.start();
        TaskB taskB = new TaskB(objectService);
        taskB.setName("bbb");
        taskB.start();
        TaskC taskC = new TaskC(objectService);
        taskC.setName("ccc");
        taskC.start();

    }


}
