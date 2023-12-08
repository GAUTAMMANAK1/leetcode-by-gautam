import java.util.*;
public class Main {
    public static void main (String [] args )
    {
        // Adding
        int x = 15;
        int y = 10;
        int sum = x+y;
        System.out.println("Adding="+ sum);
        //multiple
        int multi = x*y;
        System.out.println("Multiple="+multi);
        // Divide
        int v1 =x/y;
        int v2 = y/x;
        int v3 = x%y;
        System.out.println (v1);
                System.out.println (v2);
                        System.out.println (v3);
                        //Bodmass
                        int exp = (x*y) / (x+y);
                        System.out.println ("Bodmass=" + exp);
    }
}