/*

Array: 5 9 6 3 2
       0 1 2 3 4

-> index start with 0
-> end with size-1


a[2]= 6
a[1]= 9
a[7]= Execption

 */


import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        
        // int a[] = new int[6];
        // int []b = new int[]{1,2,3,4,5,6,7,8};

        // for(int i=0;i<b.length;i++)
        // {
        //     System.out.print(b[i]+ " ");
        // }
        // System.out.println();
        // for(int x: b)
        // {
        //     System.out.print(x + " ");
        // }

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






        int count=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                count++;
            }
        }

        System.out.println("Total Even numbers: " + count);

    }
}


/*

1. Intialize the array and print that array.
2. Take One array from user and print that array.
3. take one array from user and count total number of even element.

4 5 6 3 1
even: 2

4.  Take one array from user and print all odd numbers.

1 2 3 6 8 45 9

odd: 1 3 45 9

5. Take one array from user and check the element is present in array or not.

5 6 3 2 1 
ele: 3 ---> present at index 2
ele: 9  ---> Not Found

6. Take one array from user and find maximum element from array.

a: 5 6 3 1 9 63 23
max: 63

7. Take two array from user and print sum of that two array.

a: 1 2 3 6
b: 1 8 5 3

c: 2 10 8 9

8. Make two array from user and make one switch case for
1. add
2. sub
3. div
4. mul

9. Take one array from user and insert element into that array.
1 3 6 5 9 

ind:2
ele:7
1 3 7 6 5 9

10. Take one array from user and reverse that array.

    -> 10.1 print reverse array
    -> 10.2 store reverse array into another array.
    -> 10.3 reverse in memory




 */
