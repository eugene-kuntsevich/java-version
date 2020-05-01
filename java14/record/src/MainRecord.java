public class MainRecord
{
	public static void main(String[] args)
	{
		var point = new Point(1, 2);
		System.out.println(point);
		System.out.println("hashCode = " + point.hashCode());

		var point2 = new Point(1, 2);
		System.out.println(point2);
		System.out.println("hashCode = " + point2.hashCode());

		System.out.println(point.equals(point2));
		System.out.println(point2.getString());
	}

	record Point(float x, float y)
	{
		public String getString()
		{
			return "String";
		}
	}
}
