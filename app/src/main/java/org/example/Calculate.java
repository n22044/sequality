package org.example;

public class Calculate {
    public int sum(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    // ① 2つの整数の平均（doubleで返す）
    public double average(int x, int y) {
        return (x + y) / 2.0;
    }

    // ② 配列の平均（doubleで返す）
    public double average(int[] values) {
        int total = 0;
        for (int v : values) {
            total += v;
        }
        return (double) total / values.length;
    }
}
