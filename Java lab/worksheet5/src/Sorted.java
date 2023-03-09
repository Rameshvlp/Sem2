import javax.swing.*;
import java.util.*;
public class Sorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size:");
        size= sc.nextInt();
        int [] a=new int[size];
        System.out.println("Enter the Elements in an array:");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Target:");
        int target;
        target= sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                System.out.println("The position is:"+i);

            }
        }

    }
}
