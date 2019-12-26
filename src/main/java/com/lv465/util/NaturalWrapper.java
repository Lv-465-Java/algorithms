package com.lv465.util;

import java.util.Objects;

public class NaturalWrapper {
    private int n;
    private int i;
    private int j;
    private int k;

    public NaturalWrapper(int n, int i, int j, int k) {
        this.n = n;
        this.i = i;
        this.j = j;
        this.k = k;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NaturalWrapper that = (NaturalWrapper) o;
        return n == that.n &&
                i == that.i &&
                j == that.j &&
                k == that.k;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n, i, j, k);
    }

    @Override
    public String toString() {
        return "{" +
                "n=" + n +
                ", i=" + i +
                ", j=" + j +
                ", k=" + k +
                '}';
    }
}
