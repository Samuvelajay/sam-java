package pattern;
import java.io.FileWriter;
public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
FlieWriter fw=new FlieWriter("C:\\Users\\ASUS\\sam.txt");
fw.write("my frist file in java");
fw.flush();
fw.close();
System.out.print("succcessfully writter");
	}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
