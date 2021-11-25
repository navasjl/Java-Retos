package RetosCadenas;


public class RetoDia6_Aritmetica {

	/*Esta funcion recibe 2 numeros entre 0 y 9 y un operador(+,-,*,/), aplica la respectiva
	 * operacione imprime el resultado y los paramtros como cadena de texto*/
	
	public static void calculadoraTexto(Integer num1,Integer num2,String operador) throws Exception, ArithmeticException, NullPointerException{
		
		
		String num1Texto= num1.toString();
		String num2Texto= num2.toString();
		String resTexto;
		
		Integer resultado=0;
		
		if(num1<0 || num1>9 || num2<0 || num2>9)
			throw new ArithmeticException();
		if(!(operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")))
			throw new NullPointerException();
		
		if(operador.equals("+")) {
			
			resultado=num1 + num2;
			resTexto=resultado.toString();
			System.out.println("Suma de "+num1Texto+" y "+num2Texto+" es "+resTexto);
		}
		if(operador.equals("-")) {
			
			resultado=num1 - num2;
			if(num1<num2)
				throw new Exception();
			resTexto=resultado.toString();
			System.out.println("Resta de "+num1Texto+" y "+num2Texto+" es "+resTexto);
			
		}
		if(operador.equals("*")) {
			
			resultado=num1 * num2;
			resTexto=resultado.toString();
			System.out.println("Multiplicacion de  "+num1Texto+" y "+num2Texto+" es "+resTexto);
		}
		if(operador.equals("/")) {
			
			resultado=num1 / num2;
			resTexto=resultado.toString();
			System.out.println("Division de "+num1Texto+" y "+num2Texto+" es "+resTexto);
		}	
	}
	
	/*Esta funcion recibe dos enteros, num1 y num2, amboscon valor entre 0 y 9
	 * y un operador(+,-,*,/), aplica la respectiva operacion. 
	 * Despues le anade una nueva operacion con el nuevo parametro num3
	 * e imprime el resultado y los parametros como cadena de texto*/
	
	public static void calculadoraTextoExtra(Integer num1,Integer num2,String operador1,Integer num3,String operador2) throws Exception, ArithmeticException, NullPointerException{
		
		String num1Texto= num1.toString();
		String num2Texto= num2.toString();
		String num3Texto= num3.toString();
		String resTexto;
		
		Integer resultado=0;
		
		if(num1<0 || num1>9 || num2<0 || num2>9 || num3<0 || num3>9)
			throw new ArithmeticException();
		if(!(operador1.equals("+") || operador1.equals("-") || operador1.equals("*") || operador1.equals("/")
			|| operador2.equals("+") || operador2.equals("-") || operador2.equals("*") || operador2.equals("/")))
			throw new NullPointerException();
		
		if(operador1.equals("+")) {
			
			resultado=num1 + num2;
			if(operador2.equals("+")) {
				resultado+=num3;
				resTexto=resultado.toString();
				System.out.println("Suma de "+num1Texto+" y "+num2Texto+" y sumandole "+num3+" da "+resTexto);
			}
			else if(operador2.equals("-")) {
				resultado-=num3;
				resTexto=resultado.toString();
				System.out.println("Suma de "+num1Texto+" y "+num2Texto+" y restandole "+num3+" da "+resTexto);
			}else if(operador2.equals("*")) {
				resultado*=num3;
				resTexto=resultado.toString();
				System.out.println("Suma de "+num1Texto+" y "+num2Texto+" y multiplicandole "+num3+" da "+resTexto);
			}else if(operador2.equals("/")) {
				resultado/=num3;
				resTexto=resultado.toString();
				System.out.println("Suma de "+num1Texto+" y "+num2Texto+" y dividiendiole "+num3+" da "+resTexto);
			}
		}
		if(operador1.equals("-")) {
			
			resultado=num1 - num2;
			if(num1<num2)
				throw new Exception();
			if(operador2.equals("+")) {
				resultado+=num3;
				resTexto=resultado.toString();
				System.out.println("Resta de "+num1Texto+" y "+num2Texto+" y sumandole "+num3+" da "+resTexto);
			}
			else if(operador2.equals("-")) {
				resultado-=num3;
				resTexto=resultado.toString();
				System.out.println("Resta de "+num1Texto+" y "+num2Texto+" y restandole "+num3+" da "+resTexto);
			}else if(operador2.equals("*")) {
				resultado*=num3;
				resTexto=resultado.toString();
				System.out.println("Resta de "+num1Texto+" y "+num2Texto+" y multiplicandole "+num3+" da "+resTexto);
			}else if(operador2.equals("/")) {
				resultado/=num3;
				resTexto=resultado.toString();
				System.out.println("Resta de "+num1Texto+" y "+num2Texto+" y dividiendiole "+num3+" da "+resTexto);
			}
			
		}
		if(operador1.equals("*")) {
			
			resultado=num1 * num2;
			if(operador2.equals("+")) {
				resultado+=num3;
				resTexto=resultado.toString();
				System.out.println("Multiplicacion de "+num1Texto+" y "+num2Texto+" y sumandole "+num3+" da "+resTexto);
			}
			else if(operador2.equals("-")) {
				resultado-=num3;
				resTexto=resultado.toString();
				System.out.println("Multiplicacion de "+num1Texto+" y "+num2Texto+" y restandole "+num3+" da "+resTexto);
			}else if(operador2.equals("*")) {
				resultado*=num3;
				resTexto=resultado.toString();
				System.out.println("Multiplicacion de "+num1Texto+" y "+num2Texto+" y multiplicandole "+num3+" da "+resTexto);
			}else if(operador2.equals("/")) {
				resultado/=num3;
				resTexto=resultado.toString();
				System.out.println("Multiplicacion de "+num1Texto+" y "+num2Texto+" y dividiendiole "+num3+" da "+resTexto);
			}
		}
		if(operador1.equals("/")) {
			
			resultado=num1 / num2;
			if(operador2.equals("+")) {
				resultado+=num3;
				resTexto=resultado.toString();
				System.out.println("Division de "+num1Texto+" y "+num2Texto+" y sumandole "+num3+" da "+resTexto);
			}
			else if(operador2.equals("-")) {
				resultado-=num3;
				resTexto=resultado.toString();
				System.out.println("Division de "+num1Texto+" y "+num2Texto+" y restandole "+num3+" da "+resTexto);
			}else if(operador2.equals("*")) {
				resultado*=num3;
				resTexto=resultado.toString();
				System.out.println("Division de "+num1Texto+" y "+num2Texto+" y multiplicandole "+num3+" da "+resTexto);
			}else if(operador2.equals("/")) {
				resultado/=num3;
				resTexto=resultado.toString();
				System.out.println("Division de "+num1Texto+" y "+num2Texto+" y dividiendiole "+num3+" da "+resTexto);
			}
		}	
	}
}



