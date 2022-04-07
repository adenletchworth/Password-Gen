import java.util.Random;
import java.util.Scanner;
  public class pass{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("How long is your desired password");
    int size = sc.nextInt();
    while(size <= 0){
      System.out.println("Invalid Password Length: Please Input a Number Greater than 0");
      size = sc.nextInt();
    }
    System.out.println("Would you like include capitals? y/n");
    char c = sc.next().charAt(0);
    while(c != 'y' && c != 'n'){
      System.out.println("Invalid Input: y/n");
      c = sc.next().charAt(0);
    }
    boolean caseA = true;
    if(c == 'n') 
    caseA = false;
    System.out.println("This is your password " + passwordGenerator(size,caseA));
    sc.close();
    }

    final static char[] alph = {'a', 'b','c','b','d','e','f','g','h','i','j','k','l',
                        'm','n','o','p','q','r','s','t','u','v','w','x','y',
                        'z'};

    private static final Random random = new Random();








  private static int coinFlip(){return random.nextInt(2);} // returns value 0-1

  private static int randomNumber() {return random.nextInt(10);}

  private static char randomLetter(boolean caseA){
    if(caseA == true){
      if(coinFlip() == 0) return Character.toUpperCase(alph[random.nextInt(26)]);
    }
    return alph[random.nextInt(26)];
  }

  public static String passwordGenerator(int size, boolean caseA){
    String password = "";
    while(password.length() < size){
      if(coinFlip() == 0){
        password += randomNumber();
      }else{
        password += randomLetter(caseA);
      }
    }
    return password;
  }

}
