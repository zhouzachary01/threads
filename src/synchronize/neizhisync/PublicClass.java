package synchronize.neizhisync;

/**
 * @description: 一句话描述功能;
 * @author: 周海涛
 * @date: 2018/10/24 15:06
 * @comment: 备注
 * @version: V1.0
 */
public class PublicClass {

    static private String username;
    static private String password;

    static public class PrivateClass{
        private String age;
        private String address;
        public String getAge() {return age;}
        public void setAge(String age) {this.age = age;}
        public String getAddress() {return address;}
        public void setAddress(String address) {this.address = address;}
        public void printPrivateClass(){System.out.println(username + " " + password);}
    }

    public static String getUsername() {return username;}
    public static void setUsername(String username) {PublicClass.username = username;}
    public static String getPassword() {return password;}
    public static void setPassword(String password) {PublicClass.password = password;}

}
