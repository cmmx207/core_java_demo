package v1ch04.CalendarTest_4_1;

import java.time.*;

/**
 * @version 1.5 2015-05-08
 * @author Cay Horstmann
 */

public class CalendarTest
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        System.out.printf("当前是 " + month + " 月"+",日期是 " + today + " 日");
        System.out.println();
        date = date.minusDays(today - 1); // Set to start of month
        System.out.println("data to string = "+date.toString());
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
        System.out.println("value = "+value);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month)//*判断是否当前月份
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);//*累加天数
            if (date.getDayOfWeek().getValue() == 1) System.out.println();//当为新一周的第一天时换行
        }
//        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
