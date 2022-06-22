import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		 Scanner entrada=new Scanner(System.in);
		 
		 System.out.println("Introduce cateto1: ");		
			double cateto1=entrada.nextDouble();
		
		 System.out.println("Introduce cateto2: ");		
			double cateto2=entrada.nextDouble();
			
		 double hipotenusa  = Math.sqrt((cateto1*cateto1) + (cateto2*cateto2));	
			
		 System.out.printf ("La hipotenusa del triangulo es %.2f", hipotenusa);	
		  
	}
}
