import java.util.Arrays;

public class Array1
{
    
    private int[] a1;
    private int[][] a2;
    private int length;
    private int width;
    public Array1(int[] aa1)
    {
        int[] a1 = new int[aa1.length];
        
        for(int i =0; i<= aa1.length; i++)
        {
            a1[i]= aa1[i];
        }
    }
    
     public Array1(int[][] aa2)
    {
      int[][] a2 = new int[length][width];
        
        for(int i =0; i<= length * width; i++)
        {
            a2[i][i]= aa2[i][i];
        }
    }
    
    public static int arraySum(int[] a1) 
    {
        int sum =0;
        
        for(int i =0; i<= a1.length; i++)
        {
            sum = i + sum;
        }
        return sum;
    }
    
    
    public static int[] rowSums(int[][] a2) 
    {
        
         int[][] sum2;
         
        sum2 = new int[0][0];
        for(int i =0; i <= a2.length; i++)
        {
           for(int k =0; k <= a2.length; k++)
        {
          // sum2 = new int[i][k];
        }
        }
        //return sum2;
    
    }
   
    public static boolean isDiverse(int[][] a2) 
    {
        
        return false;
        
    }
}