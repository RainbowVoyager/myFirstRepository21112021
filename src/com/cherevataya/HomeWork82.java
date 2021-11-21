package com.cherevataya;

public class HomeWork82 {
    /*  Найти количество счастливых билетиков на трамвай от 000001 до 999999
        (те у которых сумма первых 3 цифр равна сумме последних 3)
        (answer - 55251)
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int k = 000001; k <= 999999; k++) {
            int number1 = k / 100000;
            int number2 = (k % 100000) / 10000;
            int number3 = (k % 10000) / 1000;
            int number4 = (k % 1000) / 100;
            int number5 = (k % 100) / 10;
            int number6 = k % 10;

            if (number1 + number2 + number3 == number4 + number5 + number6) {
                sum++;
            }
        }
        System.out.println(sum + " lucky tickets");
    }
}
