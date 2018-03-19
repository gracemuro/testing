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
    
    
    
    
    public String getname()
    {
        return "Orange Juice Brand COMAPNY THAT OVERRIDES!";
    }
       
   
    
    public String toString()
    {
    
        return "Name: " + getName() + " calories" + getCalories();
    }
}
