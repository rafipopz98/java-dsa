import java.util.ArrayList;
import java.util.Arrays;

public class missingListOfNumbers {
    public static void main(String[] args) {
        int arr[]={1,3,5,3,7,4,2};
        cyclics(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static ArrayList<Integer> cyclics(int [] arr){
        int i=0;
        while(i<arr.length){
            int corrct_index=arr[i]-1;
            if(arr[i]!=arr[corrct_index]){
                swap(arr,i,corrct_index);
            }else{
                i++;
            }
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}
