

import java.util.*;
public class P07_loops {
    public static void main(String[] args){
        //for loop:- 
        //Syntax: for(intialization;condition;update)

        for(int i=0;i<=5;i++){
            System.out.println("Hello java");

        }

        //print even numbers from 2 to 10
        for(int i=2;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //Nested loops
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Example-2
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.println("i="+i+", j= "+j);
            }
        }
        /*Output
        i=1, j= 1
        i=1, j= 2
        i=1, j= 3
        i=2, j= 1
        i=2, j= 2
        i=2, j= 3
        i=3, j= 1
        i=3, j= 2
        i=3, j= 3
 */

        //Break Keyword
        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.print(i); //Output: 1 2 3 4 
        }
        //continue keywords
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.print(i+ " "); //1 2 3 4 6 7 8 9 10 
        }

        //while loop
        /*Syntax: initialization;
                  while(condition){
                  //code
                  update;
                  } */
        int count=1;

        while(count<=5){
            System.out.println(count);
            count++;
        }

        //Countdown using while

        int module=4;
        while(module>=1){
            System.out.println("Module left: "+module);
            module--;
        }
        /*Output: 
        Module left: 4
        Module left: 3
        Module left: 2
        Module left: 1 */

        //do-while loop- the loop is similar to while, but with one important difference

        /*Syntax:  
        do{
        //code
        } while(condition) */

        int revision=1;

        do{
            System.out.println("Revision round: "+revision);
            revision++;
        }
        while(revision<=3);

        /*Output
        Revision round: 1
        Revision round: 2
        Revision round: 3 */

    //Print numbers from 1 to 10 using for loop
    for(int i=1;i<=10;i++){
        System.out.print(i+" "); //1 2 3 4 5 6 7 8 9 10 
    }

    //print numbers from 10 to 1 using whle loop

    int j=10;
    while(j>=1){
        System.out.print(j+" "); // 10 9 8 7 6 5 4 3 2 1 
        j--;
    }

    //print first 5 even numbers using for loop
    int c=0;
    for(int i=1;c<=5;i++){
        if(i%2==0){
            System.out.print(i+" ");
            count++;
        }
    }

    }
}
