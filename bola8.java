import java.util.Scanner;  // added to allow keyboard input
class bola8 {
  public static void main(String[] args) {
     // Tell the user to enter a question
     Scanner scan = new Scanner(System.in);
     System.out.println("Bienvenido a Magic Ball 8!!");
     System.out.print("Escribe tu pregunta y te la contestaré: ");
     String question = scan.nextLine();
     // Get a random number from 1 to 8
     double a = Math.random()*8;
     // Use if statements to print out 1 of 8 responses
     if (a>=0 & a<1){
     System.out.println("No lo sé, lo siento......     :(");
     }
     if (a>=1 & a<2){
     System.out.println("Eso tan solo depende de tí");
     }
     if (a>=2 & a<3){
     System.out.println("La respuesta está en tu habitación....");
     }
     if (a>=3 & a<4){
     System.out.println("Si haces las cosas bien, encontrarás lo que buscas..");
     }
     if (a>=4 & a<5){
     System.out.println("Depende de lo que quieras encontrar..");
     }
     if (a>=5 & a<6){
     System.out.println("No sé para qué me preguntas eso, pero la respuesta la tienes tú");
     }
     if (a>=6 & a<7){
     System.out.println("Sin comentarios.....");
     }
     if (a>=7 & a<8){
     System.out.println("¡Vaya preguntas me haces!");
     }                           
   }
}
