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
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("\t\t/////////////////////////////////////////////////////////");
	System.out.println("\t\t║  ¡Hola!, mi nombre es "+botName+"\t\t\t\t║");
	System.out.println("\t\t║  y fui creado el 5 de Octubre del "+birthYear+" \t\t║");
	System.out.println("\t\t║  en clase de programación de Rafael García Cabrera\t║");
	System.out.println("\t\t/////////////////////////////////////////////////////////");
	System.out.println("");
	System.out.println("");
	System.out.println("");		
	System.out.println("");
}

public static void faseDosyTres() {
	System.out.println("\t\t/////////////////////////////////////////////////////////");
	System.out.println("\t\t║        Por favor, dime, ¿cuál es tu nombre?           ║");	
	System.out.println("\t\t/////////////////////////////////////////////////////////");
	System.out.println("");
	System.out.println("");
	System.out.println("");				
	System.out.print("> ");		
	String name = input.nextLine();
		while (name.isEmpty()) {
				System.out.println("\t\t/////////////////////////////////////////////////////////");
				System.out.println("\t\t║     Venga, por favor, en serio, ¿cuál es tu nombre?   ║");	
				System.out.println("\t\t/////////////////////////////////////////////////////////");
				System.out.println("");	
				System.out.println("");
				System.out.println("");			
				System.out.print("> ");		
				name = input.nextLine();		
				}
	System.out.println("");	
	System.out.println("\t\t/////////////////////////////////////////////////////////");
	System.out.println("\t\t\t      Qué nombre tan bonito tienes, "+name+"             ");
	System.out.println("\t\t/////////////////////////////////////////////////////////");
	System.out.println("");	
	System.out.println("");
	System.out.println("");	
	System.out.println("\t\t/////////////////////////////////////////////////////////");
	System.out.println("\t\t\t      Déjame adivinar tu edad, "+name+"                  ");
	System.out.println("\t\t/////////////////////////////////////////////////////////");
	System.out.println("");	
	System.out.println("");
	System.out.println("");
	System.out.println("\t\t/////////////////////////////////////////////////////////");
	System.out.println("\t\t\t     La adivinaré si no eres mayor de 104 años.        ");
	System.out.println("\t\t\t     No eres tan mayor, verdad,"+name+"?               ");	
	System.out.println("\t\t/////////////////////////////////////////////////////////");
	System.out.println("");
	System.out.println("");
	System.out.println("");		
	int divideEntreTres = -1;
	boolean continuar;
		do {
			try {
   				continuar = false;		
				System.out.println("");	
				System.out.println("");
				System.out.println("");
				System.out.println("\t\t╔═══════════════════════════════════════════════════════╗");
   				System.out.println("\t\t║ Por favor, elige el resto de dividir tu edad entre 3: ║");
   				System.out.println("\t\t╚═══════════════════════════════════════════════════════╝");
				System.out.print("> ");		
          		divideEntreTres = input.nextInt(); 
        		} catch (InputMismatchException e) {
          		System.out.println("");	
          		System.out.println("");
          		System.out.println("");	
          		System.out.println("\t\t/////////////////////////////////////////////////////////");
            	System.out.println("\t\t║¡ Ten cuidado! Solo puedes insertar números de 0 a 2!  ║");
            	System.out.println("\t\t/////////////////////////////////////////////////////////");
          		System.out.println("");	
          		System.out.println("");		
          		input.next(); 
          		continuar = true;
     			}
		

		    while ((divideEntreTres<0) || (divideEntreTres>2)) { 
           	    do {
               	    try {                   
        		   	    continuar = false;
                        System.out.println("");
                        System.out.println("\t\t╔════════════════════════════════════════╗");
                        System.out.println("\t\t║ Por favor, elige un número entre 0 y 2 ║");
                        System.out.println("\t\t╚════════════════════════════════════════╝");
                        System.out.print("> "); 
                        divideEntreTres = input.nextInt();                                
                        } catch (InputMismatchException e) {
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("\t\t/////////////////////////////////////////////////////////");
                        System.out.println("\t\t║        ¡Cuidado! Solo puedes insertar números!        ║");
                        System.out.println("\t\t/////////////////////////////////////////////////////////");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        input.next();
                        continuar = true; 
                         }
                    } while (continuar);    
            }
        } while (continuar);

		System.out.println("");	
		int divideEntreCinco = -1;
			do {
      				try {
        				continuar = false;		
      					System.out.println("");
      					System.out.println("");
      					System.out.println("");
      					System.out.println("\t\t╔════════════════════════════════════════════════════════╗");	
        				System.out.println("\t\t║  Por favor, elige el resto de dividir tu edad entre 5  ║");
        				System.out.println("\t\t╚════════════════════════════════════════════════════════╝");
						System.out.print("> ");		
          				divideEntreCinco = input.nextInt(); 
        				} catch (InputMismatchException e) {
          				System.out.println("");	
          				System.out.println("\t\t///////////////////////////////////////////////////");	
            			System.out.println("\t\t║ ¡Cuidado! Solo puedes insertar números de 0 a 4 ║");
            			System.out.println("\t\t///////////////////////////////////////////////////");           				
          				System.out.println("");	
          				System.out.println("");		
          				input.next(); 
          				continuar = true;
     					}
					while ((divideEntreCinco<0) || (divideEntreCinco>4)) {
                		do {
                    		try {                   
                        		continuar = false;
                        		System.out.println("");
                        		System.out.println("");
                        		System.out.println("");
                        		System.out.println("\t\t╔══════════════════════════════════════════╗");
                        		System.out.println("\t\t║  Por favor, elige un número entre 0 y 4  ║");
                        		System.out.println("\t\t╚══════════════════════════════════════════╝");
                        		System.out.print("> "); 
                        		divideEntreCinco = input.nextInt();                                
                        		} catch (InputMismatchException e) {
                        		System.out.println("");
                        		System.out.println("");
                        		System.out.println("");
                        		System.out.println("\t\t///////////////////////////////////////////////////");
                        		System.out.println("\t\t║     ¡Cuidado! Solo puedes insertar números!     ║");
                        		System.out.println("\t\t///////////////////////////////////////////////////");
                        		System.out.println("");
                        		System.out.println("");
                        		input.next();
                        		continuar = true; 
								} 									
						} while (continuar);
					}
			} while (continuar);

								System.out.println("");	
								System.out.println("");

		int divideEntreSiete = -1;
			do {
      				try {
        				continuar = false;		
      					System.out.println("");	
      					System.out.println("");	
      					System.out.println("");
      					System.out.println("\t\t╔══════════════════════════════════════════════════════════╗");
        				System.out.println("\t\t║   Por favor, elige el resto de dividir tu edad entre 7   ║");
        				System.out.println("\t\t╚══════════════════════════════════════════════════════════╝");
						System.out.print("> ");		
          				divideEntreSiete = input.nextInt(); 
        				} catch (InputMismatchException e) {
          				System.out.println("");	
          				System.out.println("");
          				System.out.println("");	
          				System.out.println("\t\t///////////////////////////////////////////////////");
            			System.out.println("\t\t║ ¡Cuidado! Solo puedes insertar números de 0 a 6 ║");
            			System.out.println("\t\t///////////////////////////////////////////////////");           				
          				System.out.println("");
          				System.out.println("");			
          				input.next(); 
          				continuar = true;
     					}
					while ((divideEntreSiete<0) || (divideEntreSiete>6)) {
                		do {
                    		try {                   
                        		continuar = false;
                        		System.out.println("");
                        		System.out.println("");
                        		System.out.println("");                        		
                        		System.out.println("\t\t╔══════════════════════════════════════════════════════════╗");
                        		System.out.println("\t\t║          Por favor, elige un número entre 0 y 6          ║");
                        		System.out.println("\t\t╚══════════════════════════════════════════════════════════╝");
                        		System.out.print("> "); 
                        		divideEntreSiete = input.nextInt();                                
                        		} catch (InputMismatchException e) {
                        		System.out.println("");
                        		System.out.println("");
                        		System.out.println("");
                        		System.out.println("\t\t/////////////////////////////////////////");
                        		System.out.println("\t\t║¡Cuidado! Solo puedes insertar números!║");
                        		System.out.println("\t\t/////////////////////////////////////////");
                        		System.out.println("");
                        		System.out.println("");
                        		input.next();
                        		continuar = true; 
								} 									
						} while (continuar);
					}
			} while (continuar);

		int age = (divideEntreTres * 70 + divideEntreCinco * 21 + divideEntreSiete * 15) % 105;
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t/////////////////////////////////////////////////////////////////////////////////");
		System.out.println("\t\t╔═══════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t║                              Calculando tu edad                               ║");
		System.out.println("\t\t╚═══════════════════════════════════════════════════════════════════════════════╝");
		System.out.println("\t\t/////////////////////////////////////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("");		
		System.out.print("\t\t0%........");
		for(int i=1; i<=7; i++){
            for(int j=1; j<=i; j++){
                System.out.print(".");
            }
					try {
            			Thread.sleep(400);
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
        System.out.println("");
		System.out.println("\t\t////////////////////////////////////////////////////////////////////////////////");			
		System.out.println("\t\t╔═══════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t║        Tienes "+age+" años, una edad excelente para empezar a programar            ║");
		System.out.println("\t\t╚═══════════════════════════════════════════════════════════════════════════════╝");
		System.out.println("\t\t////////////////////////////////////////////////////////////////////////////////");			
		System.out.println("");
		}
public static void faseCuatro() {
		System.out.println("");	
		System.out.println("\t\t/////////////////////////////////////////////////////////////////////////////////");
		System.out.println("\t\t╔═══════════════════════════════════════════════════════════════════════════════╗");	
		System.out.println("\t\t║  Ahora, te demostraré que soy capaz de contar hasta el número que me indiques ║");
		System.out.println("\t\t╚═══════════════════════════════════════════════════════════════════════════════╝");
		System.out.println("\t\t/////////////////////////////////////////////////////////////////////////////////");		
		System.out.println("");		
		System.out.println("\t\t/////////////////////////////////////////////////////////////////////////////////");
		System.out.println("\t\t╔═══════════════════════════════════════════════════════════════════════════════╗");		
		System.out.println("\t\t║      Indícame un número positivo para empezar a contar desde el mismo:        ║");
		System.out.println("\t\t╚═══════════════════════════════════════════════════════════════════════════════╝");
		System.out.println("\t\t/////////////////////////////////////////////////////////////////////////////////");;

		int numeroContar = -1;
		boolean continuar;
        	do {
        		try {
        			continuar = false;		
        			System.out.println("");	
        			System.out.println("");
        			System.out.println("");
        			System.out.println("\t\t\t╔═══════════════════════════════════════════════╗");
        			System.out.println("\t\t\t║ Por favor, elija un número entero mayor que 0 ║");
        			System.out.println("\t\t\t╚═══════════════════════════════════════════════╝");
					System.out.print("> ");		
            		numeroContar = input.nextInt(); 
        			} catch (InputMismatchException e) {
        			System.out.println("");
        			System.out.println("");
        			System.out.println("");
        			System.out.println("\t\t\t////////////////////////////////////////////////////////");
            		System.out.println("\t\t\t║ ¡Cuidado! Solo puedes insertar números mayores que 0 ║");
            		System.out.println("\t\t\t////////////////////////////////////////////////////////");	
					System.out.println("");
					System.out.println("");						
    				input.next();
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
	System.out.println("");
	System.out.println("");	
	System.out.println("\t\t\t╔══════════════════════════════════════╗");
	System.out.println("\t\t\t║ Completado!, que tengas un buen día! ║");	
	System.out.println("\t\t\t╚══════════════════════════════════════╝");
	System.out.println("");
	System.out.println("");
	System.out.println("");	
}
public static void faseCinco() {
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("\t\t╔════════════════════════════════════════════════════════════════════════╗");
	System.out.println("\t\t║       Ahora vamos a evaluar tus conocimientos sobre programación:      ║");
	System.out.println("\t\t╚════════════════════════════════════════════════════════════════════════╝");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("\t\t╔════════════════════════════════════════════════════════════════════════╗");
	System.out.println("\t\t║                    ¿Para qué utilizamos los métodos?                   ║");
	System.out.println("\t\t╚════════════════════════════════════════════════════════════════════════╝");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("\t\t╔════════════════════════════════════════════════════════════════════════╗");	
	System.out.println("\t\t║ 1. Para repetir una sentencia múltiples veces.                         ║");
	System.out.println("\t\t║ 2. Para descomponer un programa en varias \"subrutinas\" más pequeñas.   ║");
	System.out.println("\t\t║ 3. Para determinar el tiempo de ejecución de un programa.              ║");
	System.out.println("\t\t║ 4. Para interrumpir la ejecución de un programa.                       ║");
	System.out.println("\t\t╚════════════════════════════════════════════════════════════════════════╝");	
	
	boolean continuar;	
	int eleccionRespuesta = 0;
        	do {
        		try {        			
        			continuar = false;
        			System.out.println("");
        			System.out.println("");
        			System.out.println("");
        			System.out.println("\t\t\t\t╔════════════════════════════════════╗");
        			System.out.println("\t\t\t\t║   Por favor, elige una respuesta:  ║");
        			System.out.println("\t\t\t\t╚════════════════════════════════════╝");
					System.out.print("> ");	
					eleccionRespuesta = input.nextInt();		        				
        			} catch (InputMismatchException e) {
        			System.out.println("");
        			System.out.println("");
        			System.out.println("");
        			System.out.println("\t\t\t\t/////////////////////////////////////////");
            		System.out.println("\t\t\t\t║¡Cuidado, sólo puedes insertar números!║");
            		System.out.println("\t\t\t\t/////////////////////////////////////////");
					System.out.println("");
					System.out.println("");
					input.next();
            		continuar = true;
        			}
        		} while (continuar);
        		
	  			do {

  				while ((eleccionRespuesta<1) || (eleccionRespuesta>4)) { 
	  				do {
        				try {        			
        					continuar = false;
        					System.out.println("");
        					System.out.println("");
        					System.out.println("");
        					System.out.println("\t\t\t\t╔════════════════════════════════════════╗");
        					System.out.println("\t\t\t\t║ Por favor, elige un número entre 1 y 4 ║");
        					System.out.println("\t\t\t\t╚════════════════════════════════════════╝");
							System.out.print("> ");	
							eleccionRespuesta = input.nextInt();		        				
        					} catch (InputMismatchException e) {
        					System.out.println("");
        					System.out.println("");
        					System.out.println("");
        					System.out.println("\t\t\t\t/////////////////////////////////////////");
            				System.out.println("\t\t\t\t║¡Cuidado, sólo puedes insertar números!║");
            				System.out.println("\t\t\t\t/////////////////////////////////////////");
							System.out.println("");
							System.out.println("");
							input.next();
            				continuar = true; 
            				}
		   				} while (continuar);	
				}
        			
				while ((!(eleccionRespuesta==2)) && (eleccionRespuesta>0) && (eleccionRespuesta<5)) {
        			try {        			
        				continuar = false;
        				System.out.println("");
        				System.out.println("");
        				System.out.println("");
        				System.out.println("\t\t\t\t╔════════════════════════════════════════╗");
        				System.out.println("\t\t\t\t║   ¡Incorrecto! Inténtalo de nuevo:     ║");
        				System.out.println("\t\t\t\t╚════════════════════════════════════════╝");
						System.out.print("> ");	
						eleccionRespuesta = input.nextInt();		        				
        				} catch (InputMismatchException e) {
        				System.out.println("");
        				System.out.println("");
        				System.out.println("");
        				System.out.println("\t\t\t\t/////////////////////////////////////////");
            			System.out.println("\t\t\t\t║¡Cuidado, sólo puedes insertar números!║");
            			System.out.println("\t\t\t\t/////////////////////////////////////////");
						System.out.println("");
						System.out.println("");
						input.next();
            			continuar = true; 
            			}
		   			} while (continuar);	   		
			} while (!(eleccionRespuesta==2));

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t╔═════════════════════════════════════════╗");
    	System.out.println("\t\t\t\t║  Enhorabuena! ¡Que tengas un buen día!  ║");
    	System.out.println("\t\t\t\t╚═════════════════════════════════════════╝");
    	System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
System.out.println("\t\t//////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("\t\t///////        /////       //////////  ///////////         ///////////           /////////");
System.out.println("\t\t/////  //////// ////  /////  ////////  //////////  ///////  /////////  /////////   ///////");
System.out.println("\t\t/////  ////////  ///  //////  ///////  /////////  /////////  ///////  ///////////  ///////");
System.out.println("\t\t/////  ////////  ///  ///////  //////  ////////  //////////   //////  ////////////////////");
System.out.println("\t\t/////  ////////  ///  ///////  //////  ///////  ////////////  ///////   //////////////////");
System.out.println("\t\t/////  ////////  ///  ///////  //////  ///////  ////////////  /////////   ////////////////");
System.out.println("\t\t/////            ///  ///////  //////  ///////  ////////////  ///////////   //////////////");
System.out.println("\t\t/////  ////////  ///  ///////  //////  ///////  ////////////  //////////////   ///////////");
System.out.println("\t\t/////  ////////  ///  ///////  //////  ///////  ////////////  /////////////////   ////////");
System.out.println("\t\t/////  ////////  ///  ///////  //////  ////////  //////////  ///////////////////   ///////");
System.out.println("\t\t/////  ////////  ///  ///////  //////  ////////  //////////  ///////   ///////////  //////");
System.out.println("\t\t/////  ////////  ///  //////  ///////  /////////  ////////  /////////   //////////  //////");
System.out.println("\t\t/////  ////////  ///  ////  /////////  //////////  //////  ///////////   ///////  ////////");
System.out.println("\t\t/////  ////////  ///      ///////////  ///////////        //////////////         /////////");
System.out.println("\t\t//////////////////////////////////////////////////////////////////////////////////////////");
	}
}