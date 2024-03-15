/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.LinkedList;

/**
 *
 * @author KhoaPC
 */
public class Graph {


    // Method 3
    // Main driver method
    public static void main(String[] args) {

        // Creating vertex
        int V = 5;
        
        DoubleLinkedListImpl<DoubleLinkedListImpl<Integer>> adj = new DoubleLinkedListImpl<>();
        for (int i = 0; i < V; ++i) {
            adj.addToTail(new DoubleLinkedListImpl<>());
        }
        GraphImpl graph = new GraphImpl();
        // Inserting nodes
        // Custom input node elements
        graph.addEdge(adj, 0, 1);
        graph.addEdge(adj, 0, 4);
        graph.addEdge(adj, 1, 2);
        graph.addEdge(adj, 1, 3);
        graph.addEdge(adj, 1, 4);
        graph.addEdge(adj, 2, 3);
        graph.addEdge(adj, 3, 4);

        // Printing adjacency list
        graph.printAdjacencyList(adj);
    }

}
