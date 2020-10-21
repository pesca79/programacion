public class IntOps { 

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum  = a + b;
        int prod = a * b;
	if (b ==0 ) {
        System.out.println("Division por cero");
}	
else {
	System.out.println(a / b);        
     }
  }
}

