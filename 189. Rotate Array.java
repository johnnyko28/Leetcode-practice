// We use an extra array in which we place every element of the array at its correct position i.e. the number at index ii in the original array is placed at the index (i+k)%(length of array)(i+k). 

class Solution {
    public void rotate(int[] nums, int k) {
        int [] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length ] = nums[i];
        }
//Then, we copy the new array to the original one.
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
