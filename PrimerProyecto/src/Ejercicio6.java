import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce velocidad: ");		
		double velocidad=entrada.nextDouble();
		
		
		double velocidad1= (velocidad *1000)/60;
		System.out.println("La velocidad es: " + velocidad1);
		
		
		

	}

}
