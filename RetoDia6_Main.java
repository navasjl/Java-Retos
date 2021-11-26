package RetosCadenas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RetoDia6_Main {
	
	public static void main(String[] args) {
		
		Integer num1, num2, num3;
		String operador1, operador2;
		
		/*Creamos el mapa para la calculadora de texto*/
		Map<Integer,String> numeros=new HashMap<>();
		numeros.put(0, "cero");
		numeros.put(1, "uno");
		numeros.put(2, "dos");
		numeros.put(3, "tres");
		numeros.put(4, "cuatro");
		numeros.put(5, "cinco");	
		numeros.put(6, "seis");
		numeros.put(7, "siete");	
		numeros.put(8, "ocho");
		numeros.put(9, "nueve");
		numeros.put(10, "diez");
		numeros.put(11, "once");
		numeros.put(12, "doce");
		numeros.put(13, "trece");
		numeros.put(14, "catorce");
		numeros.put(15, "quince");	
		numeros.put(16, "dieciseis");
		numeros.put(17, "diecisiete");	
		numeros.put(18, "dieciocho");
		numeros.put(19, "diecinueve");
		numeros.put(20, "veinte");
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce dos numeros, ambos entre 0 y 9: ");
		num1=entrada.nextInt();
		num2=entrada.nextInt();
		System.out.println("Introduce una operacion: + - * / ");
		System.out.println("El resultado de la operacion no puede ser mayor de 20 ");
		operador1=entrada.next();
		
		try {
			
			RetoDia6_AritmeticaTexto.calculadoraTexto(num1,num2,operador1,numeros);
			
			System.out.println("Introduce otro numero,entre 0 y 9, para hacer otra operacion: ");
			num3=entrada.nextInt();
			System.out.println("Introduce una nueva operacion: + - * / ");
			System.out.println("El resultado de la nueva operacion no puede ser mayor de 20 ");
			operador2=entrada.next();
			
			RetoDia6_AritmeticaTexto.calculadoraTextoExtra(num1,num2,operador1,num3,operador2,numeros);
			
			entrada.close();
			
		}catch (ArithmeticException e) {
			System.out.println("El numero introducido es menor que 0 o mayor que 9 "+ e.getMessage());
		}catch (NullPointerException e) {
			System.out.println("El operador no es +, -, *, / "+ e.getMessage());
		}catch (Exception e){
			System.out.println("La resta no puede ser negativa asi que num1 tiene "
					+ "que ser mayor que num2 "+ e.getMessage());
		}
	}
}
