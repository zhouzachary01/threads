package synchronize;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/18 16:12
 * @comment: 备注
 * @version: V1.0
 */
public class ThreadA extends Thread {

    private PublicVar publicVar;
    private String username;
    private String password;

    public ThreadA(PublicVar publicVar,String username,String password){
        super();
        this.publicVar = publicVar;
        this.username = username;
        this.password = password;
    }

    @Override
    public void run(){
        publicVar.setValue(username,password);
    }

}
