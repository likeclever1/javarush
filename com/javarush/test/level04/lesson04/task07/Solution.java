package com.javarush.test.level04.lesson04.task07;

/* Количество дней в году
Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
"количество дней в году: x", где х - 366 для високосными года, х - 365 для обычного года.
Подсказка: В високосном году - 366 дней, тогда как в обычном  - 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 — невисокосные.
*/

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNumber = reader.readLine();
        int year = Integer.parseInt(sNumber);
        int days = 0;
        Boolean leapYear = false;

        if(year % 4 == 0 ) {
            if(year % 100 == 0 && year % 400 != 0) {
                leapYear = false;
            } else {
                leapYear = true;
            }
        }

        if(leapYear) {
            days = 366;
        } else {
            days = 365;
        }

        System.out.print("количество дней в году: " + days);

    }
}