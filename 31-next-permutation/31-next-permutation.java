class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==0||nums.length==1){
            return;
        }
        int breaks = -1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                 breaks = i;
                break;
            }
        }
        if(breaks!=-1){
            int swapindex = -1;
            for(int i = nums.length-1;i>=0;i--){
                if(nums[i]>nums[breaks]){
                    swapindex = i;
                    break;
                }
            }
            int temp = nums[breaks];
            nums[breaks]= nums[swapindex];
            nums[swapindex]= temp;
            
            reverse(nums,breaks+1,nums.length-1);
            
        }else{
            reverse(nums,0,nums.length-1);
        }
    }
    
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}