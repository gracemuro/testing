
import java.util.ArrayList;
public class RandomStringChooserDriver
   {
   public static void main( String[] args )
      {
      ArrayList<String> wordArray = new ArrayList<String>();
      wordArray.add("wheels");
      wordArray.add("on");
      wordArray.add("the");
      wordArray.add("bus");
      
      RandomStringChooser sChooser = new RandomStringChooser(wordArray);
            
      for( int k = 0;k < 6; k++ )
         {
         System.out.print( sChooser.getNext2()+ " " );    
         } // end for
          
      } // end method main   
       
   } // end class RandomStringChooserDriver