package Strings;

public class sampleSplit {
	static String w1="Sai is a good boy";
	public static void main(String[] args) {
		String[] s1=w1.split("\\s");
		System.out.println(s1.length);
		for(String w: s1){
			System.out.println(w);
		}

	}

}
