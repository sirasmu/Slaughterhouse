package common.model;
import java.io.Serializable;
import java.util.UUID;

public class SlaughterhouseUtilities implements Serializable
{
	public static String generateId()
	{
		return UUID.randomUUID().toString();
	}
}
