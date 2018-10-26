package synchronize;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/18 15:28
 * @comment: 备注
 * @version: V1.0
 */
public class Test {
    //synchronized取得的锁都是对象锁，而不是把一段代码或方法当作锁，哪个线程先执行带synchronized关键字的方法，哪个线程就持有该方法
    //所属对象的锁lock，那么其他线程只能呈等待状态，前提是多个线程访问的是同一个对象；
    //一个线程先持有Lock锁，另外一个线程可以调用非synchronized类型打方法，但是调用synchronized类型的方法则需等待，也就是同步
    //当一个线程执行的代码出现异常时，其所持有的锁会自动释放，出现异常的锁被自动释放
    //但是synchronized声明方法在某些情况下是有弊端的，一个线程在调用同步方法执行一个长时间的任务，另外一个线程必须等待比较长的时间
    //synchronized同步代码块，当两个线程访问同一个对象中的synchronized(this)同步代码块时，一段时间内只能有一个线程被执行，另一个线程必须等待当前线程执行完成才能执行该代码块
    //在使用同步synchronized(this)代码块时，当一个线程访问一个同步代码块时，其他线程对同一个对象中所有其他同步代码块的访问也将被阻塞，说明synchronized是个对象监视器
    //synchronized(非this对象x)同步代码块，即在同一个对象的前提下，同一时间只有一个线程可以执行synchronized(非this对象x)同步代码块中代码；
    //String类型的字符串因为牵涉到String常量池的特性，大多数情况下，同步synchronized代码块都不使用String作为所对象，而改用其他，比如
    //new Object()实例化一个Object对象，但它并不放入缓存中。
    //synchronized关键自驾到static静态方法上，是给Class类上锁，而synchronized关键字加到非static静态方法上是给对象上锁
    //在将任何数据类型作为同步锁时，需要注意的是，是否有多个线程同时持有锁对象，如果同时持有相同的锁对象，则这些线程就是同步的；如果分别获得锁对象，这些线程之间就是异步的；

    //对象锁和类锁是不同的锁，所以多个线程同时执行这2个不同锁的方法时，是异步的
    //taskA和taskB是类锁，即同一个锁，A和B按顺序执行，即同步的，而C是对象锁，和A/B不是同一个锁，所以C和A、B是异步执行的
    //类锁可以对所有的对象实例起作用，而对象锁不行


    //线程的死锁是程序设计的bug，在设计程序时，要避免双方互相持有对方的锁的情况；
    //只要互相等待对方释放锁，就有尽可能出现死锁；

    //只要对象不变，即使对象的属性被改变，运行的结果还是同步的。


    public static void main(String [] args){
        /*HasNum hasNum = new HasNum();
        Mythread1 mythread1 = new Mythread1(hasNum);
        mythread1.start();
        Mythread2 mythread2 = new Mythread2(hasNum);
        mythread2.start();*/
        //test1();
        test3();
    }


    public static void test3(){
        Task task = new Task();
        TaskA taskA = new TaskA(task);
        Thread t1 = new Thread(taskA,"aaa");
        Thread t2 = new Thread(taskA,"bbb");
        t1.start();
        t2.start();

    }

    public static void test2(){
        Sub sub = new Sub();
        SubA subA = new SubA(sub);
        subA.setName("aa");
        subA.start();
        SubB subB = new SubB(sub);
        subB.setName("bb");
        subB.start();

    }


    public static void test1(){
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA1 = new ThreadA(publicVar,"A11","A22");
            threadA1.start();
            Thread.sleep(2000);
            publicVar.getValue();
            ThreadA threadA2 = new ThreadA(publicVar,"B11","B22");
            threadA2.start();
            Thread.sleep(2000);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }















}
