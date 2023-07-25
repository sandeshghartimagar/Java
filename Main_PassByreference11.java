class AAaa
{
	int a=21;
void SSgg(AAaa M)
{
	M.a=M.a+10;
}
/*void Display()
{
	System.out.println("The value after Pass by Reference is "+ M.a);
}*/
}

class Main_PassByreference11
{
	public static void main(String args[])
	{ 
		AAaa A=new AAaa();
		System.out.println("The value of a is" + A.a);
		A.SSgg(A);
		System.out.println("The value of a is" + A.a);
		//A.Display();
}
}