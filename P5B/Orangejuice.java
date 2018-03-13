public class Orangejuice extends Juice
{
    private double price; 
    public Orangejuice(String name, int calories)
    {
        super(name,calories );
        price = 3.50;
    }
    
     
    public double getPrice()
    {
        
        return price;
    }
    
    @Override
    public String brand()
    {
        return "Orange Juice Brand!";
    }
       
    
    
    
    
}
