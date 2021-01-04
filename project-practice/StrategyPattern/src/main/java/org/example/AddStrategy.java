package org.example;

/**
 * @title: AddStrategy
 * @Author yuke
 * @Date: 2021-01-04 14:20
 */
public class AddStrategy implements Strategy {

    @Override
    public int calculate(int a, int b) {

        return a + b;
    }
}
