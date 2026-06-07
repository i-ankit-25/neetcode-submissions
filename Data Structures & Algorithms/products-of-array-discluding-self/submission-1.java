class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i==0){
                prefixProduct[i] = 1;
            } else {
                prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
            }
        }
        for(int i=nums.length-1; i>=0; i--){
            if(i==nums.length - 1){
                suffixProduct[i] = 1;
            } else {
                suffixProduct[i] = suffixProduct[i+1] * nums[i+1];
            }
        }
        for(int i=0; i<nums.length; i++){
            result[i] = prefixProduct[i] * suffixProduct[i];
        }
        return result;
    }
}  
