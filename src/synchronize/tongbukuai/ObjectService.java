package synchronize.tongbukuai;

/**
 * @description: 代码块间的同步性;
 * @author: 周海涛
 * @date: 2018/10/19 13:18
 * @comment: 备注
 * @version: V1.0
 */
public class ObjectService {

    public void serviceMethodA(){
        try {
            synchronized (this){
                System.out.println("A begin  time=" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("A end  time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin  time=" + System.currentTimeMillis());
            System.out.println("B end  time=" + System.currentTimeMillis());
        }
    }

}
