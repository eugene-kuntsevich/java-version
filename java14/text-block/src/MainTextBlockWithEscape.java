//поддерживается только как превью фича java 14. Впервые появилась как превью фича в java 13. В текущей версии добавились
//символ продолжения строки \ и символ пробела (single space) \s.
public class MainTextBlockWithEscape
{
	static String TEXT = """
		This is major Tom to Ground Control \
		I am stepping through the door...
		Wait… What???
		""";
	//text1 и text2 — идентичны.
	static String TEXT1 = """
		line1
		line2\s\s
		line3
		""";

	String text2 = "line1\nline2 \nline3\n";

	public static void main(String[] args)
	{
		System.out.println(TEXT);
		System.out.println(TEXT1);
	}
}
