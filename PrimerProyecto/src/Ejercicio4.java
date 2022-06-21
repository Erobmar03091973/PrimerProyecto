import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		float centigrados;
		
		Scanner entrada=new Scanner (System.in);
		
		System.out.println("Introduce los grados: ");
		centigrados=entrada.nextFloat();
		
		 float f =32+(9* centigrados/5);
		 System.out.println("Son  " + f+ "grados fahrenheit");
				 
				 
		
		

	}

}
