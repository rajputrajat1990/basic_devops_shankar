// Java Program to Swap Two values using third variable
// using temp variable 

// Importing generic libraries
import java.util.*;

public class swap {

    // Function to swap two numbers
    // Using temporary variable
    static void swap(int m, int n)
    {
        // Swapping the values
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m is " + m
                           + " and Value of n is " + n);
    }

    // Main driver code
    public static void main(String[] args)
    {
        // Random integer values
        int m = 9, n = 5;

        // Calling above function to
        // reverse the numbers
        swap(m, n);
    }
}

//8800229290









