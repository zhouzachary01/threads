package threadsTransData.waitInterruptException;

import threadsTransData.Service;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/30 11:04
 * @comment: 备注
 * @version: V1.0
 */
public class Thread1 extends Thread{

    private Object lock;
    private threadsTransData.Service service;
    public Thread1(Object lock, Service service){
        this.lock = lock;
        this.service = service;
    }

    @Override
    public void run(){
       // Service service = new Service();
        service.testMethod(lock);
    }

}
