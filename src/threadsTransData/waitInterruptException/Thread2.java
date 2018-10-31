package threadsTransData.waitInterruptException;

import threadsTransData.Service;

/**
 * @description: 一句话描述功能;
 * @author: zxb
 * @date: 2018/10/30 11:12
 * @comment: 备注
 * @version: V1.0
 */
public class Thread2 extends Thread{

    private Object lock;
    private threadsTransData.Service service;
    public Thread2(Object lock, Service service){
        this.lock = lock;
        this.service = service;
    }

    @Override
    public void run(){
        //Service service = new Service();
        service.testMethod(lock);
    }

}
