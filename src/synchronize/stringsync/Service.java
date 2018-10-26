package synchronize.stringsync;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/23 15:55
 * @comment: 备注
 * @version: V1.0
 */
public class Service {

    public static void print(String stringParam){
        try {
            synchronized (stringParam){
                while(true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
