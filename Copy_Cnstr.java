class Copy_Cnst
{
    int a,b;
    Copy_Cnst(int x, int y)
    {
        a=x;
        b=y;
    }
    Copy_Cnst(Copy_Cnst C)
    {
        a=C.a;
        b=C.b;
    }
}
class Copy_Cnstr
{
    public static void main(String args[])
    {
        Copy_Cnst A=new Copy_Cnst(1,2);
        Copy_Cnst B=new Copy_Cnst(A);
        System.out.println(B.a + " " + B.b);

    }
}