package org.example.sandbox.algo;

public class NACnumber {
    public static void main(String[] args) {
        NACnumber nac = new NACnumber();
        for (int x = 0; x <= 55; x++) {
            System.out.println("fib(" + x + ") = " + nac.fib(x));
        }
    }
     private long fib(int n) {
         if (n == 0) {
             return 0;
         }
         if (n == 1) {
             return 1;
         }
         return fib(n - 1) + fib(n - 2);
     }
}
