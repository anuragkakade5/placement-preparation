package DSAsheet;


import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long temp = n;
        long sum = 0;
        while(n>0){
            long rem = n%10;
            //sum += Math.pow(rem, 4);
            sum += (rem*rem*rem);
            n = n/10;
        }
        if(sum == temp){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
        
        
    }
}
