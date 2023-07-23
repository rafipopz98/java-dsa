package com.company.binarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int [] arr={2,4,6,9,15,19};
        int target=-10;
    int ans=Ceil(arr,target);
        System.out.println(ans);
    }
    static int Ceil(int [] array,int target){
        if(target>array[array.length-1]){
            return -1;
        }
        int answer=0;
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(array[mid]==target){
                return array[mid];
//                return mid;
            }else if(array[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
//        answer=array[start];
return array[start];
    }
}
