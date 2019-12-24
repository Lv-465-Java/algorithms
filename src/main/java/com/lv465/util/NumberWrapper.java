package com.lv465.util;

import java.util.Objects;

public class NumberWrapper {

    private int n;
    private int x;
    private int y;

    public NumberWrapper() {
    }

    public NumberWrapper(int n, int x, int y) {
        this.n = n;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberWrapper that = (NumberWrapper) o;
        return n == that.n &&
                x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n, x, y);
    }

    @Override
    public String toString() {
        return
                "n=" + n +
                        ", x=" + x +
                        ", y=" + y +
                        '}';
    }
}
