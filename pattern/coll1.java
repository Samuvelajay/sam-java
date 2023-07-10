package pattern;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class coll1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>al=new ArrayList<Integer>();
al.add(5);
al.add(4);
al.add(7);
al.add(5);
al.add(7);
LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
lhs.addAll(al);
System.out.print(lhs);

	}

}
