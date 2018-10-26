package synchronize.stringsync;

/**
 * @description: 数据类型String的常量池特性;
 * @author: 周海涛
 * @date: 2018/10/23 15:53
 * @comment: 备注
 * @version: V1.0
 */
public class Test {

    //String类型的字符串因为牵涉到String常量池的特性，大多数情况下，同步synchronized代码块都不使用String作为所对象，而改用其他，比如
    //new Object()实例化一个Object对象，但它并不放入缓存中。
    public static void main(String [] args){
        Service service = new Service();
        TaskA taskA = new TaskA(service);
        taskA.setName("aaa");
        taskA.start();
        TaskB taskB = new TaskB(service);
        taskB.setName("bbb");
        taskB.start();

    }

}
