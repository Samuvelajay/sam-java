package string;

public class repuletano {

	public static void main(String[] args) {
    int a[]= {3,5,2,5,4,1};
    for(int i=0;i<=a.length;i++) {
    	for(int j=i+1;i<=a.length;j++) {
    		if(a[i]==a[j]) {
    			a[j]=0;
    		}
    	}
    }
   for(int j=0;j<=a.length;j++) {
	   System.out.println(a[j]);
   }

	}

}
