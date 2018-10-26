package priority;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/17 15:58
 * @comment: 备注
 * @version: V1.0
 */
public class Test {

    //线程的优先级具有继承性，比如A线程启动B线程，B线程的优先级和A的优先级一样
    //高优先级的线程总是大部分先执行完，但不代表高优先级的线程全部执行完，线程的优先级具有一定的规则性，就是CPU尽量将执行资源让给优先级高的线程
    //线程还具有随机性，就是优先级较高的线程不一定每次都先执行完；
    public static void main(String [] args){



        for(int i = 0;i < 50;i ++){
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(1);
            thread1.start();
            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(10);
            thread2.start();
        }
    }

}
