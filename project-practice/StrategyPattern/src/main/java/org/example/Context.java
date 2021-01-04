package org.example;

/**
 * @title: Context
 * @Author yuke
 * @Date: 2021-01-04 14:22
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 动态替换算法(策略)
    public void replaceStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        return strategy.calculate(a, b);
    }


    public static void main(String[] args) {
        Strategy addStrategy = new AddStrategy();
        Context context = new Context(addStrategy);
        // 输出3
        System.out.println(context.calculate(1, 2));

        Strategy subStrategy = new SubtractStrategy();
        // 动态替换算法(策略)
        context.replaceStrategy(subStrategy);
        // 输出-1
        System.out.println(context.calculate(1, 2));
    }
}
