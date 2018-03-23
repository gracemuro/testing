public class TWOD{
    
    public static void main(String args[])
    {
        int[][] numbers = new int[6][7];
        int x =1;
        int totalSum =0;
        int rowsum =0;
        int colsum =0;
        for(int row =0; row< numbers.length; row++)
        {
            for(int col =0; col<numbers[0].length; col++)
            {
                numbers[row][col] = x;
                totalSum = totalSum +x;
                colsum = colsum + numbers[row][col];
               x++;
                //System.out.println("COLactualltrow SUM " +col + " "+ colsum);
            }
                //++;
            
                
                
            
            //rowsum = rowsum + numbers[row][0];
            System.out.println("THE ROW SUM " +row + " "+ colsum);
            colsum =0;
            
        }
        //colsum =0;
         for(int col =0; col< numbers[0].length; col++)
        {
            for(int row =0; row<numbers.length; row++)
            {
                rowsum =rowsum +numbers[row][col];
                
            }
            System.out.println("THE COL SUM " +col + " "+ rowsum);
            rowsum =0;
        }
        
        
        for(int row =0; row< numbers.length; row++)
        {
            for(int col =0; col<numbers[0].length; col++)
            {
                System.out.print(numbers[row][col] + "\t");
                } 
                 System.out.print("\n");
            }
            
            
            
            System.out.println("TOTAL SUM" + totalSum);
             System.out.println("ROW SUM" + rowsum);
             //  System.out.println("COL SUM" + colsum);
    }
}