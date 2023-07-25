class Sgm
{
    int a,b,c;

    void Init(int x, int y)
    {
        a=x;
        b=y;
    }
    void Replace()
    {
        c=a;
        a=b;
        b=c;
    }
    void Display()
    {
        System.out.println("The value if of a is " + a + " and b is " + b) ;

    }

}
class Swap
{
    public static void main(String []args)
    {
        Sgm t=new Sgm();
        t.a=4;
        t.b=5;
        t.Display();
        t.Replace();
        t.Display();
    }
}