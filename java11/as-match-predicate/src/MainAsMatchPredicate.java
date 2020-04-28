import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class MainAsMatchPredicate
{
	public static void main(String[] args)
	{
		//java 8
		Predicate<String> chracterPredicate = Pattern.compile("ah").asPredicate();
		Stream.of("coding", "ahsan", "infinite")
			.filter(chracterPredicate)
			.forEach(System.out::println);
		//Output of above program
		//ahsan

		//java 11
		final String EMAIL_PATTERN = "^[a-zA-Z0-9#_~!$&'()*+,;=:.\"<>@\\[\\]\\\\]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$";
		var pattern = Pattern.compile(EMAIL_PATTERN).asMatchPredicate();
		Stream.of("jondoe@gmail.com", "1.ru")
			.filter(pattern).forEach(System.out::println);
	}
}
