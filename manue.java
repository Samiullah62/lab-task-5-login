import java.util.*;
class manue{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 1 Welcome to our restaurant ");
        System.out.println(" 1 \ntwo large pizza and 1 cold drink :Rs 1000");
        System.out.println(" 2\n Three zinger burger and 1 cold drink: Rs 900");
        System.out.println(" 3\n Two chicken roll:Rs 500");
        System.out.println("select your choice :");
        int choice  = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("two large pizza and 1 cold drink:Rs1000");
                break;
            case 2:
                System.out.println("three zinger burger 1 cold drink:Rs 900");
                break;
            case 3:
                System.out.println("two chicken roll:Rs 500");
                break;
            default:
                System.out.println("Sorry this item we dont have");
                break;
        }
    }
}