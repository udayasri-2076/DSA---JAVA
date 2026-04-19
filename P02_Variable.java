

/*Rules
1.Case sensitivity
2.starting character
3.subsequent characters
4.no reserved keywords[class,static,etc]
5.length[no limit, but meaningful names needed]
6.conventionns:camelCse,Uppercase
*/

import java.util.*;
public class P02_Variable {
    public static void main(String[] args){
        //define or initialize
        int age=20;
        System.out.println(age);

        //Case sensitive
        int weight=90;
        int WEIGHT=80;
        System.out.println("weight: "+weight);
        System.out.println("weight: " + WEIGHT);

    }
}
