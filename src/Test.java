import org.junit.Assert;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/9/30 14:43
 * @comment: 备注
 * @version: V1.0
 */
public class Test {

    @org.junit.Test
    public void test11(){
        Assert.assertEquals("123","123");

    }




    public static void main(String [] arg){

        AtomicInteger count = new AtomicInteger(0);
        boolean bool = count.compareAndSet(0,5);
        System.out.println(bool);
        System.out.println(count);












       /* int i = 0;
        int flag = 1;
        while(i < 10000){
            System.out.println(System.currentTimeMillis()+"i="+i);
            i++;
            if(i == 1000){
                new Thread(){
                    public void run(){
                        int j = 0;

                        while(j < 10000){

                            System.out.println("j="+j+"flag="+flag);
                            j ++;
                        }
                    }
                }.start();
            }else{

            }
        }*/
    }


}
