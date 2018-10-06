package Strings;

public class stringCharAt {
	public static String name="saikumar";

	public static void main(String[] args) {
		char[] c=name.toCharArray();
		System.out.println(c.length);
		int size=c.length;
		for(int i=size-1;i>=0;i--){
			System.out.println(c[i]);
		}
	}

}
