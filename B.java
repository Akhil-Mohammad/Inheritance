class A

{
 static int x=10;
	    int y=20;
}
class B extends A
{

	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(new B().y);
	}
}

