package synchronize.nothissync;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/23 9:22
 * @comment: 备注
 * @version: V1.0
 */
public class ObjectService {

    private Integer num = 10;

    public void addNum(){
        System.out.println("进入addNum方法，num = " + num);
        try {
            synchronized (num){//synchronized锁的不能是基本数据类型，需要是包装类的
                Thread.sleep(5000);
                num += 1;
            }
            System.out.println("退出addNum方法，num = " + num);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
