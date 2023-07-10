package busrev;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class booking {
	String passengername;
	int busno;
	Date date;
	booking (){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter passagername: ");
		passengername=sc.next();
		System.out.println("enter bus number: ");
		busno=sc.nextInt();
		System.out.println("enter date dd-mm-yy: ");
		String dateInput=sc.next();
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<booking> bookings,ArrayList<bus> buses) 
	{
		int capacity=0;
		for (bus Bus:buses) {
			if(Bus.getBusno()== busno) {
				capacity=Bus.getCapacity();
			}
			int booked=0;
			for(booking b:bookings) {
				
				if(b.busno==busno && b.date.equals(date)) {
				booked++;	
				}
			}
			int booked=0;
			return booked<capacity?true:false;
		}
	}
}


