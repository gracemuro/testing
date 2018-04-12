
import java.util.ArrayList;
import java.util.List;
public class SparseArray
{
    private int numRows;
    private int numCols;
    
    private List<SparseArrayEntry> entries;
    
    public SparseArray()
    {
        entries = new ArrayList<SparseArrayEntry>();
        
    }
    
    public int getNumCols()
    {
        return numCols;
    }
    
    
    public int getNumRows()
    {
        
        return numRows;
    }
    
    public int getValueAt(int row, int col)
    {
        if(entries[row][col] ==0)
        {
            return 0;
        }
        else
        {
          return entries[row][col];
        }
    
    }
    
    
    public void removeColumn(int cols)
    {
        
    }
    
}