import java.util.Scanner;

public class main 
{

  public static void main(String[] args) 
  {
    /* Write your code here */ 
    Scanner input = new Scanner(System.in); 
      System.out.println("Welcome. What is your name?"); 
      String name = input.nextLine(); 
      System.out.println("Hello "+ name+". Are you ready to crack the code?");
      String bol = input.nextLine();  
      String yes = "yes"; 
      if(bol.equalsIgnoreCase(yes)){
        System.out.println(""); 
        System.out.println("PHASE 1"); 
        System.out.println("Enter a string:"); 
        String A = input.nextLine();
        if(A.length()==3){ 
          System.out.println("Correct!"); 
          System.out.println("");  
          System.out.println("PHASE 2"); 
          System.out.println("Enter a number:"); 
          int N = input.nextInt(); 
          if(N==19||(N>=35&&N<78)){ 
            System.out.println("Correct!"); 
            System.out.println("");
            System.out.println("PHASE 3"); 
            System.out.println("Enter a number:"); 
            int C = input.nextInt(); 
            if(C>0&&(C%2==0||C%10==1)){ 
              System.out.println("Correct!");
              System.out.println("You have cracked the code!");
            }
            else{
              System.out.println("Sorry, that was incorrect!");
              System.out.println("Better luck next time!");
            }
          }
          else{
            System.out.println("Sorry, that was incorrect!");
              System.out.println("Better luck next time!");
          } 
          
        }
        else{
          System.out.println("Sorry, that was incorrect!");
              System.out.println("Better luck next time!");
        }
        
      }
      
  }

}