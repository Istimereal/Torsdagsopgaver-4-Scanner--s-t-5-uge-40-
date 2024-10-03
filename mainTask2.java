import java.util.Scanner;


class MainTask2{
	String name;
	int age;
	int yearsToRetirement;


public static void main (String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Please type your name");
String input = scanner.nextLine();

MainTask2 main = new MainTask2();

main.nameInput(input);
	
System.out.println("Hello " + main.name+" Please type your age");

int givenAge = scanner.nextInt();

main.ageInput(givenAge);

System.out.println("you are " + main.age +" years old");

main.yearsBeforeRetirement();

System.out.println("You have " + main.yearsToRetirement + " years until retirement");
 }

 public void nameInput(String input){
 	this.name = input ;
}

public void ageInput(int ageInput){
	this.age = ageInput;   
	 }

	
public void yearsBeforeRetirement(){  
	
	yearsToRetirement = 67 - this.age;  
}
	
}