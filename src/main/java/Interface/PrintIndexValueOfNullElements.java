package Interface;

public class PrintIndexValueOfNullElements {

	public static void main(String[] args) {
		String[] s=new String[5];
		//By default value of string is null stored in the elements
		s[0]="sai";
		s[2]="srinu";
		s[4]="arvind";
		for(int i=0;i<s.length;i++){
			if(s[i]==null){
				System.out.println("index of null elemnts: "+i);
			}
		}
	}

}
