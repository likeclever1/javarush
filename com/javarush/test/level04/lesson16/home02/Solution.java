package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int max = 0;

        if( a > max ) {
            max = a;
        }

        if( b > max ) {
            max = b;
        }

        if( c > max ) {
            max = c;
        }

        int min = max;

        if( a < min ) {
            min = a;
        }

        if( b < min ) {
            min = b;
        }

        if( c < min ) {
            min = c;
        }

        int middle = 0;

        if(a < max && a > min ) {
            middle = a;
        }

        if(b < max && b > min ) {
            middle = b;
        }

        if(c < max && c > min ) {
            middle = c;
        }

        System.out.print(middle);
    }
}
