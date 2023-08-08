public class missingNumber {
    public static void main(String[] args) {
        
    }
    public static void swap(int[] nums,int first,int second) {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int corrct_index=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[corrct_index]){
                swap(nums,i,corrct_index);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length; 
    }
}
