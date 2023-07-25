class Employee
{
	private String name;
	private double salary;
Employee (String N, double S)
{
	name=N;
	salary=S;
}
double get_salary()
{
	return salary;
}
} 
class Manager extends Employee
{
	private double gross_sl;
	private double bonus;
Manager (String N, double S,double SL, double B)
{
	super(N, S);
	gross_sl=SL;
	bonus=B;
}
double get_salary()
{
	double k=super.get_salary();
	gross_sl=k+bonus;
	return gross_sl;
}
}
class Main_superOverRiding
{
	public static void main(String args[])
	{
		Employee[] staf = new Employee[2];
		staff[0] = new Manager("Shanker", 10000, 500);
		staff[1] = new Employee("Kamal", 10000);
		double Mang_shankhar = staff[0].get_salary();
		double Emp_kamlesh = staff[1].get_salary();
		System.out.println("Manager salary is " + Mang_shankhar);
		System.out.println("Employee salary is " + Emp_kamlesh);
	}
}