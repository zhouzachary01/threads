package priority;

import java.util.Random;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/17 15:57
 * @comment: 备注
 * @version: V1.0
 */
public class MyThread2 extends Thread{

    @Override
    public void run(){
        System.out.println("MyThread2 run priority=" + this.getPriority());
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for(int j = 0;j < 10;j ++){
            for(int i = 0;i < 50000;i ++){
                Random random = new Random();
                random.nextInt();
                addResult += i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("thread2 time=" + (endTime - beginTime));
    }

}
