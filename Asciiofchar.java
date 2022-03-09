//PROGRAM TO FIND THE ASCII VALUE OF A CHARACTER.

import java.util.*;

public class Asciiofchar {
public static void main(String[] args){
char ch;
Scanner sc = new Scanner(System.in);
ch = sc.next().charAt(0);
int ascii = (int) ch;
System.out.println("ASCII of " + ch + " is " + ascii);
}
}

/*
OUTPUT:
-------
F:\SHREYA\JAVA>javac Asciiofchar.java

F:\SHREYA\JAVA>java Asciiofchar
S
ASCII ofSis83
*/

