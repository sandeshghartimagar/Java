class Abc {
    double P, T, R, SI;

    void Init(double a, double b, double c)
    {
        P=a;
        T=b;
        R=c;
    }
    double Simple()
    {
        SI=(P*T*R)/100;
        return SI;
    }
}
class ReturnType
{
    public static void main(String[] args)
    {
        double a;
        Abc s=new Abc();
        s.P=3400;
        s.T=4.5;
        s.R=3.5;
        a=s.Simple();
        System.out.println("The simple interest is" + a);
    }
}