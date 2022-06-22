import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
	
		Scanner entrada=new Scanner(System.in);
		
		 System.out.println("Introduce longitud lado1 triangulo: ");		
			double lado1=entrada.nextDouble();
		
			
		System.out.println("Introduce longitud lado2 triangulo: ");		
			double lado2=entrada.nextDouble();	
			
		System.out.println("Introduce longitud lado3 triangulo: ");		
			double lado3=entrada.nextDouble();

			double perimetro= (lado1+lado2+lado3)/2;
			
			double area=Math.sqrt(perimetro*(perimetro-lado1)*(perimetro-lado2)*(perimetro-lado2));
			
		System.out.printf("El area del triangulo de lados %.2f, %.2f y %.2f es %.2f", lado1,lado2,lado3,area);	
			
	}

}
