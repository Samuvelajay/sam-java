 package string;

public class countchar {

	public static void main(String[] args) {
		String s="the boys";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
			System.out.println(count);
		

	}

}
