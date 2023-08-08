import java.util.Arrays;

public class duplicateNumber {
    public static void main(String[] args) {
         int arr[]={1,3,5,3,7,4,2};
        duplicatenumberinarray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int [] arr ,int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int duplicatenumberinarray(int[] arr) {
        int i=0;
        while(i<arr.length){


            if(arr[i]!=i+1){
                int correct_index=arr[i]-1;
                if(arr[i]!=arr[correct_index]){
                    swap(arr,i,correct_index);
                }else{
                    return arr[i];
                }

            }
            else{
                i++;
            }

        }
return -1;
    }
}
