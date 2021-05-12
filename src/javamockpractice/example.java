package javamockpractice;

public class example {
	static {
		System.out.println("static");
	}
	{
		System.out.println("non static");
	}
	public static void main(String[] args) {
		new example();
		System.out.println("hiii");
		System.out.println("bye");
	}

}
