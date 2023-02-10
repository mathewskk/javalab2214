class Vehicle
{
public void Run()
{
System.out.println("vehicle is running");
}
final void display()
{
System.out.println("Final can't be override");
}
}
class Maruti extends Vehicle
{
/*void display()
{
System.out.println("trying to override");
}*/
public void Run()
{
System.out.println("maruti is running");
}
}
public class MethodOverrid
{
public static void main(String[] args)
{
Maruti obj=new Maruti();
obj.Run();
obj.display();
}
}