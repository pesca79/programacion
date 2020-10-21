
/*
2- Write a program DistinctValues.java that takes three integer command-line arguments a, b, and c and print the number of 
distinct values (1, 2, or 3) among a, b, and c.*/
import static java.lang.System.*;
import java.util.Scanner;

public class DistinctValues { 
    public static void main(String[] args) { 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a==b && a==c) {
            out.println(1);
        } else if ((a==b && a!=c) || (a==c && a!=b) || (a==b && a!=c)  || (b==c && b!=a)) {
            out.println(2);
        }
        else {
        	out.println(3);	
        }
}
}