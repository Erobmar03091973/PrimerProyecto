import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {		 
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce radio: ");		
		double radio=entrada.nextDouble();
		
		final double PI=3.1416;
		
		double area=PI*radio*radio;
		double longitud=2*PI*radio;
		
		System.out.println("El area es: " + area);
		
		System.out.println("La longitud es: " + longitud);
		
		
				
		
		
		
	

	}

}
