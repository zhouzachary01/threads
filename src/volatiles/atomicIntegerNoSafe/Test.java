package volatiles.atomicIntegerNoSafe;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/25 10:11
 * @comment: 备注
 * @version: V1.0
 */
public class Test {

    //原子类也并不完全安全，在具有有逻辑性的情况下输出结果也具有随机性，这种情况还是需要同步
    //synchronized代码块有volatile同步的功能：关键字synchronized可以使多个线程访问同一个资源具有同步性，
    //而且它还具有将线程工作内存中的私有变量与公共内存中的变量同步的功能
    //synchronized可以保证在同一时刻，只有一个线程可以执行某一个方法或某一个代码块，包含两个特性：互斥性和可见性
    //同步synchronized不仅可以解决一个线程看到对象处于不一致的状态，还可以保证进入同步方法或者同步代码块的每个线程，都看到由一个锁保护之前所有
    public static void main(String [] args){
        try {
            MyService myService = new MyService();
            MyThread[] array = new MyThread[10];
            for(int i = 0;i < 10;i ++){
                array[i] = new MyThread(myService);
            }
            for(int i = 0;i < array.length;i ++){
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(myService.aiRef.get());
            //System.out.println(myService.lo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
