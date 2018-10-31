package threadsTransData.twothreadTrans;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/26 9:30
 * @comment: 备注
 * @version: V1.0
 */
public class Test {

    public static void main(String [] args){

        String newString = new String ();

        MyList myList = new MyList();
        ThreadA a = new ThreadA(myList);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(myList);
        b.setName("B");
        b.start();
    }

}
