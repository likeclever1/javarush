package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        int cell = 10;
        int row = 10;

        while(row > 0 && cell > 0) {

            if(row == 1) {
                System.out.println("S");

                cell--;
                row = 10;
            } else {
                System.out.print("S");
                row--;
            }
        }

    }
}
