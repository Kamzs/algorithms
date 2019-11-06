package com.ambro;

import java.net.http.HttpHeaders;

public class Main {

    public static void main(String[] args) {

/*        //VectorFix
        VectorFix vectorFix = new VectorFix();
        vectorFix.push(1);
        vectorFix.push(1);
        vectorFix.push(1);
        vectorFix.push(1);*/

        //     System.out.println(vectorFix.toString());

        //VectorFloat
        VectorFloat vectorFloat = new VectorFloat();
        vectorFloat.push(1);
        vectorFloat.push(1);
        vectorFloat.push(1);
        vectorFloat.push(1);
        vectorFloat.push(1);
        vectorFloat.push(1);

        //    System.out.println(vectorFloat.toString());

        //VectorObjectFloat
        SomeClass someClass1 = new SomeClass();
        SomeClass someClass2 = new SomeClass();
        SomeClass someClass3 = new SomeClass();

        VectorObjectFloat<SomeClass> vectorOfObjects = new VectorObjectFloat<>();
        vectorOfObjects.push(someClass1);
        vectorOfObjects.push(someClass2);
        vectorOfObjects.push(someClass3);

        // System.out.println(vectorOfObjects.toString());

        //graphAdjencyList
        GraphAdjencyList graphAdjencyList = new GraphAdjencyList(10);

        graphAdjencyList.addEdge(0, 1);
        graphAdjencyList.addEdge(1, 2);
        graphAdjencyList.addEdge(2, 3);
        graphAdjencyList.addEdge(3, 4);
        graphAdjencyList.addEdge(4, 5);
        graphAdjencyList.addEdge(5, 6);
        graphAdjencyList.addEdge(2, 6);

        Main main = new Main();
        System.out.println(main.BFSLowestDist(graphAdjencyList, 0, 6));

    }

    void BFS(GraphAdjencyList G, int start) {
        VectorFloat VectorZPOPLIFO = new VectorFloat();
        boolean[] visited = new boolean[G.N];

        visited[start] = true;
        VectorZPOPLIFO.push(start);
        while (VectorZPOPLIFO.count > 0) {
            int nodeToCheck = VectorZPOPLIFO.pop();
            for (int i = 0; i < G.nodes[nodeToCheck].count; i++) {
                int nodeConnected = G.nodes[nodeToCheck].get(i);
                if (visited[nodeConnected]) continue;
                //logic
                visited[nodeConnected] = true;
                VectorZPOPLIFO.push(nodeConnected);
            }
        }
    }

    int BFSLowestDist(GraphAdjencyList G, int start, int end) {
        VectorFloat VectorZPOPLIFO = new VectorFloat();
        int[] dist = new int[G.N];

        dist[start] = 1;
        VectorZPOPLIFO.push(start);
        while (VectorZPOPLIFO.count > 0) {
            int nodeToCheck = VectorZPOPLIFO.pop();
            for (int i = 0; i < G.nodes[nodeToCheck].count; i++) {
                int nodeConnected = G.nodes[nodeToCheck].get(i);
                if (dist[nodeConnected] > 0) continue;
                dist[nodeConnected] = dist[nodeToCheck] + 1;
                if (nodeConnected == end) {
                    return dist[nodeConnected] - 1;
                }
                VectorZPOPLIFO.push(nodeConnected);
            }
        }
        return -1;
    }
}
