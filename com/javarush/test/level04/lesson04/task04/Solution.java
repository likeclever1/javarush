package com.javarush.test.level04.lesson04.task04;

/* Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/

public class Solution
{

    public static String[] yearTime = {"зима", "весна", "лето", "осень"};

    public static void main(String[] args) {
//        for(int i = 1; i <= 12; i++) {
//            checkSeason(i);
//        }

        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mount){
        //::CODE:
        if(mount <= 2 || mount == 12) {
            System.out.println("зима");
        } else if(mount <= 5 ) {
            System.out.println("весна");
        } else if (mount <= 8) {
            System.out.println("лето");
        } else if (mount <= 11) {
            System.out.println("осень");
        } else {
            System.out.println("Некоректно введены данные!");
        }
    }
}