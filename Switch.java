import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        n = sc.nextInt();

        switch(n)
        {
            case 1: 
                // System.out.println("Monday");
                // break;
            case 2: 
                System.out.println("Tuesday");
                // break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid choice!!");


        }
    }
}

/*

1. Make one calculator using switch case.

a
b

+ : "Add"
-
*
/
%



 */