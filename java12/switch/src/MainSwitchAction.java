import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.SUNDAY;
import static java.util.Calendar.THURSDAY;
import static java.util.Calendar.TUESDAY;
import static java.util.Calendar.WEDNESDAY;

//switch может использовать несколько переменных (напрмиер, MONDAY, FRIDAY, SUNDAY) и выполнять действие справа от '->'
public class MainSwitchAction
{
	public static void main(String[] args)
	{
		int day = MONDAY;
		switch (day) {
			case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
			case TUESDAY                -> System.out.println(7);
			case THURSDAY, SATURDAY     -> System.out.println(8);
			case WEDNESDAY              -> System.out.println(9);
		}
	}
}
