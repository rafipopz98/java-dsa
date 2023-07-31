public class row {
public static void main(String[] args) {
    int n=5;
int ans=row(n);
System.out.println(ans);

}  
static int row(int n){
    int start=1;
    int end=n;
    int res=0;

    while(start<=end){
        int mid= start+(end-start)/2;
        double coins=(mid/2)*(mid+1);
        if(mid<n){
            end=mid-1;
        }else{
            res=Math.max( mid,res);
            start=mid+1;
        }
    }

    return res;
}  
}
