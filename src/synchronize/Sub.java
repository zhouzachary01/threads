package synchronize;

/**
 * @description: 检验同步锁的不继承性（子类）;
 * @author: 周海涛
 * @date: 2018/10/19 9:14
 * @comment: 备注
 * @version: V1.0
 */
public class Sub extends Main{

    @Override
    synchronized public void serviceMethod(){
        try {
            System.out.println("sub begin threadmethodName=" + Thread.currentThread().getName() + "  time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("sub end threadmethodName=" + Thread.currentThread().getName() + "  time=" + System.currentTimeMillis());
            super.serviceMethod();//调用父类的方法；
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
