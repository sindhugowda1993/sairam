package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
   
    public static void main(String args[]) {
      LocalTime currentTime = new LocalTime();
	  System.out.println("current time" + currentTime);
  
        System.out.println("Hello, World");
    }
}