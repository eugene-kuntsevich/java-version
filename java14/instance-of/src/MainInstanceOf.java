
public class MainInstanceOf
{
	public static void main(String[] args)
	{
		Object object = new Violin();

		if (object instanceof Instrument instrument)
		{
			System.out.println(instrument.getMaster());
		}
	}

	record Violin() implements Instrument
	{
		@Override
		public String getMaster()
		{
			return "Master";
		}
	}
}
