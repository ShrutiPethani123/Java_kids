/*

Types:

1. Arithmetic Operators (+ - * / %)
2. Relational Operator (< > <= >= == !=)
3. Assignment Operator (+=  -=  *=  /=  %=  = )
4. Logical Operator (&& || !)
5. Bitwise operator (& | ^ ~ <<  >>)
6. Increment/Decrement ( ++  --)
7. Ternary Operator



&&

A   B    A&&B

F   F       F
F   T       F
T   F       F
T   T       T


||

A   B    A||B

F   F       F
F   T       T
T   F       T
T   T       T

 */


public class Operators {
    
    public static void main(String[] args) {
        
        // int a = 5;
        // int b = 6;
        // System.out.println(a==b);

        // int c=5;
        // c+=7;
        // // c=c+7;
        // System.out.println(c);



        // int a1 = 34;
        // int b1=67;
        // int c1=56;

        // System.out.println(a1<b1 && b1>c1); 

        // c1++;
        // System.out.println(c1);

        // int a = 5;
        // System.out.println(a++); // 5(6)
        // System.out.println(a); // 6
        // System.out.println(++a); // 7
        // System.out.println(a); // 7


        // int d = a++ + a++ + a++ + a++; // 5(6) + 6(7) +7(8) + 8(9)
        // int d = a++ + a++ + ++a + a++ + ++a;  // 5(6) + 6(7) + 8(8) + 8(9) +10(10)
        // int d =a++ + a++ + ++a + a++ + ++a; // 5 6 8 8 10


        // System.out.println(d);

        int x=9,y=3,z=7;

        // System.out.println(x++>y++ && x-- >y--);
        System.out.println(x++ > ++y || x-- >z++);
        System.out.println(x + " " + y + " " + z);


        int a=6807;
        int b=67;

        int max =  a>b ? a:b;
        System.out.println(max);
    }
}
