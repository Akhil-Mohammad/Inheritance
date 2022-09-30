class Parent 
{
	static int x=10;
}
class Child extends Parent{

	/*public static void main(String[] args) 
	{
		System.out.println(x);
	}*/
}
class Child2 extends Parent{

	public static void main(String[] args) 
	{
		System.out.println(new Child().x);
	}
}
