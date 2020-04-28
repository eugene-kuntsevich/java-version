import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//stream.ofNullable
public class MainStreamOfNullable
{
	public static void main(String[] args)
	{
		Stream.of(new User(List.of("1", "2")), new User(List.of("3", "4")))
			.flatMap(user -> {
				List<String> accounts = user.getAccounts();
				return accounts == null ? Stream.empty() : accounts.stream();
			})
			.collect(Collectors.toList()).forEach(System.out::println);

		Stream.of(new User(List.of("1", "2")), new User(null))
			.flatMap(user -> Stream.ofNullable(user.getAccounts()))
			.collect(Collectors.toList()).forEach(System.out::println);
	}

	private static class User
	{
		private final List<String> accounts;

		public User(List<String> accounts)
		{
			this.accounts = accounts;
		}

		public List<String> getAccounts()
		{
			return accounts;
		}
	}
}
