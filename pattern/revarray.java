package pattern;

public class revarray {
public static void main(String args[]) {
	int a[]= {4,3,5,6,4};
	for(int i=0;i<a.length;i++) {
		System.out.print(+a[i]+" ");
		
	}
	System.out.println();
	for(int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
}
}
