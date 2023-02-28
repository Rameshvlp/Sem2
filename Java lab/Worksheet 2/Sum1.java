public class Sum1 {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        if(a>155){
            System.out.println("Hurricane category 5:");
        if(a>75&&a<=95)
            System.out.println("Hurricane category 1:");

        if(a>96&&a<=110)
            System.out.println("Hurricane category 2:");

        if(a>111&&a<=130)
            System.out.println("Hurricane category 3:");
        if(a>131&&a<=155)
            System.out.println("Hurricane category 5:");}

        else {
            System.out.println("invalid Wind Speed:");
        }
    }

}
