import java.sql.SQLOutput;
import java.util.*;
public class Arraylists {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        while(true){
            String input=sc.nextLine();
            if(input.equals("quit"))
                break;
            else
                names.add(input);
        }
//        System.out.println("Names are:"+names);
        ArrayList<String> Dup=new ArrayList<String>();
        for (String i : names)
        {
            if(Dup.contains(i)){
                continue;
            }
            else{
                Dup.add(i);
            }
        }
        for(String i: Dup){
            System.out.println(i);
        }
        Random rand=new Random();
        System.out.println("lucky winner is:"+Dup.get(rand.nextInt(Dup.size())));
    }
}
