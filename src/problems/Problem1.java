package problems;
/**
 * Solves Problem 1 on ProjectEuler.net
 * 
 * @author Chris Knoll
 *
 */
public class Problem1
{
	private static final int MAX_NUMBER = 999; // Highest value to consider
	private static int answerSum = 0;

	public static void main(String[] args)
	{
		addAllMultiplesOfThree();
		addAllMultiplesOfFive();
		printAnswer();
	}

	private static void addAllMultiplesOfThree()
	{
		for (int i = 0; i <= MAX_NUMBER; i += 3)
		{
			answerSum += i;
		}
	}

	// Get all multiples of 5 while ignoring the multiples of 3
	private static void addAllMultiplesOfFive()
	{
		for (int i = 0; i <= MAX_NUMBER; i += 5)
		{
			boolean isDivisibleByThree = i % 3 == 0;
			if (!isDivisibleByThree)
			{
				answerSum += i;
			}
		}
	}
	
	private static void printAnswer()
	{
		System.out.println("The answer is: " + answerSum);
	}
}
