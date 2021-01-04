package org.example;

/**
 * @title: SubtractStrategy
 * @Author yuke
 * @Date: 2021-01-04 14:21
 */
public class SubtractStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
