import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Коллекции нельзя изменить, при попытке получим UnsupportedOperationException;
 * В метод of() нельзя передать null, во всех коллекциях получим NullPointerException;
 * Метод of() не создает привычные ArrayList, HashSet или HashMap. В Java 9 были созданы специальные ImmutableCollections которые и возвращаются;
 * ImmutableCollections являются сериализуемыми, если содержимое тоже является сериализуемым;
 */
public class Main
{
	public static void main(String[] args)
	{
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		System.out.println(nums);
		Set<String> questions = Set.of("What?", "Where?", "When?");
		Map<String, String> params = Map.of("Name:", "John", "Surname:", "Snow", "Status:", "Unmarried");
	}
}
