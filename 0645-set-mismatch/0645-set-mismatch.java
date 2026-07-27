class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n+1];
        int[] arr = new int[2];

        for(int i =0;i<n;i++){
            count[nums[i]]++;
        }
        

        for(int i = 1;i<n+1;i++){
            if(count[i] == 0) {
                
                arr[1] = i;
            }

            if(count[i] == 2){
                arr[0] = i;
            }
            
        }
        return arr;
    }
}