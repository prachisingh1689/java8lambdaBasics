package io.javabrains;

public class Greeter
{
  public void greet(Greeting greeting)
  {
    //System.out.println("Hello world");
    greeting.perform();
  }

  public static void main(String[] args)
  {
    Greeter greeter = new Greeter();
    HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
    greeter.greet(helloWorldGreeting);
    
    //greetingFunction = () -> System.out.println("Hello World");
    
    
    
    
    
    
    
    
    
    
  }
}
