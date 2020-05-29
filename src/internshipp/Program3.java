package internshipp;
import java.util.Scanner;

public class Program3 {
    
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        int l;
        String name ;
        char ch;
       int  count =0, co=0;
       System.out.println("Plz Enter ur Name");
        name = sc.nextLine();
        l = name.length();
        for(int i =0 ; i< l ;i++)
        {
            ch = name.charAt(i);
            if(ch>=65 && ch<=90)
            {
                count++;
            }
        } 
        System.out.println("Number of Capital Letters is " + count);
     
    }
    
}
