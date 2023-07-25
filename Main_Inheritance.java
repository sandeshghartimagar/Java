class Animal
{
	float beat;
	String blood;
	int eye;
	
	void HasLife()
	{
		beat=72;
	}
}
class Man extends Animal
{
	float legs=2;
	String blood="Red";
	void Run()
	{
		System.out.println("Run 80 km/hr");
	}
}
class Main_Inheritance
{
	public static void main (String args[])
	{
		Animal M=new Animal();
		Man Hari=new Man();
		Hari.Run();
		System.out.println(Hari.legs + " " + Hari.blood);
		Hari.HasLife();
	}
}
		