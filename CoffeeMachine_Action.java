import java.util.*;
public class CoffeeMachine_Action {
		static int qty_cash_available = 550;
		static int ml_water_available = 400;	
		static int ml_milk_available = 540;			
		static int g_coffee_available = 120;
		static int d_cups_available = 9;		

		static int cup_expreso = 0;
		static int cup_leche = 0;
		static int cup_capuccino = 0;

		static int cash_expreso = cup_expreso *4;
		static int ml_water_expreso = cup_expreso *200;	
		static int ml_milk_expreso = cup_expreso *50;
		static int g_coffee_expreso = cup_expreso *15;  

		static int cash_leche = cup_leche *7;
		static int ml_water_leche = cup_leche *350;	
		static int ml_milk_leche = cup_leche *75;
		static int g_coffee_leche = cup_leche *20;

		static int cash_capuccino = cup_capuccino *6;
		static int ml_water_capuccino = cup_capuccino *200;	
		static int ml_milk_capuccino = cup_capuccino *100;
		static int g_coffee_capuccino = cup_capuccino *12;

        static String opcion = "";
        static String opcioncafe = "";        
        static Scanner eleccion = new Scanner(System.in);
        static Scanner eleccionReposicion = new Scanner(System.in);
        static Scanner cafe = new Scanner(System.in);
        static Scanner reposicion = new Scanner(System.in);
        static Scanner password_recaudacion= new Scanner(System.in);
        static Scanner recaudacion = new Scanner(System.in);





public static void main(String[] args) {     		
		eleccion = new Scanner(System.in);
		menuPrincipal();		
    }
public static void menuPrincipal() {
//At the moment, the coffee machine has $550, 400 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable cups.		
		System.out.println("═══════════════════════════════════════════════════════════");
		System.out.println("  Actualmente, la máquina dispone de:                      ");
		System.out.println("  "+ml_water_available+" ml. de agua                       ");
		System.out.println("  "+ml_milk_available+ " ml. de leche                      ");
		System.out.println("  "+g_coffee_available+" g. de café                        ");
		System.out.println("  "+d_cups_available+" vasos desechables                   ");
		System.out.println("═══════════════════════════════════════════════════════════");
		System.out.println("╔═════════════════════════════════════════════════════════╗");
		System.out.println("║              ¿QUÉ TAREA QUIERE REALIZAR?                ║");
		System.out.println("║═════════════════════════════════════════════════════════║");
		System.out.println("║ 1.-  COMPRAR CAFÉ        ------  ESCRIBIR \"buy\"         ║");
		System.out.println("║ 2.-  REPONER MÁQUINA     ------  ESCRIBIR \"fill\"        ║");
		System.out.println("║ 3.-  RECOGER RECAUDACIÓN ------  ESCRIBIR \"take\"        ║");
		System.out.println("║ 4.-  SALIR               ------  ESCRIBIR \"exit\"        ║");
		System.out.println("╚═════════════════════════════════════════════════════════╝");
		System.out.println("Por favor, elija una opción:");
		System.out.print("> ");        
		opcion = eleccion.next().toLowerCase();			 		
		 while (!(opcion.equals("buy") || opcion.equals("fill") || opcion.equals("take") || opcion.equals("exit"))){
		System.out.println("");            
      	System.out.println("Opción no válida! Elija entre \"buy\", \"fill\", \"take\", o \"exit\"");
      	System.out.print("> ");
		opcion = eleccion.next().toLowerCase();
		 } 			
			switch(opcion){	
       				case "buy":
       								menuComprar();
       								break;
       				case "fill":
       								menuReponer();
       								break;
       				case "take":
       								menuRecaudar();
       								break;
       				case "exit":      
       								menuSalida();
       								break;
	}
}

