import java.util.stream.IntStream;
import java.util.stream.Stream;

//stream.iterate
public class MainStreamIterate
{
	public static void main(String[] args)
	{
//		IntStream.iterate(0, n -> n + 1)
//			.forEach(System.out::print);

		IntStream.iterate(0, n -> n + 1)
			.takeWhile(n -> n < 10_0)
			.forEach(System.out::println);

		IntStream.iterate(0, i -> i < 1_000, i -> i+10)
			.forEach(System.out::println);
	}
}
