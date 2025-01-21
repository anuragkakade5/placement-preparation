/*You are required to implement the following Function def LargeSmallSum(arr). 

The function accepts an integers arr of size ’length’ as its arguments you are required to return the 
sum of second largest largest element from the even positions and second 
smallest from the odd position of given ‘arr’.

Assumption:

All array elements are unique
Treat the 0th position a seven
NOTE

Return 0 if array is empty
Return 0, if array length is 3 or less than 3 */

import java.util.*;

public class Q2 {
    public static int LargeSmallSum(ArrayList<Integer> arr) {
        if (arr.size() <= 3) {
            return 0;
        }

        ArrayList<Integer> evenElements = new ArrayList<>();
        ArrayList<Integer> oddElements = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) {
                evenElements.add(arr.get(i));
            } else {
                oddElements.add(arr.get(i));
            }
        }

        Collections.sort(evenElements);
        Collections.sort(oddElements);

        int secondLargestEven = evenElements.get(evenElements.size() - 2);
        int secondSmallestOdd = oddElements.get(1);

        return secondLargestEven + secondSmallestOdd;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // 1 8 0 2 3 5 6
        arr.add(1);
        arr.add(8);
        arr.add(0);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(6);

        System.out.println("Output is: " + LargeSmallSum(arr));
    }
}

/*
 * It then retrieves the second largest element from the even
 *  positions by accessing the second last element of the 
 * sorted evenElements list (evenElements.get(evenElements.size() - 2)).
 
 second largest element <------ [Direction]
 Second smallest element ------> [Direction]
 */