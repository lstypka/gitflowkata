package pl.lstypka.gitflow.kata;

public class Fibonacci
{

	public static long fibonacci(final int n)
	{
		if (n <= 1)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(final String[] args)
	{
		int n = 5;
		for (int i = 1; i <= n; i++)
			System.out.println(i + " :-) " + fibonacci(i));
	}

}
