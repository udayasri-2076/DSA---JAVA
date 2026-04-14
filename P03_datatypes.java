/*Datatype: A data type specifies the type of data that a variable can hold */
import java.util.*;
public class P03_datatypes {
    public static void main(String args[]){
      int daily=90; //daily=variable, int=datatype
      double mockarray=84.5;
      //mockarray=84.5; -Invalid
      System.out.print(daily);

      //Primitve Datatypes - Java has 8 predefined datatypes. these are the most basic storage types
      //1.Boolean: gives true or false as output default values is false

      boolean active=true;
      System.out.println(active);

      //2.Byte- range -128 to 127 size-8bit
      byte module=5;
      System.out.println(module); //default=0

      //3.short- range=-32,768 to 32,767
      short contestScore=1500;
      System.out.println(contestScore); // default value:0

      //int= -2^31 to 2^31
      int total=250000;
      System.out.println(total);// default value:0

      //long - -2^63 to 2^63-1
      long plat=1500000000000l;
      System.out.println(plat);

      //double- used for decimal numbers
      double average=3.75;
      System.out.println(average); //defaullt value:0.0

      //float-
      float discount=12.5f;
      System.out.println(discount);

      //char: stores a single unicode character
      char grade='A';
      System.out.println(grade);

      //Type Castinng
      //Implicit: Coverting small datatype to big datatype is called implicit datatype
      byte num1=123;
      long num2=num1;
      System.out.println("Implicit datatype: "+num2);


      //Explicity datatype
      long val1= 123456789;
      int val2=(int)val1;
      System.out.println(val2);
}
}

//Java  is statically typed , it requires every variable to be declared with a datatype before it is used