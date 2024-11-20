import java.util.Scanner;

public class firstjava{
  
     public void GetPerson(){
      /*  Scanner myscn = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = myscn.nextLine(); 
        System.out.println("What is your last name?");
        String lastName = myscn.nextLine(); 
        System.out.println("What is your street  address?");
       String  addressStreet = myscn.nextLine(); 
        System.out.print("City : ");
      String  addressCity = myscn.nextLine(); 
        System.out.print("\nState : ");
        String addressState = myscn.nextLine(); 
        System.out.print("\nPostal Code : ");
        String addressPostalCode = myscn.nextLine(); 
        System.out.println("Successfully created user profile.");
        myscn.close();*/
         System.out.println(firstName + "/n" + lastName + "/n" + addressStreet + "/n" + addressCity + "/n" + addressState + "/n" + addressPostalCode);
     } 
 }
    
public static class main {
    firstjava person; 
    person.GetPerson();
}