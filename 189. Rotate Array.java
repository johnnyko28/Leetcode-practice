/* We use an extra array in which we place every element of the array at its correct position 
i.e. the number at index ii in the original array is placed at the index (i+k)%(length of array)(i+k). 
*/

class Solution {
    //time : O(n)  space : O(n)
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
    
    //time : O(n)  space : O(1)
    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


