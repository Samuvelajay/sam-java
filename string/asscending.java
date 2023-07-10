package string;

public class asscending {

	public static void main(String[] args) {
	int a[]= {5,6,3,7,8,1};
     for(int i=0;i<=a.length;i++) {
    	 for(int j=i+1;i<=a.length;j++) {
    		 if(a[i]>a[j]) {
    			 int temp=a[i];
    			 a[i]=a[j];
    			 a[j]=a[i];
    		 }
    	 }
     }
     for(int i=0;i<a.length;i++) {
    	 System.out.print(a[i]);
     }
	}

}
