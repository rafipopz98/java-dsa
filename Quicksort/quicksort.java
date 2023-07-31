import java.util.*;
public class quicksort{
    public static void main(String args[]){
        int [] arr={2,4,61,15,1,34,68,5,6};
        int start=0;
        int end=arr.length-1;
        sort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
    static void sort (int[] arr,int start,int end){
        if(start<end){
            int pi=partition(arr,start,end);

            sort(arr,start,pi-1);
            sort(arr,pi+1,end);
        }
        }
        static int partition(int [] arr,int start,int end){
            int pivot=arr[end];
            int i=start-1;
            for(int j=start;j<end;j++){
                if(arr[j]<=pivot){
                    i++;
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            int temp=arr[i+1];
                    arr[i+1]=arr[end];
                    arr[end]=temp;
                    return(i+1);

                    Math.
    }
}