package io.javabrains;

import java.util.StringJoiner;
public class StringJoinerExample {  

  int i;
  
  
 public StringJoinerExample(int i)
  {
    super();
    this.i = i;
  }


public static void main(String[] args) {  
     StringJoiner joinNames = new StringJoiner(":", "[", "]");   // passing comma(,) and square-brackets as delimiter   
       
     // Adding values to StringJoiner  
     joinNames.add("Rahul");  
     joinNames.add("Raju");  
     joinNames.add("Peter");  
     joinNames.add("Raheem");  
               
     System.out.println(joinNames);  
 }  
}  