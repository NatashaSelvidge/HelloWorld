
import java.util.Scanner;

public class RandomNumber.java {

public static void main(String[] args) {

Scanner input = new Scanner (System.in);

RandomNumber myRandomNumber = new RandomNumber();

double GetANumber = 1+(Math.random()*10);
double number1;

System.out.print("A random number between 1 and 10 will be generated");
int x = myRandomNumber.GetANumber
number1= input.nextDouble();


if (number1==GetANumber)
System.out.printf("Congrats, you guessed it. The correct number is %f\n",
randomNum);
else if (number1 > GetANumber)
System.out.println("Your number is too high.");
else
System.out.println("Your number is too low.");

}

}
