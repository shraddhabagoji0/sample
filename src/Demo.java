
public class Demo {
	static{
		System.out.println("sib ");
	}
	Demo(){
		System.out.println("constructor");
	}
	{
		System.out.println("iib");
	}

	public static void main(String[] args) {
		System.out.println("--------");
		new Demo();
		System.out.println("--------");
		
	}

}
