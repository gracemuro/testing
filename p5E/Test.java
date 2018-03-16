






import java.util.Arrays; 
public class Test
{
    
    public static void main(String args[])
    {
        int noneCount =0;
        String[] rand = {"wheelws0", "wheelws1","wheelws2","wheelws3", "wheelws4", "wheelws5",
            "wheelws6","wheelws7"};
        String[] hold= new String[rand.length];
       for(int i=0; i < rand.length ;i++)
       {
        int chosen = (int) (Math.random() * rand.length);
           System.out.println(chosen);
      
            if(rand[chosen] == null)
            {
               System.out.println("NONE");
               i--;
               noneCount++;
            }
            else
            {
  
                hold[i] = rand[chosen];
            }
        
           rand[chosen] = null;
       
            System.out.println("the current array"  + Arrays.toString(hold));
        }
                System.out.println("none count: " + noneCount);
         String[] holder= new String[rand.length + noneCount];
        for(int i =0; i <rand.length; i++)
        {
            
            holder[i] = hold[i];
   
        }
       
        for(int i =rand.length; i <holder.length; i++)
        {
           holder[i] = null;
            if(holder[i] == null)
            {
                holder[i] = "NONEE";
            }
        }
        System.out.println("the current array"  + Arrays.toString(holder));
    }
    }