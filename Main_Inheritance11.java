class AAaa
{
	int a=4;
	int b=5;
	int c;
void SSSss()
{
	c=a+b;
}
}
class BBbb extends AAaa
{
	int d=5;
	int e=6;
void Display()
{
	System.out.println(" The value of  d and e is " +  d + " and " + e);
}
}
class CCcc extends BBbb
{
	int f=20;
void Display1()
{ 

	System.out.println(" The value of f is " + f);
}
}
class Main_Inheritance11
{
	public static void main(String args[])
	{
		AAaa AA=new AAaa();
		AA.SSSss();
		System.out.println("The value of c is" + AA.c);

		BBbb BB=new BBbb();
		BB.SSSss();
		System.out.println("THe value call by BB is" + BB.c);
		BB.Display();

		CCcc CC=new CCcc();
		CC.SSSss();
		System.out.println("The value call by CC is" + CC.c);
		CC.Display();
		CC.Display1();
	}
}