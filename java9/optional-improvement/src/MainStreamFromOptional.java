import java.util.List;
import java.util.Map;
import java.util.Optional;

//Stream из Optional
public class MainStreamFromOptional
{
	public static void main(String[] args)
	{
		List<String> names = List.of("John", "Aria", "Tyrion", "Daenerys", "Eddard");

		//old approach
		names.stream()
			.map(MainStreamFromOptional::getSurname)
			.filter(Optional::isPresent)
			.map(Optional::get)
			.forEach(System.out::println);

		//new approach
		names.stream()
			.map(MainStreamFromOptional::getSurname)
			.flatMap(Optional::stream)
			.forEach(System.out::println);
	}

	private static Optional<String> getSurname(String name)
	{
		return Optional.ofNullable(humans.get(name));
	}

	private static Map<String, String> humans = Map.of(
		"John", "Snow",
		"Aria", "Stark",
		"Daenerys", "Targaryen"
	);

}
