package sub08;

public class test02 {
	public static void main(String[] args) {
		
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println("str 역순 : " + reverseStr(str1));
		System.out.println("str 역순 : " + reverseStr(str2));
	}
	
	public static String reverseStr(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=str.length()-1 ; 1>=0 ; i--) {
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
		
		
	}

}
