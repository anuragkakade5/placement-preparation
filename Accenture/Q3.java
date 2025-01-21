/*
Coding Question 3
Implement the following Function

The function def ProductSmallestPair(sum, arr) accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair

NOTE

Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range
Example */

import java.util.*;
public class Q3 {

   
        public static int productSmallestPair (int arr[], int n, int sum) 
    {
        if (n <= 2)
            return -1;
        int ans, temp, check;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
    	    {
                if (arr[i] > arr[j])
    	        {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        check = arr[0] + arr[1];
        
        if (check <= sum)
            return arr[0] * arr[1];
        else
            return 0;
    }
    
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        int sum = sc.nextInt ();
        int n = sc.nextInt ();
        int arr[] = new int[n];
    
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();
        System.out.println (productSmallestPair (arr, n, sum));
    } 
}