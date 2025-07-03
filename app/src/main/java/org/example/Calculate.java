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
        if (y == 0) {
            throw new IllegalArgumentException("0 で割ることはできません");
        }
        return x / y;
    }

    // 課題2：2つの数値の平均を返す
    public double average(int x, int y) {
        return (x + y) / 2.0;
    }

    // 課題2：配列内の数値の平均を返す
    public double average(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("配列が null または空です");
        }
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return sum / (double) values.length;
    }
}
