import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\n\n Estas en una isla rodeado de agua.\n Hay un camino hacia el bosque al norte, hacia el mar al sur, y una cabania en la playa hacia el este.\n Hacia donde quierer ir? (n,e,s,o)?");
    String command = scan.nextLine();
    if (command.equals("n")) 
    {
        System.out.println("Te adentras en el bosque y escuchas un susurro. \nQuizas sean tigres o solamente monos. \n ");
    }
    
else if (command.equals("s")) 
    {
        System.out.println("Te acercas a la playa y ves que hay tiburones en el agua . \nQuizas ssean amistosos. Darse un chapuzon? \n ");
    }

else if (command.equals("e")) 
    {
        System.out.println("Te adentras en el bosque y escuchas un susurro. \nQuizas sean tigres o solamente monos. \n ");
    }


else if (command.equals("o")) 
    {
        System.out.println("Te adentras en el bosque y escuchas un susurro. \nQuizas sean tigres o solamente monos. \n ");
    }
    else {
        System.out.println("Opcion incorrecta. Lastima que no pudieras aventurarte");
    }
    // Add else-ifs for s, e, and an else for any other input. Be creative!
    
    
    System.out.println("Fin de la aventura!");   
    scan.close();
  }
}