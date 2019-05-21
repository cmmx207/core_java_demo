package v1ch06_Interface_Lambda_InnerClass.callback.Teacher_Student;

public class Student {
    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    CallBack callBack;

    public void report() {
        if (callBack != null) {
            callBack.doTask("zhangsan");
        }
    }
}
