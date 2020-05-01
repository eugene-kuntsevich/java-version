import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.SUNDAY;
import static java.util.Calendar.THURSDAY;
import static java.util.Calendar.TUESDAY;
import static java.util.Calendar.WEDNESDAY;

//работает только с java 14
//switch умеет возвращать значения и использует yield
public class MainSwitchReturn
{
	public static void main(String[] args)
	{
		int day = MONDAY;
		int numberOfLetters = switch (day)
			{
				case MONDAY, FRIDAY, SUNDAY -> 6;
				case TUESDAY -> 7;
				case THURSDAY, SATURDAY -> 8;
				case WEDNESDAY -> 9;
				default -> throw new IllegalStateException("Huh?: " + day);
			};
		System.out.println("Returned number " + numberOfLetters);

		int numberOfLetters2 = switch (day)
			{
				case MONDAY:
				case FRIDAY:
				case SUNDAY:
					yield 6;
				case TUESDAY:
					yield 7;
				case THURSDAY:
				case SATURDAY:
					yield 8;
				case WEDNESDAY:
					yield 9;
				default:
					throw new IllegalStateException("Huh?: " + day);
			};
		System.out.println("Returned number " + numberOfLetters2);

	}
}
