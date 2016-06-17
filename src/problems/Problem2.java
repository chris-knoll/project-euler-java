package problems;

import java.util.ArrayList;
import java.util.Iterator;

import utilities.FibonacciNumbers;

/**
 * Solution to Problem 2 on ProjectEuler.net.
 * 
 * @author Chris Knoll
 *
 */
public class Problem2
{
	private static int HIGHEST_FIBONACCI_NUMBER = 4000000;
	private static int answerSum = 0;
	
	public static void main(String[] args)
	{
		ArrayList<Integer> fibNumbers = FibonacciNumbers.getUpTo(HIGHEST_FIBONACCI_NUMBER);
		Iterator<Integer> iterator = fibNumbers.iterator();
		
		while (iterator.hasNext())
		{
			int currentFibNumber = iterator.next();
			if(isEven(currentFibNumber))
			{
				answerSum += currentFibNumber;
			}
		}
		
		printAnswer();
	}
	
	private static boolean isEven(int number)
	{
		return number % 2 == 0;
	}
	
	private static void printAnswer()
	{
		System.out.println("The answer is: " + answerSum);
	}
}
