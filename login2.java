import java.util.*;
import java.io.*;
class login2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your email id: ");
      String email=sc.nextLine();
        System.out.println("Enter your password: ");
        String password=sc.nextLine();
        // get the object of console  class
        Console con=System.console();
        char[]chars=con .readPassword();

        String pass =new String(chars);

        if(email.equals("sami@gail.com")&& password.equals("sami123")){
            System.out.println("login successful ....");
            System.out.println("****** Wellcome screen ");
        }else{
            System.out.println("invalid user ID or password ! just try with another :");
        }
    }
}
