class SSss
{
    private String name;
    private int age;
    SSss(String e, int f)
    {
        name=e;
        age=f;
    }
    void Display()
    {
        System.out.println(name+ " " + age);
    }
}
class Private_Main
{
    public static void main(String args[])
    {
        SSss R=new SSss("Sandesh" ,21);
        R.Display();
    }
}