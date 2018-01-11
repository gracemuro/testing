//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle
{
    private int sideA, sideB, sideC;
    private double perimeter;
    private double theArea;

    public Triangle()
    {
       setSides(0,0,0);
       perimeter=0;
       theArea=0;
    }

    public Triangle(int a, int b, int c)
    {
      setSides(a,b,c);

    }


    public void setSides(int a, int b, int c)
    {
       sideA = a;
       sideB = b;
       sideC = c;
    }

    public void calcPerimeter( )
    {
          perimeter = sideA + sideB + sideC;
    }

    public void calcArea( )
    {
        double s;
        s = perimeter / 2;
        
        theArea =(s * (s - sideA)*(s - sideB)*(s - sideC));
        theArea = Math.sqrt(theArea);
    }

    public void print( )
    {
        System.out.println("\n\n");
        System.out.printf("%.3f\n",theArea);
  
    }
    
 
    //create a print method or toString or both
   
    public String toString()
    {
        System.out.println(sideA + " " + sideB + " " + sideC);
        System.out.printf("%.3f\n", theArea);
        return " ";
        
    }
}