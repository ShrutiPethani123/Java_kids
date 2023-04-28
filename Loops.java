/*


loops:

for
while
do while

 */


public class Loops {
    public static void main(String[] args) {
        
        // for(int i=0;i<5;++i)
        // {
        //     System.out.println(i);
        // }

        // for(int j=1;j<5;j+=2)
        // {
        //     System.out.println(j);
        // }

        // int k;
        // for(k=1;k<4;k++)
        // {
        //     System.out.println(k);
        // }
        // System.out.println(k);

        // int k=1;
        // while(k<=5)
        // {
        //     System.out.println(k);
        //     k++;
        // }


        // int x=1;
        // do{
        //     System.out.println(x);
        //     x++;
        // }while(x>5);


        int n=12;

        int a=0;
        int b=1;
        int c;
        System.out.print(a+" " + b+ " ");

        int i=2;
        while(i<n)
        {
            c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
            i++;
        }


    }
}


/*


1. print 30 to 20 reverse number using all loop.
2. print multiplication table of user given input using  all loop.

    n = 5

    5 * 1 = 5
    5 * 2 = 10
    .
    .
    5 * 10 = 50

3. print sum of user given range numbers using all loop.

    a=3
    b=6

    sum = 3 + 4 + 5+6 = 18

4. print factorial of a number using all loop.
    4 -> 24(4*3*2*1)

5. Take one number from user and count total number of didgit.

n - 45896
count: 5

6. Print sum of all digits.

n - 2341
sum: 10

7. Print reverse number.

n - 5632
rev: 2365

8. Take number is palindrom or not ?

palindrom: 12321

9.  Print Fibonacci series.

0 1 1 2 3 5 8 13 .....

 */