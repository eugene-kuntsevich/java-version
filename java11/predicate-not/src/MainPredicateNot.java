import java.util.stream.Stream;

import static java.util.function.Predicate.not;

public class MainPredicateNot
{
	public static void main(String[] args)
	{
		Stream.of("1", "2", "", "     ", "3")
			.filter(not(String::isBlank)).forEach(System.out::println);
	}
}
