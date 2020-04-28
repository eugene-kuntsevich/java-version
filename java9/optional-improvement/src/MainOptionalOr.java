import java.util.Optional;

//Optional.or()
public class MainOptionalOr
{
	public static void main(String[] args)
	{
		String username = "John";
		String homeAddress = findHomeAddress(username)
			//old approach
			.orElseGet(() -> findWorkAddress1(username));
		System.out.println(homeAddress);

		Optional<String> address = findHomeAddress(username)
			//new approach
			.or(() -> findWorkAddress2(username));
		System.out.println(address);
	}

	private static String findWorkAddress1(String username)
	{
		return Math.random() > 0.2 ? username + "'s Work" : null;
	}

	private static Optional<String> findWorkAddress2(String username)
	{
		return Math.random() > 0.5 ? Optional.of(username + "'s Home") : Optional.empty();
	}

	private static Optional<String> findHomeAddress(String username)
	{
		return Math.random() > 0.5 ? Optional.of(username + "'s Home") : Optional.empty();
	}
}
