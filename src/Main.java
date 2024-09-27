import javax.management.relation.Relation;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. creating java file and test hello
        //  System.out.println("Hello Ji Welcome Mahfooz !!!");

        // 2. BoilerPlate code understand
        //  public class Main  it is class all java code write in class so here give known as method java
        //  public static void main(String[] args)  it is main function code run start main function
        //  the two line code required  is boilerplate code

        // 3. Output
        // System.out.println("Hello Ji Welcome Mahfooz !!!"); give output => System.out.println
        // output => Hello Ji Welcome Mahfooz !!!
        // nextline use => System.out.println or \n use also
        // eg => System.out.print("Hello" \n "Hello") both hello in next line
        // same line System.out.print()
        // output => print 0r println 0r \n

        // 4.print pattern
//        System.out.println("****");
//        System.out.println("***");
//        System.out.println("**");
//        System.out.println("*");
//
//        output =>
//        ****
//        ***
//        **
//        *

        // 5. Variable in Java
//        a = 10, b =5
//        2*(a + b)   => 2 Literal , a , b => variable => a , b name is identifier
//        variable => which value is change and also known by container which store
//        Literals => which value is not change
       // memory reserverd is varible space reserved name and adress of each block of varible
       // each variable depend on size of data type
//       int a = 12;
//       int b = 5;
//        System.out.println(a);
//        System.out.println(b);
//        String name  = "ROSE";
//        System.out.println(name);
//         a = 50; // update value
//        System.out.println(a);
//        a = b;
//        System.out.println(a);

        // 6. Data Types in java also java is typed language you need first declare type
        // primitive which exist in java
//        byte, short, char, boolean, int , long, float, double
        // non primitive which make
        //       String,  Array, Class, Object, Interface

//                                 // size
//        byte b = 8;              // 1
//        System.out.println(b);
//
//        char ch = 'a';            //2
//        System.out.println(ch);
//
//        boolean var = true;        //1
//        System.out.println(var);
//
//        float price = 12.4f;       // 4
//        System.out.println(price);
//
//        int number = 24;           // 4
//        System.out.println(number);
//
//        long num2 = 12333344L;      // 8
//        System.out.println(num2);
//
//        short num3 = 250;           // 2
//        System.out.println(num3);
//
//        double num4 = 33444;         // 8
//        System.out.println(num4);

       // 7. sum of a and b

//        int a  = 12;     // analise in memory store data
//        int b =  13;
//        int sum = a + b; // remember variable name logical that good programmer behavior always remember clear understand
//        System.out.println(sum);
//
        // 8. Comments in java

        // single comment ignore by compiler

        /* multiline comment
        hello
        hii
        how
        are
        you

         */

        // comment use reading ability enhance and clarity of code use

        // 9. Input in java
//        next, nextLine, nextInt, nextByte, nextFloat, nextDouble, nextBoolean, nextShort, nextLong
     // eg =>
//        Scanner sc = new Scanner(System.in);
//       //  String input = sc.next(); // single print
//        String input = sc.nextLine();
//        System.out.println(input);
//
//        int number = sc.nextInt();
//        System.out.println(number);
//
//        float price = sc.nextFloat();
//        System.out.println(price);
//
//        // practice all

        // 10. Sum of a and b by input using Scanner

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.println(sum);
//

        // 11. Product of a and b
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int product  = a * b;
//        System.out.println(product);

        // 12. Area of Circle
//        Scanner sc = new Scanner(System.in);
//        float radius = sc.nextFloat();
//        float area  = 3.14f*radius*radius;
//        System.out.println(area);

        // 13.Type Conversion
        // when happen =>
        // a. type compatible
        // b. destination type > source type
        // eg => byte -> short -> int -> long -> double

//        int a = 34;
//        long b = a;
//        System.out.println(b);

//        long c = 23;
//        int  d = c;  // error possible lossy conversion from long to int
//        System.out.println(d);

//        Scanner sc = new Scanner(System.in);
//        float number = sc.nextInt();
//        System.out.println(number);

        // 13. Type Costing forcefully convert  0r narrowing or explicit
//        float a = 12.3f;
//        int b = (int)a;
//        System.out.println(b); // output 12 // lossy conversion
//
//        char ch = 'a';
//        int number = ch;
//        System.out.println(number);
//
//        char ch2 = 'b';
//        int number2 = ch2;
//        System.out.println(number2);


       // Type Promotion in Expression

        // data type different a+b/c*d each have different type data than promote accordingly

//        char a =  'a';
//        char c = 'c';
//        System.out.println(c-a);  // output 2
//
//        int e = 12;
//        float f = 30.1f;
//        double g = 30;
//        long h = 23;
//
//        double ans = e + f + g + h;
//        System.out.println(ans);



        // 15. how java code run understand by code


//        //16. Operator in java
//        sum = a + b; here + is operator, a, b => operend
//
//        // type of Operator
//        Arithmetic
//        Relation
//        Logical
//        Bitwise
//        Assignment

        // 1. Arithmetic
        // Binary => +, -, *, / , % , Unary => ++, --


//       int a = 10;
//       int b = 2;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a/b);
//        System.out.println(a%b);
//        System.out.println(a*b);
//        System.out.println(++a); // pre Increment value change value use
//        System.out.println(--a); // pre Decrement value change value use
//        System.out.println(a++); // post Increment value use value change
//        System.out.println(a);
//        System.out.println(a--); // post Decrement value use value change
//        System.out.println(a);

        // 2. Relational Operator
       // == => equal, != not equal, > greater, < less, >=, <=

//        int a = 12;
//        int b = 5;
//        System.out.println(a==b);
//        System.out.println(a!=b);
//        System.out.println(a>=b);
//        System.out.println(a<=b);
//        System.out.println(a>b);
//        System.out.println(a<b);

        // 3. Logical Operator
        // && logical and, || logical or, ! logical not

//        System.out.println((3>2) && (3>1));
//        System.out.println((3<1) || (4>1));
//        System.out.println(!(3>2));

        // 4. Assignment Operator
        // =, +=, -=, *=, /=

        int a = 10;
        int b = 23;
        System.out.println(a = b);
        System.out.println(a+=10); // speed fast
        System.out.println(a-=20);
        System.out.println(a/=10);
        System.out.println(a*= 10);




        }
    }
