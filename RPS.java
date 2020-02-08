import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.InputMismatchException;

class RockPaperScissors{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Boolean r = true;
    Boolean p = true;
    Boolean s = true;
    Boolean con_check = false;
    String userChoice = "";
    String compChoice = "";
    double raw_num = (Math.random() * 2) + 1;
    int new_num = (int) raw_num;
    Boolean checker = false;
    String ans = "";
    Boolean RPS_check;
    System.out.println(new_num);
    //if(new_num == 1) compChoice = "Rock"
    //if(new_num == 2) compChoice = "Paper"
    //if(new_num == 3) compChoice = "Scissors"
for(int x = 1; x < 2; x++){
      do{
        System.out.println("Enter Rock, Paper, or Scissors()");
          userChoice = scan.nextLine();
          r = Pattern.matches("Rock",userChoice);
          p = Pattern.matches("Paper",userChoice);
          s = Pattern.matches("Scissors",userChoice);
        }while(p == false && r == false && s == false);
//Tie Situations
    if(r == true && new_num == 1){
      System.out.println("That was a tie!");
      try{
        System.out.println("Would you like to play again?(Y-yes, N-No) ");
          if(ans.equals("Y")){
            continue;
          }
          else if(ans.equals("N")){
            break;
        }
      }
      catch(InputMismatchException e){
        System.out.println("That input isnt valid");
      }

}
    if(p == true && new_num == 2){
      System.out.println("That was a tie!");
      do{
        System.out.println("Would you like to play again?(Y-yes, N-No) ");
        if(scan.hasNext("[YN]")){
          ans = scan.nextLine();
          if(ans.equals("Y")){
            continue;
          }
          else if(ans.equals("N")){
            break;
          }
          checker = false;
        }
        else{
          System.out.println("Not a valid input!");
          checker = true;
          scan.next();
        }
      }while(checker == true);
    }
    if(s == true && new_num == 3){
      System.out.println("That was a tie!");
      do{
        System.out.println("Would you like to play again?(Y-yes, N-No) ");
        if(scan.hasNext("[YN]")){
          ans = scan.nextLine();
          if(ans.equals("Y")){
            continue;
          }
          else if(ans.equals("N")){
            break;
          }
          checker = false;
        }
        else{
          System.out.println("Not a valid input!");
          checker = true;
          scan.next();
        }
      }while(checker == true);
    }
//Lose Situations
  if(r == true && new_num == 2){
    System.out.println("You lost! :(");
    do{
      System.out.println("Would you like to play again?(Y-yes, N-No) ");
      if(scan.hasNext("[YN]")){
        ans = scan.nextLine();
        if(ans.equals("Y")){
          continue;
        }
        else if(ans.equals("N")){
          break;
        }
        checker = false;
      }
      else{
        System.out.println("Not a valid input!");
        checker = true;
        scan.next();
      }
    }while(checker == true);
  }
  if(p == true && new_num == 3){
    System.out.println("You lost! :(");
    do{
      System.out.println("Would you like to play again?(Y-yes, N-No) ");
      if(scan.hasNext("[YN]")){
        ans = scan.nextLine();
        if(ans.equals("Y")){
          continue;
        }
        else if(ans.equals("N")){
          break;
        }
        checker = false;
      }
      else{
        System.out.println("Not a valid input!");
        checker = true;
        scan.next();
      }
    }while(checker == true);
  }
  if(s == true && new_num == 1){
    System.out.println("You lost! :(");
    do{
      System.out.println("Would you like to play again?(Y-yes, N-No) ");
      if(scan.hasNext("[YN]")){
        ans = scan.nextLine();
        if(ans.equals("Y")){
          continue;
        }
        else if(ans.equals("N")){
          break;
        }
        checker = false;
      }
      else{
        System.out.println("Not a valid input!");
        checker = true;
        scan.next();
      }
    }while(checker == true);
  }
//Win Situations
  if(r == true && new_num == 3){
    System.out.println("You Won! :)");
    do{
      System.out.println("Would you like to play again?(Y-yes, N-No) ");
      if(scan.hasNext("[YN]")){
        ans = scan.nextLine();
        if(ans.equals("Y")){
          continue;
        }
        else if(ans.equals("N")){
          break;
        }
        checker = false;
      }
      else{
        System.out.println("Not a valid input!");
        checker = true;
        scan.next();
      }
    }while(checker == true);
   }
  if(p == true && new_num == 1){
    System.out.println("You Won! :)");
    do{
      System.out.println("Would you like to play again?(Y-yes, N-No) ");
      if(scan.hasNext("[YN]")){
        ans = scan.nextLine();
        if(ans.equals("Y")){
          continue;
        }
        else if(ans.equals("N")){
          break;
        }
        checker = false;
      }
      else{
        System.out.println("Not a valid input!");
        checker = true;
        scan.next();
      }
    }while(checker == true);
  }
  if(s == true && new_num == 2){
    System.out.println("You Won! :)");
    do{
      System.out.println("Would you like to play again?(Y-yes, N-No) ");
      if(scan.hasNext("[YN]")){
        ans = scan.nextLine();
        if(ans.equals("Y")){
          continue;
        }
        else if(ans.equals("N")){
          break;
        }
        checker = false;
      }
      else{
        System.out.println("Not a valid input!");
        checker = true;
        scan.next();
      }
    }while(checker == true);
      }
    }//outloop
  }//main
}
