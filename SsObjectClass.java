class AAx
{
    double P;
    double R;
    double T;
    double SI;

    void Simple(double a,double b,double c)
    {
        P=a;
        R=b;
        T=c;
    }

    void Calc()
    {
        SI=(P*R*T)/100;

    }
    void Display()
    {
        System.out.println(SI);
    }
}
class SsObjectClass
{
    public static void main(String[] args)
    {
        AAx mm=new AAx();
        mm.Simple(3400,4.5,3);
        mm.Calc();
        mm.Display();
    }
}