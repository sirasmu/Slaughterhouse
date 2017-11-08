package model;
import java.util.UUID;

public class SlaughterhouseUtilities
{
	public static String generateId()
	{
		return UUID.randomUUID().toString();
	}
}
