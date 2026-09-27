
public class linear_search {
    public static int Linear_Search(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={3,5,7,9,11,15};
        System.out.print(Linear_Search(arr,11));
    }
}
