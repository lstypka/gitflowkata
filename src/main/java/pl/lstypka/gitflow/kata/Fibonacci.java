package pl.lstypka.gitflow.kata;

public class Fibonacci
{

	public static long fibonacci(final int number)
	{
		if (number <= 1)
			return number;
		else
			return fibonacci(number - 1) + fibonacci(number - 2);
	}

	public static void main(final String[] args)
	{
		int n = 5;
		for (int i = 1; i <= n; i++)
			System.out.println(i + " :-) " + fibonacci(i));
	}

}
