import java.util.Scanner ;
class Vowelcon
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String a=s.next();
if((a=="a")||(a=="e")||(a=="i")||(a=="o")||(a=="u"))
{
System.out.println("\nThe given character "+a+" is VOWEL");
}
else
{
System.out.println("\nThe given character "+a+" is CONSONANT");
}}}