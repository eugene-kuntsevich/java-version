import java.util.stream.Stream;

//stream.takeWhile
public class MainStreamTakeWhile
{
	public static void main(String[] args)
	{
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
			.takeWhile(n -> n < 5)
			.forEach(System.out::println); // 1 2 3 4
	}
}
