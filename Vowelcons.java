import java.util.*;

public class Vowelcons {

static void vowel_consonant(char ch){
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
System.out.println("Vowel");
}
else{
System.out.println("Consonant");
}
}
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter character : ");
char ch = sc.next().charAt(0);
vowel_consonant(ch);
}
}


/*
OUTPUT:
--------
F:\SHREYA\JAVA>javac Vowelcons.java

F:\SHREYA\JAVA>java Vowelcons
Enter character :
A
Vowel
*/