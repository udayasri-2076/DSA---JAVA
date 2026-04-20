/*Conditionals: In programming decisions drive logic. such decisions are handled by conditional statements
Types of conditionals
1.if statement
2.if-else statement
3.if-else-if ladder
4.nested if-else
5.Ternary operator
6.Switch statement
 */


import java.util.*;
public class P06_Conditionals {
public static void main(String[] args){
    //if statement- Executes code only when a condition is true
    int practice=12;
    if(practice>=10){
        System.out.println("Good consistency!");
    }

    //if-else statement- executes one block if condition is true, another if false
    int score=42;
    if(score>=50){
        System.out.println("Pass");
    }
    else{
        System.out.println("Fail");
    }

    //if-else ladder- used when multiple conditions exist
    int accuracy=75;

    if(accuracy>=90){
        System.out.println("Exacellent");
    }
    else if(accuracy>=70){
        System.out.println("Good");
    }
    else if(accuracy>50){
        System.out.println("Average");
    }
    else{
        System.out.println("Need improvement");
    }

    //Nested if-else- used when conditions depend on each other
    boolean subscription=true;
    int solvedp=220;

    if(subscription){
        if(solvedp>=200){
            System.out.println("unlock advanced sheet");
        }
        else{
            System.out.println("Practice more problems");
        }
    }
    else{
        System.out.println("Upgrade to premmium");
    }

    //Ternary Operator: short cut for if-else
    //Syntax: condition?valueif true: value false;

    int streakdays=35;
    String status=(streakdays>=30)?"consistent":"Irregular";
    System.out.println(status);

}
    
}
