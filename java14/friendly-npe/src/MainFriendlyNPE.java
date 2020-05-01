//не смог воспроизвести на java 14.0.1
public class MainFriendlyNPE
{
	public static void main(String[] args)
	{
		Point point = null;
		System.out.println(point.getY());
	}

	static class Point
	{
		private Integer y;

		public Point()
		{
		}

		public Integer getY()
		{
			return y;
		}
	}
}
