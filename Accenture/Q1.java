package Accenture;

// The function def differenceofSum(n. m) accepts two integers n, m as arguments Find the sum of all 
//numbers in range from 1 to m(both inclusive) that are not divisible by n. Return difference between sum
//of integers not divisible by n with sum of numbers divisible by n.

//Assumption:

// 1. n>0 and m>0
// 2. Sum lies between integral range

import java.util.Scanner;

public class Q1{

    public static int Funx(int n, int m){

        int sumNotDivisible=0;
        int sumDivisible=0;

        for(int i=1;i<=m;i++){
            if(i%n!=0){
                sumNotDivisible+=i;
            }
            else if(i%n==0){
                sumDivisible+=i;
            }
            
        }
        return sumNotDivisible-sumDivisible;

    } 

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println(Funx(n, m));
    }
}