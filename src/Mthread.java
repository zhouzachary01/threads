/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/9/3 12:13
 * @comment: 备注
 * @version: V1.0
 */
public class Mthread extends Thread{

    private int i = 0;

    public Mthread(){
        System.out.println(Thread.currentThread().getName());
    }


    @Override
    public void run(){
        super.run();
        test(i);
        //System.out.print("myThread");
    }

    public void test(int i){
        while (i < 5){
            System.out.println("由" + this.currentThread().getName() + "创建"+"i:"+i);
            i++;
        }

    }

}
