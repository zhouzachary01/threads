package yield;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/18 8:57
 * @comment: 备注
 * @version: V1.0
 */
public class Mythread extends Thread {

    @Override
    public void run(){
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for(int i = 0;i < 50000000;i ++){
            //Thread.yield();//yield()方法作用是放弃当前的CPU资源，让其他任务去占用cpu执行时间，放弃时间不确定，有可能刚放弃，就会获得CPU时间；
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime));
    }

}
