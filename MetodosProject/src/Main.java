import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.print( "Enter your name: " );
        String name = console.next();
        System.out.print( "Enter your last name: " );
        String lastName = console.next();
        
        printNameCharacters( name );
        printNameLength( name );
        printFullName( name, lastName);
        console.close();
    }

    private static void printNameLength( String name )
    {
        System.out.println("your name has "+ name.length()+ " Characteres");   
    }//printNameLength

    private static void printNameCharacters( String name )
    {
    	
        for(int i =0;i<name.length(); i++) {
        	System.out.println(name.charAt(i));
        }
        System.out.println(" ");       
    }//printNAmeCharacters
    
    private static void printFullName( String name,  String lastname )
    {
    	String fullName= name + " " + lastname; 
    	char[] fullNameChars = fullName.toCharArray();
    	System.out.print("Your full name is: ");
    	
        for(char element : fullNameChars) {
        	System.out.print(element);
        }
        System.out.println(" ");   
    }//printFullName

}//class main

