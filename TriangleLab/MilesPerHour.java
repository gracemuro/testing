//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
    private int distance, hours, minutes;
    private double mph;

    public MilesPerHour()
    {
        setNums(0,0,0);
        mph=0.0;
    }

    public MilesPerHour(int dist, int hrs, int mins)
    {
        setNums(dist,hrs,mins);
    }

    public void setNums(int dist, int hrs, int mins)
    {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public void calcMPH()
    {
        double time = minutes / 60.0;
        time = time + hours;
        mph = distance / time;
        
    }

    public void print()
    {

            System.out.printf("%.3f",mph);
            System.out.print(" MPH");
    }
    
    //create a print or toString or both
    
    public String toString()
    {
        
        
        return distance+ " miles in " + hours + " hours and "+ minutes + " minutes = ";
    }
}