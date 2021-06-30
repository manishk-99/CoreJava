class A  //car
{
    public void f1(int x)
    {
        System.out.println("Class A");
    }
}
class B extends A //superCar
{
    public void f1(int x)
    {
        System.out.println("Class B");   
        //This is done just to provide different functionality in the child class ie sportscar 
        //suppose F1 is a gear function and both cars have gear ie sports  car inherited it by super class but we want superclass gearfunction to perofrm different way..thats why sports car gear function overRides 
        //car function gear whenever we call sportscar instance
        
    }
}
public class OverRidingExample
{
    public static void main(String []args)
    {
        B obj = new B();
        obj.f1(5);
    }
}