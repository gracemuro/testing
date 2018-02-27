public class CookieOrder
    {
    private String variety;
    private int numBoxes;
    
    public CookieOrder(String initialVariety, int initialNumBoxes)
    {
        variety = initialVariety;
        numBoxes = initialNumBoxes;
        
    }
    
    
        
    public String getVariety()
        {
        return variety;
        } //end method getVariety
        
    public int getNumBoxes()
        {
        return numBoxes;
        } // end method getNumBoxes
    
    public String toString()
        {
        return "There are " + getNumBoxes() + " boxes of " + getVariety() + " cookies";
        } // end method toString
    } // end class CookieOrder