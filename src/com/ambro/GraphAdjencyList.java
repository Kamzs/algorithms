package com.ambro;

public class GraphAdjencyList {
    int N;

    VectorFloat [] nodes;

    GraphAdjencyList (int n) {
        N =n;
        nodes = new VectorFloat[n];
        for (int i =0 ; i < n; i++){
            nodes[i] = new VectorFloat();
        }
    }

    void addEdge(int from, int to){
        nodes[from].push(to);

        //if undirected
        nodes[to].push(from);
    }
}
