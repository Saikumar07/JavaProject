package Interface;

public class PrintNullValuesUsingArray {

	public static void main(String[] args) {
		String[] s=new String[5];
		//By default value of string is null stored in the elements
		s[0]="sai";
		s[2]="srinu";
		s[4]="arvind";
		for(Object o: s){
			//Instanceof is used check data type
			if(o instanceof String){
				//create type casting of the class
				String ss=(String)o;
				System.out.println(ss);
			}
			if(o==null){
				System.out.println(o);
			}
		}
		
	}

}
