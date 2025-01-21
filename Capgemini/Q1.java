// Problem Statement –

// You have write a function that accepts, a string which length is “len”, the string has some “#”, 
//in it you have to move all the hashes to the front of the string and return the whole string back and print it.

// example :-
// Sample Test Case
// Input:
// Move#Hash#to#Front
// Output:
// ###MoveHashtoFront

package Capgemini;
import java.util.*;
public class Q1 {
    
    public static void moveHash(String str ,int n)
    {
        String str1= new String("");
        String str2= new String("");
        int i=0;
        for(i=0;i<n;i++)
        {
            if(str.charAt(i)=='#')
                str1=str1 + str.charAt(i);
            else
                str2 = str2 + str.charAt(i);
        }
        String result = str1.concat(str2);
        System.out.println(result);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int len= a.length();
        moveHash(a, len);
    }

}
