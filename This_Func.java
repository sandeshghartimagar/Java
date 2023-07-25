class Abc_1
{
    int a, b;

    void Init(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void Display()
    {
        System.out.println(a + " " + b);
    }
}
class This_Func
{
    public static void main(String[]args)
    {
        Abc_1 A=new Abc_1();
        A.Init(1,3);
        A.Display();
    }
}