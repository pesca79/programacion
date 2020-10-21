/*
1- Write a program AllEqual.java that takes three integer command-line arguments and prints equal if all three are equal, 
and not equal otherwise.
*/
import static java.lang.System.*;
import java.util.Scanner;

public class AllEqual { 
    public static void main(String[] args) { 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a==b && a==c) {
            out.println("equal");
        } else {
            out.println("not equal");
        }
}
}
