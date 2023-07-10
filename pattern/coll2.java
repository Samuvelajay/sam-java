package pattern;

import java.util.ArrayList;

public class coll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>al=new ArrayList<Integer>();
al.add(5);
al.add(4);
al.add(5);
al.add(8);
int a[]=new int[al.size()];
for(int i=0;i<a.length;i++) {
	a[i]=al.get(i);
	System.out.print(a[i]);
}
	}

}
