package volatiles.atomicInt;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/25 9:19
 * @comment: 备注
 * @version: V1.0
 */
public class Test {

    //除了在i++中使用synchronized关键字实现同步外，还可以使用AtomicInteger原子类实现；
    //原子操作是不能分割的整体，没有其他线程能够中断或检查正在原子操作中的变量，一个原子类型就是一个原子操作可用类型，
    //它可以在没有锁的情况下做到线程安全；
    public static void main (String [] args){

        AddCountThread at = new AddCountThread();
        Thread t1 = new Thread(at);
        t1.start();
        Thread t2 = new Thread(at);
        t2.start();
        Thread t3 = new Thread(at);
        t3.start();
        Thread t4 = new Thread(at);
        t4.start();
        Thread t5 = new Thread(at);
        t5.start();
        Thread t6 = new Thread(at);
        t6.start();

    }


}
