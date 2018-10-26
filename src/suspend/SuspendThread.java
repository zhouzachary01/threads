package suspend;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/10 8:53
 * @comment: 备注
 * @version: V1.0
 */
public class SuspendThread{


   synchronized public void printObject(){

       System.out.println("begin");
       if(Thread.currentThread().getName().equals("a")){
           System.out.println("a线程被暂停了");
           Thread.currentThread().suspend();
       }
       System.out.println("end");

   }


}
