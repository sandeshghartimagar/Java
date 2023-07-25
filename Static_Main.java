

class Aabc
{
    int a;
    static String Name = "Ram";

    Aabc(int b)
    {
        a = b;
    }
}
class Static_Main
{
    public static void main(String args[])
    {
        Aabc A=new Aabc(3);
        System.out.println("A is calling" +  A.a    );

        Aabc B=new Aabc(32);
        System.out.println("B is calling" +  B.a  );
    }
}
