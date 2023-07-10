package pattern;

public class largestnum {

	public static void main(String[] args) {
		int a[]= {2,4,4,2,5,5,8,5,9,4,3,8};
		int f=0;
		int s=0;
      for(int i=0;i<a.length;i++) {
    	  if(a[i]>f) {
    		  s=f;
    		  f=a[i];
    	  }
    	  else if(a[i]>s){
    		  s=a[i];
    	  }
      }
      System.out.println("frist max "+f);
      System.out.println("second max "+s);
	}

}
