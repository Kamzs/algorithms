package com.ambro;

import java.util.Arrays;

public class VectorFloat {

    int[] data = new int [1];
    int size = 1;
    int count = 0;

    int get (int i){
        return data[i];
    }

    void push (int x) {
        if (size == count)
            grow();

            data[count] = x;
            count++;
    }

    void grow (){
        size *= 2;
        int[] next = new int [size];
        for(int i = 0; i < count; i++)
        {
            next[i] = data [i];
        }
        data = next;
    }
    //STOS to kolejka LIFO
    //vector mozna rozszerzyc zeby dzialal jak stos - tj. zdejmowal najwiekszy element z vectora (ponizej metoda pop)
    //z tego co widzę to po prostu zwaraa ostatni element i count ustawia o 1 nizej niz bylo co w przypadku zapisu nowego elemntu zaowocuje nadpisaniem ostatniego
    int pop(){
        if (count ==0) return -1;
        return data [--count];
    }

    @Override
    public String toString() {
        return "VectorFloat{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", count=" + count +
                '}';
    }
}
