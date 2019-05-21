package v1ch06_Interface_Lambda_InnerClass.callback.Teacher_Student;

public class CallBackTest {
    public static void main(String[] args) {
        Student st = new Student();
        st.setCallBack(new Teacher());
        st.report();
    }
}
