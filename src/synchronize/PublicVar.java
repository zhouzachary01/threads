package synchronize;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/18 16:06
 * @comment: 备注
 * @version: V1.0
 */
public class PublicVar {

    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username,String password){
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue是" + "username=" + username + "  password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void getValue(){
        System.out.println("getValue是" + "username=" + username + "  password=" + password);
    }


}
