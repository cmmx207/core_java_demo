package v1ch03.PrintfDemo;

public class PrintfDemo {
    public static void main(String[] args) {
        double x = 10000.0/3.0;
        System.out.printf("%8.2f",x);
        System.out.println("");
        System.out.printf("%,.2f",x);
        //保留2位小数，8位数，但实际整数部分不够位数
    }
}
