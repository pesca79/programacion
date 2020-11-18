import java.util.*;
public class Simplebot {
	static Scanner input = new Scanner(System.in);
// Mi edad es 41, cuyos restos son..... dividido entre 3=2, entre 5=1 y entre 7=6
    public static void main(String[] args) {    
	faseUno();
	faseDosyTres();
	faseCuatro();
	faseCinco();			
    }

public static void faseUno() {
    String botName = "JavaBot";
	int birthYear = 2020;
	System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
	System.out.print(" \t\t¡Hola!, mi nombre es "+botName+"\n\n\t\ty fui creado el 5 de Octubre del "+birthYear+" \n\n\t\ten clase de programación de Rafael García Cabrera\n");
	System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
	System.out.println("");		
}

public static void faseDosyTres() {
				System.out.println("Por favor, dime, ¿cuál es tu nombre? ");	
				System.out.println("");				
				System.out.print("> ");		
				String name = input.nextLine();
		while (name.isEmpty()) {
				System.out.println("Venga, por favor, en serio, ¿cuál es tu nombre? ");	
				System.out.println("");				
				System.out.print("> ");		
				name = input.nextLine();		
				}
	System.out.println("");	
	System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
	System.out.println("\t\tQué nombre tan bonito tienes, "+name+"!");
	System.out.println("");	
	System.out.println("\t\tDéjame adivinar tu edad, "+name);
	System.out.println("");	
	System.out.println("\t\tLa adivinaré a no ser que tengas más de 104 años.\n\n\t\tNo eres tan mayor, verdad,"+name+"?");	
	System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
	System.out.println("");		
	System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
	System.out.println("╔═══════════════════════════════════════════════════════════════════════════════╗");	
	System.out.println("║       Para ello, ingresa, primero, el resto de dividir tu edad entre 3:       ║");
	System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
	System.out.println(" ////////////////////////////////////////////////////////////////////////////////");

		int divideEntreTres = -1;
		boolean continuar;
			do {
      				try {
        				continuar = false;		
      					System.out.println("");	
        				System.out.println("Por favor, elige el resto de dividir tu edad entre 3:");
						System.out.print("> ");		
          				divideEntreTres = input.nextInt(); 
        				} catch (InputMismatchException e) {
          				System.out.println("");		
            			System.out.println("¡Cuidado! Solo puedes insertar números de 0 a 2.");           				
          				System.out.println("");			
          				input.next(); 
          				continuar = true;
     					}
				} while ((continuar) || ((divideEntreTres<0) || (divideEntreTres>2)));

		System.out.println("");	
		System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
		System.out.println("╔═══════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("║              Ahora, el resto de dividir tu edad entre 5:                      ║");
		System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
		System.out.println(" ////////////////////////////////////////////////////////////////////////////////");

		int divideEntreCinco = -1;

			do {
      				try {
        				continuar = false;		
      					System.out.println("");	
        				System.out.println("Por favor, elige el resto de dividir tu edad entre 5:");
						System.out.print("> ");		
          				divideEntreCinco = input.nextInt(); 
        				} catch (InputMismatchException e) {
          				System.out.println("");		
            			System.out.println("¡Cuidado! Solo puedes insertar números de 0 a 4.");           				
          				System.out.println("");			
          				input.next(); 
          				continuar = true;
     					}
				} while ((continuar) || ((divideEntreCinco<0) || (divideEntreCinco>4)));

		System.out.println("");	
		System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
		System.out.println("╔═══════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("║              Y por último, el resto de dividir tu edad entre 7:               ║");
		System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
		System.out.println(" ////////////////////////////////////////////////////////////////////////////////");

		int divideEntreSiete = -1;

			do {
      				try {
        				continuar = false;		
      					System.out.println("");	
        				System.out.println("Por favor, elige el resto de dividir tu edad entre 7:");
						System.out.print("> ");		
          				divideEntreSiete = input.nextInt(); 
        				} catch (InputMismatchException e) {
          				System.out.println("");		
            			System.out.println("¡Cuidado! Solo puedes insertar números de 0 a 6.");           				
          				System.out.println("");			
          				input.next(); 
          				continuar = true;
     					}
				} while ((continuar) || ((divideEntreSiete<0) || (divideEntreSiete>6)));

		int age = (divideEntreTres * 70 + divideEntreCinco * 21 + divideEntreSiete * 15) % 105;
		System.out.println("");
		System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
		System.out.println("╔═══════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("║                              Calculando tu edad                               ║");
		System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
		System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
		System.out.print(" 0%........");
		for(int i=1; i<=7; i++){
            for(int j=1; j<=i; j++){
                System.out.print(".");
            }
					try {
            			Thread.sleep(200);
            			} catch (InterruptedException e) {
            			e.printStackTrace();
            			}
        }		            						
        System.out.print("...50%..");
        for(int i=1; i<=7; i++){
            for(int j=1; j<=i; j++){
                System.out.print(".");
            }
					try {
                		Thread.sleep(200);
            			} catch (InterruptedException e) {
                		e.printStackTrace();
            			}
			}		            						
        System.out.print("..100%  ");
		System.out.println("");
		System.out.println(" ////////////////////////////////////////////////////////////////////////////////");			
		System.out.println("╔═══════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("║     Tienes "+age+" años, una edad excelente para empezar a programar               ║");
		System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
		System.out.println(" ////////////////////////////////////////////////////////////////////////////////");			
		System.out.println("");
		}
public static void faseCuatro() {
		System.out.println("");	
		System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
		System.out.println("╔═══════════════════════════════════════════════════════════════════════════════╗");	
		System.out.println("║  Ahora, te demostraré que soy capaz de contar hasta el número que me indiques ║");
		System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
		System.out.println(" ////////////////////////////////////////////////////////////////////////////////");		
		System.out.println("");		
		System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
		System.out.println("╔═══════════════════════════════════════════════════════════════════════════════╗");		
		System.out.println("║       Indícame un número positivo para empezar a contar desde el mismo:       ║");
		System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
		System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
		System.out.print("> ");

		int numeroContar = -1;
		boolean continuar;
        	do {
        		try {
        			continuar = false;		
        			System.out.println("");	
        			System.out.println("Por favor, elija un número entero positivo:");
					System.out.print("> ");		
            		numeroContar = input.nextInt(); 
        			} catch (InputMismatchException e) {
            		System.out.println("¡Cuidado! Solo puedes insertar positivos mayores que 0.");	
					System.out.print("> ");						
    				numeroContar = input.nextInt();
            		continuar = true;
        			}
        	} while ((continuar) || (numeroContar<1)); 

		System.out.println("");
	for (int i=0; i<=numeroContar; i++) {			
		System.out.print(" "+i);
		System.out.println("!");	
		try {
        Thread.sleep(1000);
        } catch (InterruptedException e) {
        e.printStackTrace();
         	}
       	}		
	System.out.println("");
	System.out.println("Completado!, que tengas un buen día!");	
	System.out.println("");	
}
public static void faseCinco() {
	System.out.println("Ahora vamos a evaluar tus conocimientos sobre programación: ");
	System.out.println("");
	System.out.println("¿Para qué utilizamos los métodos?: ");
	System.out.println("");
	System.out.println("╔════════════════════════════════════════════════════════════════════════╗");	
	System.out.println("║ 1. Para repetir una sentencia múltiples veces.                         ║");
	System.out.println("║ 2. Para descomponer un programa en varias \"subrutinas\" más pequeñas.   ║");
	System.out.println("║ 3. Para determinar el tiempo de ejecución de un programa.              ║");
	System.out.println("║ 4. Para interrumpir la ejecución de un programa.                       ║");
	System.out.println("╚════════════════════════════════════════════════════════════════════════╝");	
	System.out.println("Por favor, elige una respuesta: ");
	System.out.print("> ");
	boolean continuar;	
	int eleccionRespuesta = 0;
        	do {
        		try {
        			
        			continuar = false;			        				
        			} 
        			catch (InputMismatchException e) {
            		System.out.println("¡Cuidado! Solo puedes insertar números!");
					System.out.print("> ");
					input.nextInt();
            		continuar = true;
        			}
        		} 
        		while (continuar);        
        			  continuar = false;
        			  eleccionRespuesta = input.nextInt();
	  			while ((eleccionRespuesta!=2)) { 
				      System.out.println("¡Incorrecto! Inténtalo de nuevo:");		
					  System.out.print("> ");			
					  eleccionRespuesta = input.nextInt();
				} 				
				      System.out.println("¡Enhorabuena! ¡Que tengas un buen día!"); 
				}
}





