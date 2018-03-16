




import java.util.ArrayList;
import java.util.Arrays;
public class RandomStringChooser
   {
       
       private ArrayList<String> rand;
       
       public RandomStringChooser(  ArrayList<String> inRand)
       {
          
           ArrayList<String> rand = inRand;
           
           
           
           
           
          // String[] rand = new String[inRand.length];
           
          // for(int i =0; i <rand.length; i++)
        //{
            
         //   rand[i] = inRand[i];
   
        //}
        }
        
        
   
       
   public String getNext2()
       {
           int chosen = (int) (Math.random() * rand.size());
           System.out.println(chosen);
           return rand.get(chosen);
            
           
           
           
        }
       
       
   public String toString()
      {
      String output = new String();
      
      //for( String word : wordList )
        // {
        // output += word + ", ";    
        // } // end for
         
      return output;
      } // end method toString
   } // end RandomStringChooser