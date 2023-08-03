public class search2dmatrix {
    public static void main(String args[]){
        int [] []arr={{1,4},{2,5}};
        if(searchMatrix(arr,2)){
            System.out.println("sdfg");
        }else{
            System.out.println("noooooooooooooooooo");
        }
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        if(m==0)
        return false;
        int n=matrix[0].length;
        int start=0;
        int end=m*n-1;
        int linearMid,matrixMid;
        while(start<=end){
            linearMid=start+(end-start)/2;
            matrixMid=matrix[linearMid/n][linearMid%n];
            if(target==matrixMid){
                return true;
            }else if(target<matrixMid){
                end=linearMid-1;
            }
            else{
                start=linearMid+1;
            }
        }
        return false;
    }
}