import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        int i,n,count;
        Scanner p=new Scanner(System.in);
        System.out.println("Enter The Number");
        n= p.nextInt();
        count=1;
        for(i=2;i<n;i++){
            if(n%i==0){
                count=0;
                break;
            }
        }
        if(count==1){
            System.out.println("It is a prime Number");
        }
        else{
            System.out.println("It is not a prime Number");


        }

    }
}
