class MultipleCatch {
public static void main(String args[]) {
try {
int den = 0;
	System.out.println(3/den);
} 
catch (ArithmeticException exc) 
{
	System.out.println("Divisor was 0. "+exc);
} 
catch (ArrayIndexOutOfBoundsException exc2)
{
	System.out.println("Missing argument "+exc2 );
 }
	System.out.println("After exception.");
 }
   }
  
