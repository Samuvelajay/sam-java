package pattern;

public class dupicatearray {

	public static void main(String[] args) {
		int a[]= {2,4,5,3,2,5};
		for(int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}

	}

}
