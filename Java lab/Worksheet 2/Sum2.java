import java.util.Arrays;

public class Sum2 {
    public static void main(String[] args) {
        int size=6;
        int [] a=new int[size];
        float average;

        for(int i=0;i<size;i++){
            a[i]= Integer.parseInt(args[i]);
        }
        Arrays.sort(a);
        float sum=0;
        for(int i=1;i<size-1;i++){
            sum=sum+a[i];
        }
        average=sum/4;
        System.out.println("Average="+average);
        System.out.println("low score="+a[0]);
        System.out.println("High score="+a[5]);
    }
}
