import java.util.*;

public class ArraysQ2E {
    public static void print(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[]args){
        Integer arr[]={9,5,1,3,7,4,6,2,8};
        
        int n= arr.length;
        Arrays.sort(arr,Collections.reverseOrder());
        print(arr); // Output: [9 8 7 6 5 4 3 2 1 ]
    }
}
