import java.util.Scanner;
public class SearchArray {
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

        System.out.println("Enter element: ");
        int ele = sc.nextInt();

        boolean flag=true;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==ele)
            {
                System.out.println("Found at index: "+ i);
                flag=false;
                break;
            }
        }

        if(flag==true)
        {
            System.out.println("Not Found!!");
        }
    }


}
