package threadsTransData.twothreadTrans;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/26 9:29
 * @comment: 备注
 * @version: V1.0
 */
public class ThreadB extends Thread{

    private MyList myList;
    public ThreadB (MyList myList){
        this.myList = myList;
    }

    @Override
    public void run(){
        try {
            while (true){
               // System.out.println(myList.size());
                if(myList.size() == 5){
                    System.out.println("==5了，线程b要退出了；");
                    throw new InterruptedException();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
