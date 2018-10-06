package Strings;

public class emp2 extends emp1{
	public void m2(int a,int b){
		int i=a*b;
		System.out.println(i);
	}
	/*public void m1(int a,int b){
		int i=a+b;
		System.out.println(i);
	}*/
	
	public static void main(String[] args) {
		emp1 e2=new emp2();
		e2.m1(3,2);
		//e2.m2(5,4);
	}
}
