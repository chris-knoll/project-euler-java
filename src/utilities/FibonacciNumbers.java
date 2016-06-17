package utilities;

import java.util.ArrayList;

/**
 * Class to get Fibonacci numbers in an array.
 * 
 * @author Chris Knoll
 *
 */
public class FibonacciNumbers
{
	public static ArrayList<Integer> getUpTo(int highestNumber)
	{
		ArrayList<Integer> fibNumbers = new ArrayList<Integer>();
		
		fibNumbers.add(1);
		fibNumbers.add(2);
		
		int currentIndex = 1;
		int nextFibNumber = 0;
	
		while(true)
		{
			nextFibNumber = fibNumbers.get(currentIndex) + fibNumbers.get(currentIndex - 1);

			if (nextFibNumber > highestNumber)
			{
				break; //The highest number requested has been passed
			}
			else
			{
				fibNumbers.add(nextFibNumber);
			}
			currentIndex++;
		}

		return fibNumbers;
	}
}
