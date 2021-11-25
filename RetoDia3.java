
package RetosCadenas;

import java.util.Scanner;

public class RetoDia3 {
	public static void main(String[] args) {

        String[] nombresCompuestos=new String[]{"Jose","Maria","Juan","del Mar","Manuel","Antonio","Carlos","Alberto","Javier","Diego", "Luis"};
        
        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce tu nombre completo: ");
        String nombreCompleto=entrada.nextLine();
        
        printNombreApellidos(nombreCompleto,nombresCompuestos);
        entrada.close();
        
    }
	/*Esta funcion devuelve tres campos de tipo String, nombre, apellido1 y apellido 2  a partir
     * de una cadena que se recibe como parametro indicando el nombre completo. Tendra que distinguir
     * si hay nombres compuestos, si solo se indica el primer apellido o si no se pasa ningun apellido*/
    
    
    public static void printNombreApellidos(String nombreCompleto, String[] nombresCompuestos){

            String nombre="", apellido1="", apellido2="";
            String [] nombreDividido= new String[4];
            boolean esNombreCompuesto=false, finNombreDividido=false;
            int longitud=0;//determina si no se ha escrito nada, solo el nombre, 
            	 			//el nombre y un apellido o el nombre y los dos apellidos
            
            nombreDividido=nombreCompleto.split("\\s+");
            longitud=nombreDividido.length;
            
            
            if(nombreCompleto.isBlank()) {
            	System.out.println("Error. Tienes que escribir un nombre");
            	return ;
            }
            
            int posEnNombreDividido=0;
            while(posEnNombreDividido<longitud)
            {	
            	switch(posEnNombreDividido)
            	{
            	
            		case 0:
            	
            			nombre=nombreDividido[posEnNombreDividido];
            			break;
            			
            		case 1:
            			
            			for(int i=0;i<nombresCompuestos.length && !esNombreCompuesto;i++) {
                        	
            				if(nombreDividido[posEnNombreDividido].equals(nombresCompuestos[i])) {
            					nombre=nombre+" "+nombreDividido[posEnNombreDividido];
            					esNombreCompuesto=true;
            				}
            			}
            			if(!esNombreCompuesto)
            				apellido1=nombreDividido[posEnNombreDividido];
            			break;
            			
            		case 2:
            			
            			if(esNombreCompuesto) 
            				apellido1=nombreDividido[posEnNombreDividido];
            			else 
            	            apellido2=nombreDividido[posEnNombreDividido];
            	        
            			break;
    
            			
            		case 3: 
            			
            			apellido2=nombreDividido[posEnNombreDividido];
            	        
            			break;		
            	            
            	}
            	
            	posEnNombreDividido++;
            }
            
          //Imprimimos solo el nombre, el nombre con el primer apellido o el nombre con 2 apellidos
            if(apellido1.isBlank() && apellido2.isBlank())
            	System.out.println("Nombre: "+nombre);
            else if(apellido2.isBlank())
            	System.out.println("Nombre: "+nombre+", Primer apellido: "+apellido1);
            else
            	System.out.println("Nombre: "+nombre+", Primer apellido: "+apellido1+", Segundo apellido: "+apellido2);
    }
}
