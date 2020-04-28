import java.util.stream.Stream;

//stream.dropWhile
public class MainStreamDropWhile
{
	public static void main(String[] args)
	{
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
			.dropWhile(n -> n < 6)
			.forEach(System.out::println); // 6 7 8 9 10
	}
}
