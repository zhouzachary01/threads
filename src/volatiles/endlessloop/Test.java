package volatiles.endlessloop;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/24 16:24
 * @comment: 备注
 * @version: V1.0
 */
public class Test {

    //volatile关键字，主要作用是当线程访问isRunning这个变量时，强制从公共堆栈中进行取值；
    //对于用volatile修饰的变量，JVM虚拟机只是保证从主内存加载到线程工作内存的值是最新的，
    //也就是说，volatile关键字解决的是变量读时的可见性问题，但无法保证原子性，对于多个线程访问同一个实例变量还是需要加锁同步


    public static void main(String [] args){


        try {
            RunThread runThread = new RunThread();
            runThread.start();
            Thread.sleep(1000);
            runThread.setRunning(false);
            System.out.println("已经赋值为false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        /*PrintString printString = new PrintString();
        new Thread(printString).start();
        System.out.println("停止stopThread=" + Thread.currentThread().getName());
        printString.setContinuePrint(false);*/
    }


}
