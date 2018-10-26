package volatiles.atomicInt;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/25 9:12
 * @comment: 备注
 * @version: V1.0
 */
public class AddCountThread extends Thread{

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run(){
        for(int i = 0;i < 10000;i ++){
            if(count.intValue() < 1000){
                System.out.println(count.incrementAndGet());
            }
        }
    }


}
