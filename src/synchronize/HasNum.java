package synchronize;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/18 15:10
 * @comment: 备注
 * @version: V1.0
 */
public class HasNum {

    private int num = 0;

    synchronized public void addI (String username){
        try {
            if(username.equals("a")){
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else{
                num = 200;
                System.out.println("b set over");
            }
            System.out.println("username=" + username + "num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
