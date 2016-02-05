package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String aStr = br.readLine();
        String bStr = br.readLine();
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);

        if(a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}