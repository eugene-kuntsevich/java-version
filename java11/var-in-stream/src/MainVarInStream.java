import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jetbrains.annotations.NotNull;

public class MainVarInStream
{
	public static void main(String[] args)
	{
		Stream.of("1", "2")
			.map((@NotNull var s) -> s.toLowerCase())
			.collect(Collectors.toList()).forEach(System.out::println);
	}
}
