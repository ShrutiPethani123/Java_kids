import java.util.Scanner;
public class MaxArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter element: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print("a["+i+"]:");
            a[i]=sc.nextInt();
        }

        System.out.println("Array......");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        } 

        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        
        System.out.println("Max: "+max);
    }
    
}
