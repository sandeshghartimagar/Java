class Cnst {
    int l, b, h, V;

    Cnst(int a) {
        l = a;
    }

    void Calc1() {
        V = l*l*l;
    }

    void Display1()
    {
        System.out.println("The Volume of cube is " + V);
    }
    Cnst(int a, int c, int d)
    {
        l=a;
        b=c;
        h=d;
    }

    void Calc()
    {
        V=l*b*h;
    }
    void Display()
    {
        System.out.println("The volume of cuboid is " + V);
    }
}
class Cnstr_Ovrd
{
    public static  void main(String args[])
    {
        Cnst A=new Cnst(5);
        A.Calc1();
        A.Display1();

        Cnst B=new Cnst(5,3,2);
        B.Calc();
        B.Display();
    }
}


