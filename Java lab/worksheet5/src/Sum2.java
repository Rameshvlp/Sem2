import java.util.*;
public class Sum2 {
    public static void main(String[] args) {
        int [] arr={1,5,33,44,77,56,76};
        int i,n,max=0;
        n=arr.length;
        for(i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
