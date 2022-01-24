import java.util.Scanner;

/**
 * 
 */

/**
 * @author Virginia
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce tu peso");
		double peso=entrada.nextDouble();
		System.out.println("introduce tu altura");
		double altura=entrada.nextDouble();
		double imc= peso/altura*altura;
		
		if( imc < 18.5) {
			System.out.println("el paciente de "+peso+" kilos de peso  y "+altura+
					 " centimetros  de altura,tiene un imc de: "+imc+
					 " y tiene un diagnóstico de bajo peso");
		}else if(imc > 18.5 && imc < 24.9) {
			System.out.println("El paciente de "+peso+ "kilos de peso y "+altura+
					"metros de altura, tieme un imc de: "+ imc+
					" y tiene un diagnóstico de peso normal");
			}else if( imc >= 25 && imc <= 29.9) {
				System.out.println("El paciente de "+peso+ "kilos de peso y "+altura+
						"metros de altura, tieme un imc de: "+ imc+
						" y tiene un diagnóstico de sobrepeso");
			}
	    else if( imc >= 30 && imc <=40) {
		System.out.println("El paciente de "+peso+ "kilos de peso y "+altura+
				"metros de altura, tieme un imc de: "+ imc+
				" y tiene un diagnóstico de obesidad premórbida");
	}
	    else {
	          System.out.println("El paciente de "+peso+ "kilos de peso y "+altura+
					"metros de altura, tieme un imc de: \n"+ imc+
					" y tiene un diagnóstico de obesidad mórbida ");
		}
	    }
	}

