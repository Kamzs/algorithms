package com.ambro;

import java.util.Arrays;

public class VectorObjectFloat<T> {

    Object[] data = new Object[1];
    int size = 1;
    int count = 0;

    T get(int i) {
        return (T) data[i];
    }

    void push(T x) {
        if (size == count)
            grow();

        data[count] = x;
        count++;
    }

    void grow() {
        size *= 2;
        Object[] next = new Object[size];
        for (int i = 0; i < count; i++) {
            next[i] = data[i];
        }
        data = next;
    }

    void clear() {
        count = 0;
    }

    @Override
    public String toString() {
        return "VectorObjectFloat{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", count=" + count +
                '}';
    }
}
