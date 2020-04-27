
public interface Human1
{
	default void walk()
	{
		System.out.println("Ну, я пошел...");
	}

	default void run()
	{
		System.out.println("Ну, я побежал...");
	}
}
