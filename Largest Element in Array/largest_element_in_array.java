import java.util.*;

public class largest_element_in_array {
    public static int largest(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return large;
    }

    public static void main(String args[]){
        int arr[]={4,5,6,7,8,9};
        System.out.println(largest(arr));
    }
}
