class Parent 
{
	static int x=10;
}
class Child extends Parent{
	static int y=20;
}
class Child2 extends Parent
{
}
class Child3 extends Parent{

	public static void main(String[] args) 
	{
		System.out.println(new Child().x);
		System.out.println(new Child().y);
		System.out.println(new Child2().x);
	}
}
