import java.util.ArrayList;

public class MainVar
{
	public static void main(String[] args)
	{
		var list = new ArrayList<String>();  //перед нами ArrayList<String>
		list.add("1");
		list.forEach(System.out::println);
	}
}
