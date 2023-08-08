public class rotatedSortedArray {
    
public static void main(String[] args) {
    int []arr={4,5,6,7,0,1,2};
    
    System.out.println(search(arr,0));
}
    public static int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else{
                if(nums[low]<=nums[mid]){
                    if(nums[low]<=target && target<=nums[mid]){
                        high=mid-1;
                    }else{
                        low=mid+1;
                    }
                }else{
                    if(nums[high]>=target && target >=nums[mid]){
                        low=mid+1;
                    }else{
                        high=mid-1;
                    }
                }
            }
        }
        return -1;
        
    }
}