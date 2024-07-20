package Dersler.Ders45;

public class test1 {
    public static void main(String[] args)

    {
        B b1 = new B();
        System.out.println("------------------------");
        B b2 = new B(10);
        System.out.println("------------------------");
        C c1 = new C();
        System.out.println("------------------------");
        C c2 = new C(10,5.4);
        System.out.println("------------------------");
    }
}
class A
{
    public A()
    {
        System.out.println("A default constructor");
    }
    public A(int x)
    {
        System.out.println("A int constructor");
    }
 }

class B extends A
{
    public B()
    {
        System.out.println("B default constructor");
    }
    public B(int x)
    {
        System.out.println("B int constructor");
    }
}
class C extends B
{
    public C()
    {

        System.out.println("C default constructor");
    }
    public C(int x,double z)
    {
        super(10);
        System.out.println("C int , double constructor");

    }
}