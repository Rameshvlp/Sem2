import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        int Weight,Height,BMI;
        String Gender;
        Scanner val=new Scanner(System.in);
        System.out.println("Enter The Weight  in Kgs:");
        Weight= val.nextInt();
        System.out.println("Enter The Height in Cms :");
        Height= val.nextInt();
        System.out.println("Enter your Gender:");
        Gender= val.nextLine();
        BMI=Weight/(Height*Height);
        System.out.println("Your BMI Value is:"+BMI);
        if(BMI>=27 && Gender="Male"){
            System.out.println("You Are Obese man");
        }
        else{
            if(BMI>=25 && Gender="Female"){
                System.out.println("You Are Obese Lady:");
            }
        }

    }
}
