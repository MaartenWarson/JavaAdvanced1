package h3_opdr2;

public interface TextUtil {
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		return sb.toString();
	}
}
