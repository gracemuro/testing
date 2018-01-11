public class Change
{
    private double coins, cost, ammount , bills, change;
    
    
    public Change(double ammt, double cns, double blls)
    {
        ammount = ammt;
        coins = cns;
        bills = blls;
    }
    
    private double getCoins()
    {
        coins = coins * .1;
        return coins;
        
    }
    
    private double getCost()
    {
       
       ammount = bills + coins;
       return ammount;
    }
    
    private double getMoneyLeft()
    {
        double money;
        money = cost - ammount;
        return money;
    }
    
    private double getChange()
    {
        int penny = 0;
        int nickels = 0;
        int dimes = 0;
        int quarters =0;
        
 
    }
    
    // multiply by 100 
    //mod by 100 for last 2 digits
    // no ifs
    // do in order ec 55 % 20
    
    public String toString()
    {
        
        
    }
    
    
}