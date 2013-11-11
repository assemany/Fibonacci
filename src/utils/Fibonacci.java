/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Assemany
 * @param qtt identify the quantity of elements need to be generated
 */
public class Fibonacci {
    
    public static void fibonacciSequence(int qtt)
    {
        //It creates and instantiates an array with the quantity of elements passed in parameter
        int [] fib = new int [qtt];
        
        //starts the two values pre-defined of the Fibonacci sequence
        fib[0] = 0;
        fib[1] = 1;
        
        //Prints the two values pre-defined of the Fibonacci sequence
        System.out.println(fib[0]);
        System.out.println(fib[1]);
        
        //Calculate and print the eight others Fibonacci's sequence elements
        for (int index = 2; index <= fib.length - 1; index++)
        {
            fib[index] = fib[index - 1] + fib[index - 2];
            System.out.println(fib[index]);
        }
    }
}
//The advantage of using a non-recursive function is the facility to find errors.
