import java.util.List;
import java.util.Map;
import java.util.Optional;

//Optional.ifPresentOrElse()
public class MainOptionalIfPresentOrElse
{
	private static Map<String, String> survivors = Map.of(
		"John", "Snow",
		"Aria", "Stark",
		"Tyrion", "Lannister",
		"Daenerys", "Targaryen"
	);

	public static void main(String[] args)
	{
		List<String> names = List.of("John", "Aria", "Tyrion", "Daenerys", "Eddard");

		names.stream()
			.map(MainOptionalIfPresentOrElse::getSurname)
			.forEach(s -> s.ifPresentOrElse(MainOptionalIfPresentOrElse::printAlive, MainOptionalIfPresentOrElse::printDead));
	}

	private static Optional<String> getSurname(String name)
	{
		return Optional.ofNullable(survivors.get(name));
	}

	private static void printAlive(String surname)
	{
		System.out.println(surname + " is alive");
	}

	private static void printDead()
	{
		System.out.println("One more dead");
	}
}
