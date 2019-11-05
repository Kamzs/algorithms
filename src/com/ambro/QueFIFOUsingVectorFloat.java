package com.ambro;

public class QueFIFOUsingVectorFloat {

    VectorFloat vectorFloat = new VectorFloat();
    int front = 0;
    int back =0;

    void push_back (int x){
        vectorFloat.push(x);
        back++;
    }

    int pop_front ()
    {
        if (front < back){
            System.out.println("no elements queed");
            return 0;
        }
            else {
            front++;
            return vectorFloat.get(front - 1);
        }
    }

}
