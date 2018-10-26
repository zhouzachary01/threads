package synchronize;

/**
 * @description: 锁同步代码块测试;
 * @author: 周海涛
 * @date: 2018/10/19 10:33
 * @comment: 备注
 * @version: V1.0
 */
public class Task {

    public void doLongTimeTask(){
        for(int i = 0;i < 100;i ++){
            System.out.println("nosynchronized threadname=" + Thread.currentThread().getName() + "i=" + (i+1));
        }
        System.out.println("");
        synchronized (this){
            for(int i = 0;i < 100;i ++){
                System.out.println("synchronized threadname=" + Thread.currentThread().getName() + "i=" + (i+1));
            }
        }

    }

}
