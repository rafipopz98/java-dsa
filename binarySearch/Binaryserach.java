public class Binarysearch {
    public static void main(String args[]){
        int arr={1,8,45,56,87};
        int target=2;
        search(arr,target);
    }
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}