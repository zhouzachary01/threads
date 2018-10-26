package synchronize.neizhisync;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/24 15:19
 * @comment: 备注
 * @version: V1.0
 */
public class Test {

    public static void main(String [] args){
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("aaaaaaaaa");
        publicClass.setPassword("123456789");
        System.out.println(PublicClass.getUsername() + " " + PublicClass.getPassword());
        PublicClass.PrivateClass privateClass = new PublicClass.PrivateClass();
        privateClass.setAddress("34242");
        privateClass.setAge("33");
        privateClass.printPrivateClass();
        System.out.println(privateClass.getAddress() + " " + privateClass.getAge());
    }

}
