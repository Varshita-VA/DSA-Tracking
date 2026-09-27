

public class pairs_in_array {
    public static void Pairs(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[]={4,5,6,7,8,9};
        Pairs(arr);
        //System.out.println();
    }
}
