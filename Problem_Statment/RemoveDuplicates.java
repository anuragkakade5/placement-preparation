class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case

        int i = 0; // Pointer for unique elements
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // Found a new unique element
                i++; // Move i to the next position
                nums[i] = nums[j]; // Store the new unique value
            }
        }
        
        return i + 1; // Number of unique elements
    }
}