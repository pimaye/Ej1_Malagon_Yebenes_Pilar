import java.util.Scanner;

//Ejercicio 1 UF2178 Malagon Yebenes, Pilar

public class Principal 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		//Variables
		double dPeso, dAltura, dImc;
		
		System.out.println("Hola, inserte su peso en kg, por favor");
		dPeso = entrada.nextDouble();
		
		System.out.println("A continuación, inserte su altura en metros, por favor");
		dAltura = entrada.nextDouble();
		
		dImc = dPeso / Math.pow(dAltura, 2);
		
		if (dImc < 18.5)
		{
			System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f "
					+ "y tiene un diagnóstico de Bajo peso", dPeso, dAltura,dImc);
		}
		else if (dImc < 25)
		{
			System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f "
					+ "y tiene un diagnóstico de Peso normal(saludable)", dPeso, dAltura,dImc);
		}
		else if (dImc < 30)
		{
			System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f "
					+ "y tiene un diagnóstico de Sobrepeso", dPeso, dAltura,dImc);
		}
		else if (dImc < 40.1)
		{
			System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f "
					+ "y tiene un diagnóstico de Obesidad premórbida", dPeso, dAltura,dImc);
		}
		else
		{
			System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f "
					+ "y tiene un diagnóstico de Obesidad mórbida", dPeso, dAltura,dImc);
		}
		
	}

}
