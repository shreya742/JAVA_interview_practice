//UPPERCASE CHARACTERS, LOWERCASE CHARACTERS, NUMBERS, SPECIAL CHARACTERS

import java.util.*;

public class Typech {
public static void main(String[] args){
char ch;
Scanner sc = new Scanner(System.in);
ch = sc.next().charAt(0);
if(ch >= 65 && ch <= 90) {
System.out.println(ch + " is an UpperCase character.");
}
else if(ch >= 97 && ch <= 122){
System.out.println(ch + " is a LowerCase character.");
}
else if(ch >= 48 && ch <= 57){
System.out.println(ch + " is a Number.");
}
else {
System.out.println(ch + "is a Special character.");
}
}
}

/*
OUTPUT:
-------

F:\SHREYA\JAVA>javac Typech.java

F:\SHREYA\JAVA>java Typech
s
s is a LowerCase character.
*/