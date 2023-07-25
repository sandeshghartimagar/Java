class Cnst_Return
{
    int l,b,h,V;
    Cnst_Return(int x)
    {
        l=x;
    }
    int Volume1()
    {
        V=l*l*l;
        return V;
    }

    Cnst_Return(int x, int y, int z)
    {
        l=x;
        b=y;
        h=z;
    }
    int Volume()
    {
        V=l*b*h;
        return V;
    }
}
class Cnstr_Ovrd_ReturnType
{
    public static void main(String args[])
    {
        Cnst_Return M=new Cnst_Return(5);
        int a=M.Volume1();
        System.out.println("The volume of cube is " + a);

        Cnst_Return N=new Cnst_Return(4,3,2);
        int b= N.Volume();
        System.out.println("The volume of cuboid is " + b);
    }
}