public class SparseArrayEntry
{
    private int rows;
    private int cols;
    private int value;
    
    public SparseArrayEntry(int r, int c, int v)
    {
        rows =r;
        cols = c;
        value = v;
    }
    
    public int getRow()
    {
        return rows;
    }
    
    public int getCols()
    {
        return cols;
    }
    
    public int getValue()
    {
        return value;
    }
    
    
    
    
    
    
}