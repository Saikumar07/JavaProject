package Strings;

public class example {
	int rollno;
	String name;
	static int sno;
	static String sname;
	static String collage="SSB";
	
	void display(int r,String n){
		rollno=r;
		name=n;
		System.out.println(rollno+" "+name+" "+collage);
		//example.display1(05, "gfhgfgh");
	}
	
	static void display1(int r,String n){
		sno=r;
		sname=n;
		System.out.println(sno+" "+sname+" "+collage);
	} 
	
	public static void main(String[] args) {
		example e1=new example();
		e1.display(01, "Kishore");
		e1.display(02, "sai");
		display1(21, "krishna");
		display1(22, "hgfg");
	}
		

}
