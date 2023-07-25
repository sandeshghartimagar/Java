class Aaa
	{
		int a;
	void Sss(int x)
		{
			a=x+10;
		}
	void Display()
		{
			System.out.println("The value of a is" + a);
		}
	}
class Main_PassByValue
	{
		public static void main(String args[])
			{
				int k=5;
				Aaa A=new Aaa();
				A.Sss(k);
				System.out.println("The value of k is " + k);
				A.Display();
			}
	}
