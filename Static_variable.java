class SSgg
{
     static int num=0;
    SSgg()
    {
       num=++num;
    }
    void Display()
    {
        System.out.println(num);
    }
}
class Static_variable 
	{
    public static void main(String[] args)
    {
        SSgg S=new SSgg();
        S.Display();
        SSgg T=new SSgg();
        T.Display();
    }
}