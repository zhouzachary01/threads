package synchronize.staticsync;

/**
 * @description: synchronized加到static静态方法上;
 * @author: 周海涛
 * @date: 2018/10/23 11:33
 * @comment: 备注
 * @version: V1.0
 */
public class ObjectService {

    synchronized public static void printA(){
        try {
            System.out.println("线程名称：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB(){
        System.out.println("线程名称：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printB");
        System.out.println("线程名称：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printB");
    }

    synchronized public void printC(){
        System.out.println("线程名称：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printC");
        System.out.println("线程名称：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printC");
    }

}
