import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
    //Create new scanner object.
     Scanner keyboard = new Scanner(System.in); 
       
     System.out.println("Welcome !");
     //Ask if anyone is Vegetarian
     System.out.println("Is anyone in your group Vegetarian? (yes or no):");
     String isVegetarian = keyboard.nextLine().toLowerCase();
    //Ask if anyone is Vegan
     System.out.println("Is there anyone in your group Vegan ? (yes or no) ");
    String isVegan = keyboard.nextLine().toLowerCase();
   //Ask if anyone is glutton-free
     System.out.println("Is anyone in your group glutton-fee?");
     String isGlutenFree = keyboard.nextLine().toLowerCase();

   //Display the restaurants the group can be taken to
     System.out.println("Here are your restaurant options:");

   //Group that needs to be taken to Downshift Diner
     if (isVegetarian.equals("no") && isVegan.equals("no") && isGlutenFree.equals("no"))
     System.out.println("Downshift Diner");
      //Group that needs to be taken to Bellacinas 
     if (isVegetarian.equals("no") && isGlutenFree.equals("no"))
     System.out.println("Bellacinas");
      //Group that needs to be taken to Portabella
     if(isVegan.equals("no")) 
     System.out.println("Portabella");
     //Accepts all groups of people
     System.out.println("The Railyard");
     System.out.println("Blue Spoon Cafe");
          
  
   }
}
