public class GrapeJuice extends Juice
{
    private double price; 
    public GrapeJuice(String name, int calories)
    {
        super(name,calories );
        price = 3.75;
    }
    
     
    public double getPrice()
    {
        
        return price;
    }
    
    
    @Override
    public String brand()
    {
        return "Grape Juice Brand!";
    }
    
    
    
}
