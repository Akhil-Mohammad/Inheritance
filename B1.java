class A1
{
	public static void sm(){
		System.out.println("sm executed");
	}
	public void nsm(){
		System.out.println("nsm executed");
	}
}
class B1 extends A1
{
	public static void main(String [] args)
	{
		sm();
		new B1().nsm();
	}
}
