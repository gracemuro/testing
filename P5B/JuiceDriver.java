import java.util.ArrayList;
import java.util.Arrays;

public class JuiceDriver
{

    public static void main(String args[])
    {
        Juice Oj1 = new Orangejuice("ORANGE JUICE COMPANY 1", 300);
        Juice Oj2 = new Orangejuice("ORANGE JUICE COMPANY 2", 500);
        Juice Aj2 = new AppleJuice("APPLE JUICE COMPANY 2", 400);
        Juice Aj1 = new AppleJuice("APPLE JUICE COMPANY 1", 400);
        Juice Gj1 = new GrapeJuice("GRAPE JUICE COMPANY 1", 100);
         Juice Gj2 = new GrapeJuice("GRAPE JUICE COMPANY 2", 100);
        
        ArrayList<Juice> juiceList = new ArrayList<Juice>();
        
     
        juiceList.add(Oj1);
        juiceList.add(Oj2);
        juiceList.add(Aj2);
        juiceList.add(Aj1);
         juiceList.add(Gj2);
        juiceList.add(Gj1);
        
        System.out.println(juiceList);
       
        
        
        
    }
    
    
}
    