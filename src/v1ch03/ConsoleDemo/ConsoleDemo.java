package v1ch03.ConsoleDemo;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        Console cs = System.console();
        if(null == cs){
            System.out.println("无法使用控制台");
        }
        while (true){
//        System.out.println("输入用户名");
        String name = cs.readLine("UserName:");
//        System.out.println("输入密码");
        char[] password = cs.readPassword("Password:");
//        System.out.println("名字："+name+",密码："+password.toString());
        }
    }
}
