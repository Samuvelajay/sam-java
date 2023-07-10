package busrev;

import java.util.Scanner;
import java.util.ArrayList;
public class busdemo {

	public static void main(String[] args) {
		ArrayList<bus>buses=new ArrayList<bus>();
		ArrayList<booking>bookings=new ArrayList<booking>();
		buses.add(new bus(1,true,2));
		buses.add(new bus(2,false,45));
		buses.add(new bus(3,true,50));
	int useropt = 1;
	Scanner sc=new Scanner(System.in);
	for(bus b:buses) {
		b.displayBusinfo();
	}
	while(useropt==1) {
		System.out.println("enter 1 is booking and enter 2 is exit");
		useropt=sc.nextInt();
		if(useropt==1) {
			booking Booking=new booking();
			if(Booking.isAvailable(bookings,buses)) {
			bookings.add(Booking);
			System.out.println("your booking is sucuues");
			}
			else {
				System.out.println("sorry bus is full, try another busno or date");
			}
		}
	}

	}

}
