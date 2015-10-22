import java.util.Scanner;
public class Lab3 {

		public static void main(String[] args) {
			int date = 2015;
			int age= 0;
			int DrinkYear;
			
			char choiceChar = 'Y';
			do{
			Scanner Input = new Scanner(System.in);
			
			System.out.println("What is your name?");
			String name = Input.nextLine();
			System.out.println("What is your birth year?");
			int Birthyear = Input.nextInt();
		age = date-Birthyear;
		System.out.printf("Hello, %s, you're %d years old today!", name, age);
		
if (age>21)
System.out.println(" Congratulations, You can lawfully drink!");

else {
	System.out.println(" Sorry, You cannot lawfully drink!");
	DrinkYear = Birthyear+21 ;
	if (age<21)
		System.out.printf("You will be able to drink in the year %s.",DrinkYear);
		
	System.out.print("\nDo again? 'Y' for yes 'N' for no: ");
	choice = Input.next();
}
choiceChar = choice.charAt(0);
choiceChar = Character.toUpperCase(choiceChar);
System.out.print("\n\n");
	}
while(choiceChar== 'Y');
}
}
