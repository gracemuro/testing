import java.util.List;
import java.util.ArrayList;

public class MasterOrder
    {
    private List<CookieOrder> orders;
    public MasterOrder()
        {
        orders = new ArrayList<CookieOrder>();
        } // end constructor
        
    public void addOrder( CookieOrder theOrder )
        {
        orders.add( theOrder );
        } // end getter add
        
    public int getTotalBoxes()
        {
        // to be completed in part A    
        return 0;  //     
        } // end processor total
        
    public int removeVariety( String cookieVar )
        {
        // to be completed in part B  
        return 0;
        } // end method removeVariety
    
    public String toString()
        {
        String totalOrder = new String();
        for( CookieOrder thisOrder: orders )
            {
            //totalOrder = thisOrder.toString() + "\n" + totalOrder;
            totalOrder += thisOrder.toString() + "\n";
            } // end for
        return totalOrder;
        } // end method toString
    } // end class MasterOrder