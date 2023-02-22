import java.util.Scanner;

/*15. Programa que lea una cadena que contiene el nombre y apellidos de una persona, y lo 
devuelva en formato «Apellidos, Iniciales». Ejemplo: 
 Entrada -> Juan Francisco García Ruiz 
 Salida -> García Ruiz, J. F. */

/**
 * Funcion principal
 * @author Usuario
 *
 */

public class Principal06_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);
		
		//Variables
		String sCadena;
		String sApellido2,sApellido1,sIniciales;
		int iPosUltimoEspacio,iPosEspacio,iPos;
		
		
		System.out.println("Inserte una frase:");
		sCadena = entrada.nextLine();
		
		
		
		
		iPosUltimoEspacio = sCadena.lastIndexOf(" ");
		sApellido2 = sCadena.substring(iPosUltimoEspacio + 1, sCadena.length());
		sCadena = sCadena.substring(0,iPosUltimoEspacio);
			
		iPosUltimoEspacio = sCadena.lastIndexOf(" ");
		sApellido1 = sCadena.substring(iPosUltimoEspacio + 1, sCadena.length());
		//sIniciales = String.valueOf(sNombre.charAt(0)) + ".";
		sCadena = sCadena.substring(0,iPosUltimoEspacio);
		
		sIniciales = sCadena.substring(0,1) + ".";
		
		iPosEspacio = 0;
		do
		{
			iPos = sCadena.indexOf(" ", iPosEspacio);//iPos: donde he encontrado el espacio
			if (iPos != -1)
			{
				sIniciales = sIniciales + sCadena.substring(iPos + 1, iPos + 2) + ".";
				iPosEspacio = iPos + 1;	
			}
		}while (iPos != -1);
			
	
	
		System.out.println(sApellido1);
		System.out.println(sApellido2 + ",");
		System.out.println(sIniciales);
		
		System.out.println(" ");
		
		System.out.println("El nombre con el nuevo formato es:");
		System.out.println(sApellido1 + " " + sApellido2 + "," + sIniciales);
		
		System.out.println(" ");
		
		System.out.println("Solo el nombre es, porque los apellido se han quitado"
				+ " con el substring: " + sCadena);
		
		entrada.close();
		
		
	}

}
