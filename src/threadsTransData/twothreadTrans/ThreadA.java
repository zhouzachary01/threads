package threadsTransData.twothreadTrans;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/26 9:24
 * @comment: 备注
 * @version: V1.0
 */
public class ThreadA extends Thread {

    private MyList myList;
    public ThreadA (MyList myList){
        this.myList = myList;
    }

    @Override
    public void run(){
        try {
            for(int i = 0;i < 100;i ++){
                myList.add();
                System.out.println("添加了" + (i + 1) + "个元素；");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
