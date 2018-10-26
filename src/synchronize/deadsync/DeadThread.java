package synchronize.deadsync;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/24 9:53
 * @comment: 备注
 * @version: V1.0
 */
public class DeadThread extends Thread{

    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String username){
        this.username = username;
    }

    @Override
    public void run(){
        if(username.equals("a")){
            synchronized (lock1){
                try {
                    System.out.println("username=" + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("按lock1->lock2顺序执行");
                }
            }
        }
        if(username.equals("b")){
            synchronized (lock2){
                try {
                    System.out.println("username=" + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("按lock2->lock1顺序执行");
                }
            }
        }
    }



}
