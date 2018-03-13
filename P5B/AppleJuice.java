public class AppleJuice extends Juice
{
    private double price; 
    public AppleJuice(String name, int calories)
    {
        super(name,calories );
        price = 2.45;
    }
    
    public double getPrice()
    {
        
        return price;
    }
    
    @Override
    public String brand()
    {
        return "Apple Juice Brand!";
    }
    
    
    
}
