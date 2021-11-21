package com.cherevataya;

/*
1) Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 */
public class Main {

    public static void main(String[] args) {
        final StringBuilder b = new StringBuilder(5);

        for (int i = 0; i < 24; i++) // hours 0-23
        {
            int x = i / 10;
            int y = i % 10;

            if (y > 5) {
                continue;
            }

            b.append(x).append(y).append(":").append(y).append(x);

            System.out.println(b);
            b.setLength(0);
        }
    }
}
