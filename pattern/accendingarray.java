package pattern;

public class accendingarray {

	public static void main(String[] args) {
		int a[]= {3,5,3,56,86,8,9,6,2};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				
			
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}

	}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
}
}
