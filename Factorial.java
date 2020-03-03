package Introtri;

public class Factorialusingrecursion {
	
	
	    public static void main(String[] args)
	    {
	        System.out.println("Factorial of 4 is " + factorial(4) );
	    }
	    
	    public static int factorial(int i)
	    {
	        if( i == 1 )    
	        {
	            return 1;
	        }
	    
	        return i * factorial(i - 1); 
	    }
	}


