/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author KhoaPC
 */
public class GraphImpl {

    // Method 1
    // To make pair of nodes
    public void addEdge(DoubleLinkedListImpl<DoubleLinkedListImpl<Integer>> Adj, int u, int v) {
        // Creating bi-directional vertex
        Adj.get(u).addToTail(v);
        Adj.get(v).addToTail(u);
    }

    // Method 2
    // To print the adjacency list
    public void printAdjacencyList(DoubleLinkedListImpl<DoubleLinkedListImpl<Integer>> adj) {
        for (int i = 0; i < adj.size(); ++i) {
            // Printing the head
            System.out.print(i + "->");

            for (int v = 0; v < adj.get(i).size(); v++) {
                System.out.print(v + " ");
            }

            // Now a new line is needed
            System.out.println();
        }
    }
}
