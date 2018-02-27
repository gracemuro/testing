public class MasterOrderDriver
    {
    public static void main( String[] args )
        {
            //create a MasterOrder
            MasterOrder snacks = new MasterOrder();
            
            // populate MasterOrder with CookieOrders
            snacks.addOrder( new CookieOrder("snickerdoodle", 10) );
            snacks.addOrder( new CookieOrder("sugar", 8) );
            snacks.addOrder( new CookieOrder("Chocolate chip", 3) );
            snacks.addOrder( new CookieOrder("Chocolate chip", 7) );
            
            // print maser order.
            
            System.out.println( snacks );
            
        } // end method main
    } // end class MasterOrderDriver