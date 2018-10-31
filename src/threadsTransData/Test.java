package threadsTransData;

/**
 * @description:线程间的通信;
 * @author: 周海涛
 * @date: 2018/10/29 16:46
 * @comment: 备注
 * @version: V1.0
 */
public class Test {
    /*
        wait()的作用是使当前执行代码的线程进行等待，wait()方法是Object类的方法，用来将当前线程置入"预执行队列"，
    并且在wait()所在的代码行处停止执行，知道接到通知或被中断为止；
        在wait()之前，线程必须获得该对象的对象级别锁，即只能在同步方法或同步块中调用wait()方法；在执行wait()方法后，当前线程释放锁
    在从wait()返回前，线程与其他线程竞争重新获得锁，如果调用wait()方法时，没有持有适当的锁，则抛出IllegalMonitorStateException,它是RunntimeException
    的一个子类，不需要捕获异常。

        notify()也是在同步方法或同步块中调用，该方法用来通知那些可能等待该对象的对象锁的其他线程，如果多个线程等待，则由线程规划器随机挑选一个
    呈wait状态的线程，对其发出通知notify,并使它等待获取该对象的对象锁。
        在执行notify()方法后，当前线程不会马上释放该对象锁，呈wait()状态的线程也并不能马上获取该对象锁，要等到notify()方法的线程程序执行完，也就是退出
    synchronized代码块后，当前线程才会释放锁，而呈wait状态所在的线程才可以获取该对象锁；
    当第一个获得该对象锁的wait线程运行完毕后，它会释放该对象锁，此时如果该对象锁没有再次使用notify语句，则即便该对象已经空闲，其他wait()状态等待的线程由于
    没有得到giant对象的通知，还会据需阻塞在wait状态，知道这个对象发出notify或notifyAll；
    wait使线程停止运行，notify使停止的线程继续运行；


    当线程呈wait()状态时，调用线程对象的interrupt()方法会出现InterruptedException异常；

    总结：1、执行完同步代码块就会释放对象的锁；
    2、在执行同步代码块的过程中，遇到异常而导致线程终止，锁也会被释放；
    3、在执行同步代码块过程中，执行了锁所属的对象的wait()方法，这个线程会释放对象锁，而此线程对象会进入线程等待池中，等待被唤醒

    notify()一次只随机通知一个线程进行唤醒，多次调用notify()并且调用次数大于线程对象的数量，为了唤醒全部线程，可以使用notifyAll()方法



    */


    public static void main(String[] args) {
        Object lock = new Object();
        Service s1 = new Service();
        Service s2 = new Service();
        Thread1 t1 = new Thread1(lock,s1);
        t1.setName("t1");
        t1.start();
        Thread2 t2 = new Thread2(lock,s2);
        t1.setName("t2");
        t2.start();
    }
}
