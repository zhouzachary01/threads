package threadsTransData.waitnotify;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 不使用等待通知机制实现线程间的通信;
 * @author: 周海涛
 * @date: 2018/10/26 9:20
 * @comment: 备注
 * @version: V1.0
 */
public class MyList {

    private static List list=  new ArrayList();
    public static void add(){
        list.add("ceshi1");
    }

    public static int size(){
        return list.size();
    }

}
