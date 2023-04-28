import java.util.Scanner;
public class Rupees11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rupees: ");
        int n = sc.nextInt();
        int n2000=0;
        int n500=0;
        int n200=0;
        int n100=0;
        int n50=0;
        int n10=0;
        int n1=0;


        if(n>2000)
        {
            n2000=n/2000;
            n= n%2000;
        }

        if(n>500)
        {
            n500 = n/500;
            n=n%500;
        }

        System.out.println("2000: "+ n2000);
        System.out.println("500: "+ n500);
    }
}
