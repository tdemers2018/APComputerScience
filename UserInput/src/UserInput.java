import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		String color;
		
			
		
		System.out.println("What is your name? ");
		name = input.nextLine();
		System.out.println("What is your favorite color? ");
		color = input.nextLine();
		input.close();
		
		System.out.println("Hi " + name + ", " + color + " is a great color!");


	}

}
