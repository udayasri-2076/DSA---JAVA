/*Operators: Operators are special symbols used to perform operations on variables and values
Types of Operators in Java
1.Arithmetic Operators
2.Assignment Operators
3.Relational Operators
4.Logical Operators
5.Unary Operators
6.Bitwise Operators
7.Ternary

In java operators are used in mathematical calculations, decison making, loop conditions , bit manipulation & rela world logic
 */



import java.util.*;
public class PO4_Operators {
    public static void main(String args[]){

        //Arithmetic Operators
        int a=23;
        int b=67;

        System.out.println("Addition: "+(a+b));
        System.out.println("Difference:"+(b-a));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulo: "+(a%b));

        //Assignment Operators
        int rating=100;
        rating+=20; //100+20=120
        rating-=10; //120-10=110
        rating*=2;  //110*2=220
        rating/=4;  //220/4=55
        rating %=30; //55%30=25

        System.out.println(rating); //25

        //Relational Operators

        int current=45;
        int target=50;

        System.out.println(current==target); 
        System.out.println(current!=target);
        System.out.println(current>target);
        System.out.println(current<target);
        System.out.println(current>=target);
        System.out.println(current<=target);

        //Logical Operators
        boolean dsa=true;
        boolean core=false;

        System.out.println(dsa && core); //true && false= false
        System.out.println(dsa || core); // true || false=false
        System.out.println(!core);      //!false= true

        //Unary Operators

        int activeu=100;
        int prefix= ++activeu; //100+1=101
        int postfix= activeu++; // 101 ssign first then increament- 101+1=102

        System.out.println(prefix); //101
        System.out.println(postfix); //101 prints the numbers before increamenting
        System.out.println(activeu); //102

        //Bitwise Operators
        int x=6;
        int y=3;

        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);
        System.out.println(~x);
        System.out.println(x << 1);
        System.out.println(x >> 1);

        //Ternary Operator

        int solved=320;

        String level=(solved>=300)?"Advanced":"Intermediate";
        System.out.println(level);

    }
}
