import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		 Scanner entrada=new Scanner(System.in);
			
		 System.out.println("Introduce el radio de la esfera: ");		
			double radio=entrada.nextDouble();
			
		   double volumen=(4/3.0)*(3.1416* (radio*radio*radio));
		 System.out.printf("El volumen de la esfera es % 2f", volumen);  
	}

}
