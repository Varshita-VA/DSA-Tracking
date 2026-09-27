

public class max_subarray {
    public static int Subarray(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=start;j<arr.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum+=arr[k];
                }
                max=Math.max(sum,max);
                
            }
        }
        return max;
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        System.out.println(Subarray(arr));
    }
}
