import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce precio: ");	
		float precio=teclado.nextFloat();
	
		
	    System.out.println("Introduce importe introducido: ");		
		float importe=teclado.nextFloat();
		
		float cambio=importe-precio;
	
		int euros = (int) cambio;
		int m2e=euros/2;
		int m1e=euros%2;
		
		int centimos = (int) ((cambio-euros)*100);
		
		int m50c=centimos/50;
		int resto=centimos%50;
		
		int m20c=resto/20;
	     resto=resto %20;
	     
	     int m10c=resto/10;
		  resto=resto%10;
		  
		  int m5c=resto/5;
		  resto=resto%5;
		  
		  int m2c=resto/2;
		 
		  
		  int m1c=resto%2;
		  
		  System.out.printf("Devolver %.2f \n", euros);
		  System.out.printf("Monedas de 2 euros:%d\nMonedas 1 euro: %d", m2e,m1e);
		  System.out.printf("Monedas de 50c:%d\nMonedas 20c: %d", m50c,m20c);
		  System.out.printf("Monedas de 10c:%d\nMonedas 5c: %d", m10c,m5c);
		  System.out.printf("Monedas de 2c:%d\nMonedas 1c: %d", m2c,m1c);
		
		
     		

	}

}
