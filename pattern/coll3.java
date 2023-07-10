package pattern;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class coll3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={5,4,6,7,3,7};
LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
for(int i=0;i<a.length;i++)
{
	lhs.add(a[i]);
}
System.out.println(lhs);

}
}
