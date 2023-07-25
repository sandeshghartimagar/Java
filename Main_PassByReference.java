class Modify
{
	int d=10;
void Add(Modify A)
{
	A.d=A.d+10;
}
}
class Main_PassByReference
{
	public static void main (String args[])
	{
		Modify M=new Modify();
		M.Add(M);
		System.out.println(M.d);
	}
}