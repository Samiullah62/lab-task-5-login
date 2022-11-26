import java.util.*;
public class calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,choice;
        System.out.print("Please Enter your first number ");
        a=sc.nextInt();
        System.out.print("Please Enter your second number ");
        b= sc.nextInt();
        System.out.println("Please select your operation \n 1:add, \n 2: sub \n 3:mul \n divide  ");
        choice= sc.nextInt();
        switch(choice){
            case 1:
                c=a+b;
                System.out.print("Addition is "+c);
                break;
            case 2:
                c=a-b;
                System.out.print("subtraction  is "+c);
                break;

            case 3:
                c=a*b;
                System.out.print("multiple is "+c);
                break;
            case 4:
                c=a/b;
                System.out.print("divide is "+c);
                break;
            default:
                System.out.println("Invalid number ");
        }
    }
}