public class Main {

    public static void main(String[] args) {
        //test1();
        //test2();
        Mthread myThread = new Mthread();
        Thread thread1 = new Thread(myThread,"a");
        System.out.println(thread1.isAlive());//isAlive()测试线程是否处于活动状态；
        thread1.start();//Mthread的构造方法由main调用；thread1的run方法由它自己调用；
        System.out.println(thread1.isAlive());
        //thread1.run();//Mthread的构造方法由main调用；thread1的run方法也由main自己调用；

    }

    public static void test2(){
        Mthread myThread = new Mthread();
        Thread thread1 = new Thread(myThread,"a");
        Thread thread2 = new Thread(myThread,"b");
        Thread thread3 = new Thread(myThread,"c");
        Thread thread4 = new Thread(myThread,"d");
        Thread thread5 = new Thread(myThread,"e");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        System.out.println("Hello World!");

    }

    public static void test1(){
        Mthread myThread1 = new Mthread();
        Mthread myThread2 = new Mthread();
        Mthread myThread3 = new Mthread();
        Mthread myThread4 = new Mthread();
        Mthread myThread5 = new Mthread();
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        System.out.println("Hello World!");
    }

}
