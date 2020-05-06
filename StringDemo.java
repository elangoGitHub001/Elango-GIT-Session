package java1;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="java";
		
		String s2=new String("java");
		System.out.println(s2);		

		//Concatenatting
		s2=s2+" tutorial";		
		System.out.println(s2);
		
		int len=s1.length();
		System.out.println(len);
			
		s1= s1.concat("tutorial");	
		
	}

}
