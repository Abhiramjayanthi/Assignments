import java.util.Scanner;

/**Q6
Maximum number of files: 200
Type of work: Individual work
Q6. Consider a CUI based application, where you are asking a user to enter his Login name and password, after entering the valid user-id and password it will print the message ?Welcome? along with user name. As per the validation is concerned, the program should keep a track of login attempts. After three attempts a message should be flashed saying ?Contact Admin? and the program should terminate.              

Description:-

You have to create a CUI based application in which you will declare and initialize the userId and password.You have to enter the credentials when you login to the application(when you run the program it should ask the user to enter the credentials),if the entered credentials are validated correctly you should see a welcome message with the userId or else you should have total 3 attempts to enter the correct credentials.If you fail to enter the right credentials in your 3rd attempt you should display a message "Contact Admin".

Test Cases:-

SampleInput:- (as per Specifications)

userId = "Ajay",password = "password";

SampleOutput:-

Example1:-

Enter userId

ajay

Enter password

password

You have entered wrong credentials ,please enter the right credentials.

Example2:-

Enter userId

Ajay

Enter password

pass

You have entered wrong credentials ,please enter the right credentials.

Example3:-

Enter userId

Ajay1

Enter password

password

You have entered wrong credentials 3 times

Contact Admin

Example4:-

Enter userId

Ajay

Enter password

password

Welcome Ajay

Specifications:-

class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {}

}
public class Assignment1Q6 {
    public static void main(String[] args) {}
}
**/

class Login{
    static String userId = "Ajay";
	static String password = "password";
	static int i=3;
    public static String loginUser(String user, String pass) { 
    	i--;
    	String z=null;
        		if((user.equals(userId) && pass.equals(password))) {
        			z= "Welcome "+userId;
        			
        		}
        		else if(i>=1) {
        			z="You have entered wrong credentials ,please enter the right credentials\n";
        		}
        		else {
        			z= "You have entered wrong credentials 3 times \nContact Admin"; 
        		}
    		return z;
    	
    	
    }

}
public class Assignment1Q6 {

	public static void main(String[] args) {
		int i=3;
		Scanner scanner=new Scanner(System.in);
		while(i>0) {
		System.out.println("userId: ");
		String user=scanner.next();
		System.out.println("password: ");
		String pass=scanner.next();
		String name = Login.loginUser(user, pass);
		System.out.print(name);
		i--;
		}
		scanner.close();
	}

}





/**class Assignment1Q6 {

	public static void main(String[] args) {
		//String userId = "11",password = "22";
		Scanner scanner=new Scanner(System.in);
		System.out.print("userId: ");
		String userId = scanner.next();
		System.out.print("password: ");
		String password = scanner.next();
		System.out.println(userId + password);
		
		int i=3;
    	do {
    		i--;
    		System.out.print("userId: ");
    		String user = scanner.next();
    		System.out.print("password: ");
    		String pass = scanner.next();
    		if((user.equals(userId))) {
    			System.out.print("Welcome"+userId);
    		}
    		else if(i>=1) {
    			System.out.print("You have entered wrong credentials ,please enter the right credentials");
    		}
    		else {
    			System.out.print("have entered wrong credentials 3 times \nContact Admin"); 	
    		}
    	}while(i>0);
    	scanner.close();

	}

}**/