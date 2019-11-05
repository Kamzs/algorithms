package com.ambro;

import java.util.Arrays;

//vector z max wielkoscia - duzo pamieci zuzywa
public class VectorFix {

        final int MAX_SIZE = 3;
        int[] data = new int [MAX_SIZE];
        int count = 0;

        int get (int i){
            return data[i];
        }

        void push(int x){
            if(count < MAX_SIZE){
            data[count] = x;
            count++;}
            else System.out.println("full");
        }

    @Override
    public String toString() {
        return "VectorFix{" +
                "MAX_SIZE=" + MAX_SIZE +
                ", data=" + Arrays.toString(data) +
                ", count=" + count +
                '}';
    }
}
