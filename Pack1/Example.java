package Pack1;
import Pack2.Student;
public class Example {
    public static void main(String []args)
    {
        Student s1 = new Student();
        s1.setRoll(12);
        s1.setName("Manish");
        System.out.println("Roll is: "+ s1.getRoll());
        System.out.println("Name is: "+ s1.getName());
    }
}
