package utils;

public class ConvertId {
	public static int convert(String id) {
		if (id == null || id.length() < 2) {
            throw new IllegalArgumentException("id invalide");
        }
		return Integer.parseInt(id.substring(2));
	}
}
