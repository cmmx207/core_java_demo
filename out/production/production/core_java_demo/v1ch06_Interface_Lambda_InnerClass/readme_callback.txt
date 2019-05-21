1：同步调用：一种阻塞式调用，调用方要等待对方执行完毕才返回，它是一种单向调用
2：回调：一种双向调用模式，也就是说，被调用方在接口被调用时也会调用对方的接口；
3：异步调用：一种类似消息或事件的机制，不过它的调用方向刚好相反，接口的服务在收到某种讯息或发生某种事件时，会主动通知客户方（即调用客户方的接口
具体说来：就是A类中调用B类中的某个方法C，然后B类中反过来调用A类中的方法D，D这个方法就叫回调方法，

实例1：使用java中Timer来在给定时间间隔发送通知，每隔十秒打印一次数据
TimePrinter 实现ActionListener接口，该接口中的actionPerformed方法就是回调函数

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
/**
*TimePrinter实现回调函数接口
*/
public class TimePrinter implements ActionListener {

@Override
public void actionPerformed(ActionEvent event) {
// TODO Auto-generated method stub
Date now=new Date();
System.out.println("Now time is "+now);
Toolkit.getDefaultToolkit().beep();
}

}

测试端

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

public static void main(String[] args) {
// TODO Auto-generated method stub
ActionListener listener=new TimePrinter();
Timer timer=new Timer(10000, listener);
timer.start();
JOptionPane.showMessageDialog(null, "quit");
System.exit(0);
}

}

运行结果：每隔10s打印，运行程序后需要耐心等待。

Now time is Fri Apr 15 22:31:53 CST 2016
Now time is Fri Apr 15 22:32:03 CST 2016
Now time is Fri Apr 15 22:32:13 CST 2016

从结果发现Timer每隔10s中回调listener中的方法。

实例2：老师平时学生布置任务后不可能一直等待和监督学生完成，老师通常会告诉学生，任务完成后给他打个电话或者发个信息，那么学生给老师返回结果的过程需要老师信息，这就是一个回调的过程。
public interface Callback {

public void taskResult(String name);

/**
* 学生必须指导老师的信息，才能回报任务情况，因此它必须实现回调接口
*
*/
public class Teacher implements Callback{

@Override
public void taskResult(String name) {
// TODO Auto-generated method stub
System.out.println("任务:"+name+"完成");
}

}

public class Student {
Callback callback=null;
//将老师的联系信息给学生
public void setCallback(Callback callback)
{
this.callback=callback;
}
public void doTask()
{
for(int m=1;m<6;m++)
{
callback.taskResult(m+"是张三");
}
}
}

测试端：

public class CallbackTest {

public static void main(String[] args) {
// TODO Auto-generated method stub
Student student=new Student();
student.setCallback(new Teacher());
student.doTask();
}

}

运行结果：

任务:1是张三完成
任务:2是张三完成
任务:3是张三完成
任务:4是张三完成