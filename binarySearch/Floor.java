package com.company.binarySearch;

public class Floor {
    public static void main(String[] args) {
        int [] array={2,3,6,8,9,13,16,19};
        int target=1;
        int ans=Floor(array,target);
        System.out.println(ans);
    }
    static int Floor(int [] array,int target){
        if(target<array[0]){
            return -1;
        }
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]==target){
                return array[mid];
            }
            else if(array[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return array[end];
    }
}
