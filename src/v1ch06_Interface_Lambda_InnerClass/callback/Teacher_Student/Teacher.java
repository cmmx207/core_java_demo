package v1ch06_Interface_Lambda_InnerClass.callback.Teacher_Student;

public class Teacher implements CallBack {
    @Override
    public void doTask(String name) {
        System.out.println(name + " work over");
    }
}
