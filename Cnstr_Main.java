class Cnstr
{
    double p,t,r,si;

    Cnstr(double a,double b, double c)
    {
        p=a;
        t=b;
        r=c;
    }
    void Calc()
    {
        si=(p*t*r)/100;
    }
    void Display()
    {
        System.out.println("The si is " + si);
    }
}

class Cnstr_Main

{
    public static void main(String[]args)
    {
        Cnstr c=new Cnstr(3400,4.5,3.5);
        c.Calc();
        c.Display();
    }
}
