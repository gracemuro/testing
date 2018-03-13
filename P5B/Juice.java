public class Juice
{
    private String name;
    private int calories; 
    
    public Juice(String initialName, int cal)
    {
        name = initialName;
        calories = cal;
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getCalories()
    {
        
        return calories;
    }
    
    public String brand()
    {
        return "Juice Brand!";
    }
        
    
}