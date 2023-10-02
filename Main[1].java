import java.util.Scanner; 

class Main{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type your name");


		String name = scanner.nextLine(); //Indlæser navnet

		System.out.println("Hello " + name + ". Please type your age");

		String input = scanner.nextLine(); // Indlæser tallet som text
		int age = Integer.parseInt(input); // Konverterer tallet til et tal

		int timeUntilRetirement = 67 - age;

		System.out.println(age + " years old! This is your prime time.");

		System.out.println("You now have " + timeUntilRetirement + " years left until retirement");

	}

}
