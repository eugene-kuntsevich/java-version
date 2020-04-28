import java.util.stream.Stream;

public class MainString
{
	public static void main(String[] args)
	{
		//String.isBlank()
		String blank = "";
		String spaces = "  ";
		String notBlank = "1";
		System.out.println(blank.isBlank());
		System.out.println(spaces.isBlank());
		System.out.println(notBlank.isBlank());

		//String.lines()
		String str = "\n A \n B \n C \n D";
		Stream<String> lines = str.lines();
		lines.forEach(System.out::println);

		//String.repeat()
		String strRepeat = "Abc";
		System.out.println(strRepeat.repeat(3));// AbcAbcAbc

		//String.strip(), String.stripLeading(), String.stripTrainling()
		String strStrip = "  Hello World !!   ";
		System.out.println( strStrip.strip() );          //"Hello World !!"
		System.out.println( strStrip.stripLeading() );   //"Hello World !!   "
		System.out.println( strStrip.stripTrailing() );  //"  Hello World !!"
	}
}
