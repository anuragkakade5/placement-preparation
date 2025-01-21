package DSAsheet;
import java.util.*;

// public // Given an integer choice denoting the choice of the user and a list containing the single value R or two values L and B depending on the choice.
// // If the user's choice is 1, calculate the area of the circle having the given radius(R).  
// // Else if the choice is 2, calculate the area of the rectangle with the given length(L) and breadth(B).

// // Note : A list arr[], containing the single value R or the two values L and B, as input parameters. Return the area of the desired geometrical figure. Use Math.PI for the value of pi.



class SwitchQ1{
    static double switchCase(int choice, List<Double> arr){
        // code here
        switch(choice){
            case 1:
                double r = Math.PI * arr.get(0) * arr.get(0);
                return r;
 
                
            case 2:
                double a = arr.get(0)*arr.get(1);
                return a;
        }
        return 0;
    }
} 
