package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int first = a; //5
        int second = b; //4
        int third = c; //3

        if(first < second) { // 3 < 4
            int beforeFirst = first;
            int beforeSecond = second;

            first = beforeSecond; // 4
            second = beforeFirst; // 3
        }

        if(first < third) { // 4 < 5
            int beforeFirst = first;
            int beforeThird = third;

            third = beforeFirst; //4
            first = beforeThird; //5
        }

        if(second < third) { // 3 < 4
            int beforeSecond = second;
            int beforeThird = third;

            third = beforeSecond; // 3
            second = beforeThird; // 4
        }

        System.out.println(first); // 5
        System.out.println(second); // 4
        System.out.println(third); // 3
    }
}
