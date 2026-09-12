
public class max_subarray {
    public static int Subarray(int arr[]){
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }

        int max=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=start;j<arr.length;j++){
                int sum=0;
                int end=j;
                sum= start==0?prefix[end]: prefix[end]-prefix[start-1];
                max=Math.max(max,sum);
            }
        }
        return max;
    }

    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        System.out.println(Subarray(arr));
    }
}
