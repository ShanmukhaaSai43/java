package com.wipro.java.treemap.fibonacci;

import java.util.Map;
import java.util.TreeMap;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        int n = 10; // Change this value for more terms
        TreeMap<Integer, Integer> fibonacciMap = new TreeMap<>();
        
        generateFibonacci(n, fibonacciMap);
        
        // Print the Fibonacci series
        for (Map.Entry<Integer, Integer> entry : fibonacciMap.entrySet()) {
            System.out.println("Position " + entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static void generateFibonacci(int n, TreeMap<Integer, Integer> map) {
        int a = 0, b = 1;
        
        for (int i = 1; i <= n; i++) {
            map.put(i, a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