	public static void arrancarMaquina() {
		System.out.println("╔═════════════════════════════════════════════════════════╗");		
		for(int i = 1; i > 0; i--) {			
		System.out.println("║          Arrancando la máquina de café                  ║");
		System.out.println("║                                                         ║");		
								try {
                					Thread.sleep(4000);
            						} catch (InterruptedException e) {
                						e.printStackTrace();
            						}
        						}
		for(int i = 1; i > 0; i--) {			
		System.out.println("║           Moliendo los granos de café                   ║");
		System.out.println("║                                                         ║");		
								try {
                					Thread.sleep(2000);
            						} catch (InterruptedException e) {
                						e.printStackTrace();
            						}
        						}        						
		for(int i = 1; i > 0; i--) {			
		System.out.println("║                 Hirviendo el agua                       ║");
		System.out.println("║                                                         ║");		
								try {
                					Thread.sleep(3000);
            						} catch (InterruptedException e) {
                						e.printStackTrace();
            						}
        						}
		for(int i = 1; i > 0; i--) {			
		System.out.println("║     Mezclando agua hervida con los granos de café       ║");
		System.out.println("║                                                         ║");		
								try {
                					Thread.sleep(1000);
            						} catch (InterruptedException e) {
                						e.printStackTrace();
            						}
        						}        						        						        						
		for(int i = 1; i > 0; i--) {			
		System.out.println("║            Vertiendo el café en la taza                 ║");
		System.out.println("║                                                         ║");		
								try {
                					Thread.sleep(1000);
            						} catch (InterruptedException e) {
                						e.printStackTrace();
            						}
        						}
		System.out.println("╚═════════════════════════════════════════════════════════╝");        						
        					}
	public static void menuComprar() {
		System.out.println("");
		System.out.println("╔═════════════════════════════════════════════════════════╗");
		System.out.println("║                SISTEMA DE VENTA DE CAFÉ                 ║");
		System.out.println("║---------------------------------------------------------║");				
		System.out.println("║                POR FAVOR, ELIJA SU CAFÉ                 ║");		
		System.out.println("║═════════════════════════════════════════════════════════║");
		System.out.println("║ 1.-  CAFÉ EXPRESO    -----  ESCRIBIR \"expreso\"          ║");
		System.out.println("║ 2.-  CAFÉ CON LECHE  -----  ESCRIBIR \"leche\"            ║");
		System.out.println("║ 3.-  CAFÉ CAPUCCINO  -----  ESCRIBIR \"capuccino\"        ║");
		System.out.println("║ 4.-  VOLVER          -----  ESCRIBIR \"volver\"           ║");
		System.out.println("╚═════════════════════════════════════════════════════════╝");
		System.out.println("Por favor, elija una opción:");
		System.out.print("> ");		
		opcioncafe = cafe.next().toLowerCase();
		while (!(opcioncafe.equals("expreso") || opcioncafe.equals("leche") || opcioncafe.equals("capuccino") || opcioncafe.equals("volver"))){ 
            System.out.println("");            
            System.out.println("Café no válido! Elija entre \"expreso\", \"leche\", \"capuccino\" o \"volver\"");
            System.out.print("> ");
            opcioncafe = cafe.next().toLowerCase();
        } 
     			switch(opcioncafe){	
       				case "expreso": 
/*        ___________________________________________________________________________________________________
|For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.|
---------------------------------------------------------------------------------------------------*/
							System.out.println("");
							System.out.println("╔═════════════════════════════════════════════════════════╗");
							System.out.println("║Para preparar 1 taza de café expreso se necesitan:       ║");
							System.out.println("║1 vaso,                                                  ║");
							System.out.println("║4 $,                                                     ║");
							System.out.println("║250 ml. de agua,                                         ║");
							System.out.println("║y 16 gr. de café.                                        ║");
							System.out.println("╚═════════════════════════════════════════════════════════╝");							
							System.out.println("");
							System.out.println("═══════════════════════════════════════════════════════════");							
							System.out.println(" Y dispongo de "+d_cups_available+" vaso/s,                ");
							System.out.println(" "+ml_water_available+" ml. de agua,                       ");
							System.out.println(" "+ml_milk_available+"  ml. de leche,                      ");
							System.out.println(" y "+g_coffee_available+" gr. de café.                     ");
							System.out.println("═══════════════════════════════════════════════════════════");							
							System.out.println("");
							System.out.println("Para preparar "+cup_expreso+" taza/s de café expreso se necesita:");
							System.out.println(+cup_expreso+" vaso/s,");
							System.out.println(+cup_expreso*4+" $,");
							System.out.println(+cup_expreso*250+" ml. de agua,");
							System.out.println("y "+cup_expreso*16+" gr. de café.");
							System.out.println("");							        									
        					System.out.println("Por favor, dime, ¿cuántas tazas de café expreso necesitas?");
    						System.out.print("> ");
    						Scanner inputexpreso = new Scanner(System.in);
    						int cup_expreso = 0;
				        	boolean continuar;
		        				do {
        							try {
        							continuar = false;									
            						cup_expreso = inputexpreso.nextInt();        								
        							} catch (InputMismatchException e) {
            						System.out.println("");		
            						System.out.println("Debe ingresar obligatoriamente un número entero.");  
            						System.out.println("");
            						System.out.print("> ");         				            									
            						inputexpreso.next(); 
            						continuar = true;
        							}
        						} while (continuar);  
									if (cup_expreso<=0){
									System.out.println("Por favor, elija un número mayor que 0");
									continuar = false;
									menuComprar();
									break;									
									} else if ((ml_water_available<cup_expreso*250) || (g_coffee_available<cup_expreso*16) || (d_cups_available<cup_expreso)){ 
									System.out.println("Lo siento, pero no tengo bastante cantidad de ingredientes para preparar "+cup_expreso+" tazas de café expreso:( ");																					
									menuComprar();
									break;									
									} else {
							System.out.println("Es para mí un orgullo y una satisfacción comunicarle que SÍ\n                 podrá tomar un café expreso ahora");
							System.out.println("-----------------------------------------------------------");
							arrancarMaquina();	
							System.out.println("╔═════════════════════════════════════════════════════════╗");
							System.out.println("║                PREPARANDO SU CAFÉ EXPRESO               ║");
							System.out.println("║                                                         ║");
								for(int i = 3; i > 0; i--) {			
								System.out.println("║	  	     Quedan "+i+" segundos...                 ║");
								try {
                					Thread.sleep(1000);
            						} catch (InterruptedException e) {
                						e.printStackTrace();
            						}
        						}
							System.out.println("║                                                         ║");
							System.out.println("║                    CAFÉ PREPARADO!!!!                   ║");
							System.out.println("╚═════════════════════════════════════════════════════════╝");        
							System.out.println("");
							ml_water_available = ml_water_available - cup_expreso*250;
							g_coffee_available = g_coffee_available - cup_expreso*16;
							d_cups_available = d_cups_available - cup_expreso;
							qty_cash_available = qty_cash_available +  cup_expreso*4;
							System.out.println("═══════════════════════════════════════════════════════════");
							System.out.println("  Ahora quedan "+ml_water_available+" ml. de agua.");
							System.out.println("  Ahora quedan "+ml_milk_available+" ml. de leche.");
							System.out.println("  Ahora quedan "+g_coffee_available+" gr. de café.");
							System.out.println("  Ahora quedan "+d_cups_available+"   vasos.");
							System.out.println("═══════════════════════════════════════════════════════════");
							menuComprar();
							break;							
							}																		
        			case "leche":
/*________________________________________________________________________________________________________________
|For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.|
----------------------------------------------------------------------------------------------------------------*/        			
							System.out.println("");
							System.out.println("╔═════════════════════════════════════════════════════════╗");
							System.out.println("║Para preparar 1 taza de café con leche se necesitan:     ║");
							System.out.println("║1 vaso,                                                  ║");
							System.out.println("║7 $,                                                     ║");
							System.out.println("║350 ml. de agua,                                         ║");
							System.out.println("║75 ml. de leche                                          ║");
							System.out.println("║y 20 gr. de café.                                        ║");
							System.out.println("╚═════════════════════════════════════════════════════════╝");							
							System.out.println("");
							System.out.println("═══════════════════════════════════════════════════════════");							
							System.out.println(" Y dispongo de "+d_cups_available+" vaso/s,                ");
							System.out.println(" "+ml_water_available+" ml. de agua,                       ");
							System.out.println(" "+ml_milk_available+"  ml. de leche                       ");
							System.out.println(" y "+g_coffee_available+" gr. de café.                     ");
							System.out.println("═══════════════════════════════════════════════════════════");							
							System.out.println("");
							Scanner input_leche = new Scanner(System.in);
    						System.out.println("Por favor, dime, ¿cuántas tazas de café con leche necesitas?");
    						System.out.print("> ");


    						if (input_leche.hasNextInt()) {
							cup_leche = input_leche.nextInt();	
							System.out.println("Para preparar "+cup_leche+" taza/s de café con leche se necesita:");
							System.out.println(cup_leche+" vaso/s,");
							System.out.println(cup_leche*7+" $,");
							System.out.println(cup_leche*350+" ml. de agua,");
							System.out.println(cup_leche*75+" ml. de leche,");
							System.out.println("y "+cup_leche*20+" gr. de café.");
							System.out.println("");	
							if ((ml_water_available<cup_leche*350) || (ml_milk_available<cup_leche*75) || (g_coffee_available<cup_leche*20) || (d_cups_available<cup_leche)){ 
							System.out.println("Lo siento, pero no tengo bastante cantidad de ingredientes para preparar "+cup_leche+" tazas de café :( ");
							menuComprar();
							break;
							} else if (cup_leche<=0){
									System.out.println("Por favor, elija un número mayor que 0");
									menuComprar();
									break;
							} else {
							System.out.println("Es para mí un orgullo y una satisfacción comunicarle que SÍ\n                podrá tomar café con leche ahora");
							System.out.println("-----------------------------------------------------------");	
							arrancarMaquina();							
							System.out.println("╔═════════════════════════════════════════════════════════╗");
							System.out.println("║               PREPARANDO SU CAFÉ CON LECHE              ║");
							System.out.println("║                                                         ║");
								for(int i = 3; i > 0; i--) {			
								System.out.println("║		     Quedan "+i+" segundos...                 ║");
								try {
                					Thread.sleep(1000);
            						} catch (InterruptedException e) {
                						e.printStackTrace();
            						}
        						}
							System.out.println("║                                                         ║");
							System.out.println("║                    CAFÉ PREPARADO!!!!                   ║");
							System.out.println("╚═════════════════════════════════════════════════════════╝");        
							System.out.println("");
							ml_water_available = ml_water_available - cup_leche*350;
							ml_milk_available = ml_milk_available - cup_leche*75;
							g_coffee_available = g_coffee_available - cup_leche*20;
							d_cups_available = d_cups_available - cup_leche;
							qty_cash_available = qty_cash_available + cup_leche*7;
							System.out.println("═══════════════════════════════════════════════════════════");
							System.out.println("  Ahora quedan "+ml_water_available+" ml. de agua.");
							System.out.println("  Ahora quedan "+ml_milk_available+" ml. de leche.");
							System.out.println("  Ahora quedan "+g_coffee_available+" gr. de café.");
							System.out.println("  Ahora quedan "+d_cups_available+"   vasos.");
							System.out.println("═══════════════════════════════════════════════════════════");
							menuComprar();
							break;
							}
							} else {
								System.out.println("Por favor, teclee un número entero");
   								menuComprar();							
   								break;
							}												
       				case "capuccino":
/*__________________________________________________________________________________________________________________________
|And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.|
--------------------------------------------------------------------------------------------------------------------------*/       				
							System.out.println("");
							System.out.println("╔═════════════════════════════════════════════════════════╗");
							System.out.println("║Para preparar 1 taza de café capuccino se necesitan:     ║");
							System.out.println("║1 vaso,                                                  ║");
							System.out.println("║6 $,                                                     ║");
							System.out.println("║200 ml. de agua,                                         ║");
							System.out.println("║100 ml. de leche                                         ║");
							System.out.println("║y 12 gr. de café.                                        ║");
							System.out.println("╚═════════════════════════════════════════════════════════╝");							
							System.out.println("");
							System.out.println("═══════════════════════════════════════════════════════════");							
							System.out.println(" Y dispongo de "+d_cups_available+" vaso/s,                ");
							System.out.println(" "+ml_water_available+" ml. de agua,                       ");
							System.out.println(" "+ml_milk_available+" ml. de leche                        ");
							System.out.println(" y "+g_coffee_available+" gr. de café.                     ");
							System.out.println("═══════════════════════════════════════════════════════════");							
							System.out.println("");
       						Scanner input_capuccino = new Scanner(System.in);
    						System.out.println("Por favor, dime, ¿cuántas tazas de café capuccino necesitas?");	
    						System.out.print("> ");


    						if (input_capuccino.hasNextInt()) {    						
    						cup_capuccino = input_capuccino.nextInt();																
							System.out.println("Para preparar "+cup_capuccino+" taza/s de café capuccino se necesita:");
							System.out.println(+cup_capuccino+" vaso/s,");
							System.out.println(+cup_capuccino*6+" $,");
							System.out.println(+cup_capuccino*200+" ml. de agua,");
							System.out.println(+cup_capuccino*100+" ml. de leche,");
							System.out.println("y "+cup_capuccino*12+" gr. de café.");
							System.out.println("");	
							if ((ml_water_available<cup_capuccino*200) || (ml_milk_available<cup_capuccino*100) || (g_coffee_available<cup_capuccino*12) || (d_cups_available<cup_capuccino)){ 
							System.out.println("Lo siento, pero no tengo bastante cantidad de ingredientes para preparar "+cup_capuccino+" tazas de café capuccino :( ");
							menuComprar();
							break;
							} else if (cup_capuccino<=0){
									System.out.println("Por favor, elija un número mayor que 0");
									menuComprar();
									break;							
							} else {
							System.out.println("Es para mí un orgullo y una satisfacción comunicarle que SÍ\n                podrá tomar café capuccino ahora");
							System.out.println("-----------------------------------------------------------");	
							arrancarMaquina();							
							System.out.println("╔═════════════════════════════════════════════════════════╗");
							System.out.println("║              PREPARANDO SU CAFÉ CAPUCCINO               ║");
							System.out.println("║                                                         ║");
								for(int i = 3; i > 0; i--) {			
								System.out.println("║		     Quedan "+i+" segundos...                 ║");
									try {
                					Thread.sleep(1000);
            						} catch (InterruptedException e) {
                						e.printStackTrace();
            						}
        						}
							System.out.println("║                                                         ║");
							System.out.println("║                    CAFÉ PREPARADO!!!!                   ║");
							System.out.println("╚═════════════════════════════════════════════════════════╝");        
							System.out.println("");
							ml_water_available = ml_water_available - cup_capuccino*200;
							ml_milk_available = ml_milk_available - cup_capuccino*100;
							g_coffee_available = g_coffee_available - cup_capuccino*12;
							d_cups_available = d_cups_available - cup_capuccino;
							qty_cash_available = qty_cash_available + cup_capuccino*6;
							System.out.println("═══════════════════════════════════════════════════════════");
							System.out.println("  Ahora quedan "+ml_water_available+" ml. de agua.");
							System.out.println("  Ahora quedan "+ml_milk_available+" ml. de leche.");
							System.out.println("  Ahora quedan "+g_coffee_available+" gr. de café.");
							System.out.println("  Ahora quedan "+d_cups_available+"   vasos.");
							System.out.println("═══════════════════════════════════════════════════════════");
							menuComprar();
							break;
							}
							} else {
								System.out.println("Por favor, teclee un número entero");
   								menuComprar();							
   								break;
							}						
				    case "volver":
				    		System.out.println("");
							System.out.println("");
				    		menuPrincipal();
							}
						}
public static void menuReponer() {
							System.out.println("");
							System.out.println("");
 									System.out.println("╔═════════════════════════════════════════════════════════════════╗");
									System.out.println("║                   ENTRANDO EN MODO DE REPOSICIÓN                ║");
									System.out.println("╚═════════════════════════════════════════════════════════════════╝");        
							String clave ="service";
							Scanner password= new Scanner(System.in);
 									System.out.println("╔═════════════════════════════════════════════════════════════════╗");
									System.out.println("║          INTRODUZCA CONTRASEÑA PARA REPOSICIÓN(service)         ║");
									System.out.println("╚═════════════════════════════════════════════════════════════════╝");
							System.out.println("");
							System.out.print("> ");
							String reposicion_pass = password.next();
								while (!(reposicion_pass.equals("service"))){
									System.out.println("╔═════════════════════════════════════════════════════════════════╗");
									System.out.println("║  LA CONTRASEÑA ES INCORRECTA. INTRODUZCA LA CONTRASEÑA CORRECTA ║ ");
									System.out.println("╚═════════════════════════════════════════════════════════════════╝");
									reposicion_pass = password.next();
								}
									System.out.println("╔═════════════════════════════════════════════════════════════════╗");
									System.out.println("║      CONTRASEÑA CORRECTA! ENTRANDO EN MODO REPOSICIÓN EN..      ║"); 
									System.out.println("║                                                                 ║");
								for(int i = 3; i > 0; i--) {			
									System.out.println("║                        "  +i+" segundos...                            ║");
								try {
                					Thread.sleep(1000);
            						} catch (InterruptedException e) {
                						e.printStackTrace();
            						}

									System.out.println("╚═════════════════════════════════════════════════════════════════╝");
        						}
 									menuReposicionLogueado(); 									
									}
public static void menuRecaudar() {
									System.out.println("╔═════════════════════════════════════════════════════════════════╗");
									System.out.println("║                   ENTRANDO EN MODO DE RECAUDACIÓN               ║");
									System.out.println("╚═════════════════════════════════════════════════════════════════╝");       
							String claverepo ="service";							
									System.out.println("╔═════════════════════════════════════════════════════════════════╗");
									System.out.println("║        INTRODUZCA CONTRASEÑA PARA RECAUDACIÓN(recaudacion)      ║");
									System.out.println("╚═════════════════════════════════════════════════════════════════╝");
							System.out.println("");
							System.out.print("> ");
							String recaudacion_pass = password_recaudacion.next().toLowerCase();
								while (!(recaudacion_pass.equals("recaudacion"))){
									System.out.println("╔═════════════════════════════════════════════════════════════════╗");
									System.out.println("║  LA CONTRASEÑA ES INCORRECTA. INTRODUZCA LA CONTRASEÑA CORRECTA ║ ");
									System.out.println("╚═════════════════════════════════════════════════════════════════╝");
									recaudacion_pass = password_recaudacion.next();
								}
									System.out.println("╔═════════════════════════════════════════════════════════════════╗");
									System.out.println("║      CONTRASEÑA CORRECTA! ENTRANDO EN MODO RECAUDACIÓN EN..     ║"); 
									System.out.println("║                                                                 ║");
								for(int i = 3; i > 0; i--) {			
									System.out.println("║                        "  +i+" segundos...                            ║");
								try {
                					Thread.sleep(1000);
            						} catch (InterruptedException e) {
                						e.printStackTrace();
            						}
									System.out.println("╚═════════════════════════════════════════════════════════════════╝");
        						}
        							menuRecaudacionLogueado();       							
											}
public static void  menuRecaudacionLogueado() {
        							System.out.println("Actualmente hay "+qty_cash_available+" $ disponibles en la máquina.");
        							
										int eleccionRecaudacion = 0;
				        				boolean continuar;
		        						do {
        									try {
        									continuar = false;		
        									System.out.println("");	
        									System.out.println("¿Cuántos dólares va a llevarse ?:");
											System.out.print("> ");		
            								eleccionRecaudacion = recaudacion.nextInt();
        									} catch (InputMismatchException e) {
            								System.out.println("");		
            								System.out.println("Debe ingresar obligatoriamente un número entero.");           				
            								System.out.println("");			
            								recaudacion.next(); 
            								continuar = true;
        									}
        								} while (continuar);         							
													if (eleccionRecaudacion<=0) {
														System.out.println("¡¡Pero chiquillo, llévate algo!!");
														System.out.println("");	
														menuRecaudacionLogueado();
														}
													else if (eleccionRecaudacion>qty_cash_available){
														System.out.println("Lo siento, pero no puedes sacar más dinero del que hay");
														System.out.println("");	
														menuRecaudacionLogueado();
														}
													else if ((qty_cash_available-eleccionRecaudacion<100)){
														System.out.println("Lo siento, pero no puedes dejar menos de 100 $ en la máquina, necesito cambio");
														System.out.println("");	
														menuRecaudacionLogueado();
													}
													else {
														qty_cash_available = qty_cash_available - eleccionRecaudacion;
														System.out.println("Has recaudado "+eleccionRecaudacion+" $");
														System.out.println("");	
														System.out.println("Ahora hay "+qty_cash_available+" $ en la máquina");
														System.out.println("");	
														menuPrincipal();
												}
}					
public static void  menuReposicionLogueado() {
							System.out.println("╔═════════════════════════════════════════════════════════════════╗");
							System.out.println("║                            ¿QUÉ VA A REPONER?                   ║");
							System.out.println("║-----------------------------------------------------------------║");
							System.out.println("║ 1.- AGUA    (elegir \"1\")                                        ║");
							System.out.println("║ 2.- LECHE   (elegir \"2\")                                        ║");
							System.out.println("║ 3.- CAFÉ    (elegir \"3\")                                        ║");
							System.out.println("║ 4.- VASOS   (elegir \"4\")                                        ║");
							System.out.println("║ 5.- VOLVER  (elegir \"5\")                                        ║");
							System.out.println("╚═════════════════════════════════════════════════════════════════╝");        											

				        	int eleccionReposicion=0;
				        	boolean continuar;
        						do {
        							try {
        						continuar = false;		
        						System.out.println("");	
        						System.out.println("Por favor, elija una opción entre 1 y 5 :");
								System.out.print("> ");		
            					eleccionReposicion = reposicion.nextInt(); 
        						} catch (InputMismatchException e) {
            					System.out.println("");		
            					System.out.println("Debe ingresar obligatoriamente un número entero.");           				
            					System.out.println("");			
            					reposicion.next(); 
            					continuar = true;
        						}
        						} while (continuar); 
									switch (eleccionReposicion) {
										case 1:
												addAgua();
												break;
										case 2:
												addLeche();
												break;
										case 3:
												addCafe();
												break;
										case 4:
												addVasos();
												break;
										case 5:
												menuPrincipal();
												break;												
										default:
												System.out.println("Error: valor no válido. ");												
												menuReposicionLogueado();
												break;
												}							
								}
															
public static void  addAgua() {												
									Scanner agua = new Scanner(System.in);
									int eleccionAgua=0;
				        			boolean continuar;
        								do {
        									try {
		        							continuar = false;		
	        								System.out.println("");	
        									System.out.println("¿Cuánta agua vas a añadir (en ml.)?:");
											System.out.print("> ");
            								eleccionAgua = agua.nextInt();
        									} catch (InputMismatchException e) {
            								System.out.println("");		
            								System.out.println("Debe ingresar obligatoriamente un número entero.");
            								System.out.println("");			
            								agua.next(); 
            								continuar = true;
        									}
        								} while (continuar); 


        							ml_water_available = ml_water_available + eleccionAgua;
									System.out.println("Has añadido "+eleccionAgua+" ml. de agua");
									System.out.println("Ahora hay "+ml_water_available+" ml. de agua");
									menuReposicionLogueado();
}
public static void  addLeche() {
									Scanner leche = new Scanner(System.in);
									int eleccionLeche = 0;
									boolean continuar;
										do {
        									try {
		        							continuar = false;		
	        								System.out.println("");		        								       									
											System.out.println("¿Cuánta leche vas a añadir (en ml.)?:");
											System.out.print("> ");												
											eleccionLeche = leche.nextInt();												
											} catch (InputMismatchException e) {
            								System.out.println("");		
            								System.out.println("Debe ingresar obligatoriamente un número entero.");           				
            								System.out.println("");	
            								leche.next();			
            								continuar = true;						
            								}
            							} while (continuar); 
									ml_milk_available = ml_milk_available + eleccionLeche;
									System.out.println("Has añadido "+eleccionLeche+" ml. de leche");
									System.out.println("Ahora hay "+ml_milk_available+" ml. de agua");												
									menuReposicionLogueado();
}
public static void  addCafe() {
									Scanner coffee = new Scanner(System.in);											
									int eleccionCafe = 0;
									boolean continuar;
										do {
        									try {
		        							continuar = false;												
		        							System.out.println("");
											System.out.println("¿Cuánto café vas a añadir (en gr.)?:");
											System.out.print("> ");											
											eleccionCafe = coffee.nextInt(); 
											} catch (InputMismatchException e) {
            								System.out.println("");		
            								System.out.println("Debe ingresar obligatoriamente un número entero.");           				
            								System.out.println("");	
            								coffee.next();			
            								continuar = true;
            								}
            							} while (continuar);             																			
									g_coffee_available = g_coffee_available + eleccionCafe;
									System.out.println("Has añadido "+eleccionCafe+" gr. de café");
									System.out.println("Ahora hay "+g_coffee_available+" gr. de café");
									menuReposicionLogueado();
}
public static void  addVasos() {
									Scanner vasos = new Scanner(System.in);
									int eleccionVasos = 0;
									boolean continuar;
										do {
        									try {
		        							continuar = false;												
		        							System.out.println("");									
											System.out.println("¿Cuántos vasos vas a añadir (en unidades)?:");
											System.out.print("> ");
											eleccionVasos = vasos.nextInt(); 
											} catch (InputMismatchException e) {
            								System.out.println("");		
            								System.out.println("Debe ingresar obligatoriamente un número entero.");           				
            								System.out.println("");	
            								vasos.next();
            								continuar = true;
            								}
            							} while (continuar);             																						
									d_cups_available = d_cups_available + eleccionVasos;
									System.out.println("Has añadido "+eleccionVasos+" vasos desechables");
									System.out.println("Ahora hay "+d_cups_available+" vasos desechables");
									menuReposicionLogueado();
}
public static void menuSalida() {
		System.out.println("╔════════════════════════════════════════════════════╗");
		System.out.println("║       GRACIAS POR SU VISITA. HASTA PRONTO!!        ║");
		System.out.println("╚════════════════════════════════════════════════════╝");
				}
}