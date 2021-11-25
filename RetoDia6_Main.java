package RetosCadenas;

import java.util.Scanner;

public class RetoDia6_Main {
	
	public static void main(String[] args) {
		
		Integer num1, num2, num3;
		String operador1, operador2;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce dos numeros, ambos entre 0 y 9: ");
		num1=entrada.nextInt();
		num2=entrada.nextInt();
		System.out.println("Introduce una operacion: + - * / ");
		operador1=entrada.next();
		
		try {
			
			RetoDia6_Aritmetica.calculadoraTexto(num1,num2,operador1);
			
			System.out.println("Introduce otro numero,entre 0 y 9, para hacer otra operacion: ");
			num3=entrada.nextInt();
			System.out.println("Introduce una nueva operacion: + - * / ");
			operador2=entrada.next();
			
			RetoDia6_Aritmetica.calculadoraTextoExtra(num1,num2,operador1,num3,operador2);
			
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
