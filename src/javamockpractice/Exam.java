package javamockpractice;

public class Exam {
	
	Exam(){
		this(1.6);
		System.out.println("called");
	}
	Exam(double d){
		System.out.println("fgdffsg");
	}
	Exam(int x){
		System.out.println("parameter");
	}
	public static void main(String[] args) {
		Exam e=new Exam();
		
		

	}

}
