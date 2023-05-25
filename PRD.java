// Java Program for Method overloading
// By using Different Types of Arguments

// Class 1
class Prod {

	// Method with 2 integer parameters
	static int Mul(int a, int b)
	{

		// Returns product of integer numbers
		return a * b;
	}

	// Method 2
	// With same name but with 2 double parameters
	static double Mul(double a, double b)
	{

		// Returns product of double numbers
		return a * b;
	}
  
  	static int Mul(int a ,int b , int c)
    {
        // Returns product of three numbers
    	return a * b * c; 
    }
    // All above are over loading
    
}


class New_prod extends Prod{
    	static int Mul(int a, int b)
        {
        	return a * a * b * b;   // Overriding
        }
    
    }

// Main class
class PRD {

	// Main driver method
	public static void main(String[] args)
	{

		// Calling method by passing
		// input as in arguments
        Prod obj = new Prod();
        New_prod obj2 = new New_prod();
		System.out.println(obj.Mul(2, 4));
		System.out.println(obj.Mul(5.5,6.3));
        System.out.println(obj.Mul(5,6,2));
        System.out.println(obj2.Mul(2,3));
      
	}
}
