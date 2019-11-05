package com.ambro;

import java.net.http.HttpHeaders;

public class Main {

    public static void main(String[] args) {

        //VectorFix
        VectorFix vectorFix = new VectorFix();
        vectorFix.push(1);
        vectorFix.push(1);
        vectorFix.push(1);
        vectorFix.push(1);

        System.out.println(vectorFix.toString());

        //VectorFloat
        VectorFloat vectorFloat = new VectorFloat();
        vectorFloat.push(1);
        vectorFloat.push(1);
        vectorFloat.push(1);
        vectorFloat.push(1);
        vectorFloat.push(1);
        vectorFloat.push(1);

        System.out.println(vectorFloat.toString());

        //VectorObjectFloat

        SomeClass someClass1 = new SomeClass();
        SomeClass someClass2 = new SomeClass();
        SomeClass someClass3 = new SomeClass();

        VectorObjectFloat<SomeClass> vectorOfObjects = new VectorObjectFloat<>();
        vectorOfObjects.push(someClass1);
        vectorOfObjects.push(someClass2);
        vectorOfObjects.push(someClass3);

        System.out.println(vectorOfObjects.toString());

        //graphAdjencyList

        GraphAdjencyList graphAdjencyList = new GraphAdjencyList(4);

        graphAdjencyList.addEdge(0, 2);
        graphAdjencyList.addEdge(0, 3);
        graphAdjencyList.addEdge(2, 3);
        graphAdjencyList.addEdge(3, 2);
        graphAdjencyList.addEdge(3, 1);
        graphAdjencyList.addEdge(2, 1);


    }


    void BFS(GraphAdjencyList G, int start) {
        QueFIFOUsingVectorFloat Q = new QueFIFOUsingVectorFloat();
        boolean[] visited = new boolean[G.N];

        visited[start] = true;
        Q.push_back(start);
        while (Q.back > 0) { //back? count? wtf
            int u = Q.pop_front();
            for (int i = 0; i < G.nodes[u].count; i++) {
                int v = G.nodes[u].data[i];
                if (visited[v]) continue;
                //logic
                visited[v] = true;
                Q.push_back(v);
            }
        }
    }
}
