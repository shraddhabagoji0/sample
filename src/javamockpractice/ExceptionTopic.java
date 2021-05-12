package javamockpractice;

public class ExceptionTopic {
	public static void pwd() throws  PasswordNotFoundException{
		int pwd=12;
		if(pwd>15)
		{
		System.out.println("Logged in successfully");
		}
		else{
			throw new PasswordNotFoundException("Invalid password");
		}
			
		}
	public static void main(String[] args) {
		try {
			pwd();
		}
		catch(PasswordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
	class PasswordNotFoundException extends RuntimeException{
		String msg;
		public PasswordNotFoundException(String msg) {
			this.msg=msg;
		}
		public String getMessage() {
			return msg;
		}
		
	}



