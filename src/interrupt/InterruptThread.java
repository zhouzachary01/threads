package interrupt;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/9/26 16:38
 * @comment: 备注
 * @version: V1.0
 */
public class InterruptThread extends Thread{

    @Override
    public void run(){
        test4();
    }

    //用interrupt()和return结束线程；
    public void test4(){
        while(true){
            if(this.isInterrupted()){
                System.out.println("线程停止了；");
                return ;
            }
            System.out.println("time="+System.currentTimeMillis());
        }
    }


    //在线程休眠中，中断线程，会报异常，java.lang.InterruptedException: sleep interrupted
    public void test3(){
        try {
            System.out.println("begin");
            Thread.sleep(200000);
            System.out.println("end");
        } catch (InterruptedException e) {
            System.out.println("沉睡中停止");
            e.printStackTrace();
        }
    }

    public void test2(){
        System.out.println("begin");
        for(int i = 0;i < 1000000;i ++){
            if(Thread.interrupted()){//线程停止true,然后结束循环；
               System.out.println("线程已经停止，");
                break;
            }
            System.out.println("i="+(i+1));
        }
        System.out.println("end");
    }

    public void test1(){
        System.out.println("begin");
        for(int i = 0;i < 100;i ++){
            System.out.println("i="+(i+1));
        }
        System.out.println("end");
    }
}
