package Problem_Statment;

//https://chatgpt.com/share/67a44cc3-6f80-8013-9790-7b8e602f037e

import java.util.ArrayList;

public class TortoiseHare {
    public static int findDuplicate(ArrayList<Integer> arr) {
        // Step 1: Initialize slow and fast pointers
        int slow = arr.get(0);
        int fast = arr.get(0);

        // Step 2: Detect cycle using Floyd’s Algorithm
        do {
            slow = arr.get(slow);        // Move slow by 1 step
            fast = arr.get(arr.get(fast)); // Move fast by 2 steps
        } while (slow != fast);

        // Step 3: Find the duplicate number
        slow = arr.get(0);
        while (slow != fast) {
            slow = arr.get(slow);
            fast = arr.get(fast);
        }

        return slow; // The duplicate number
    }
}