
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Hayden Harris - hcharris
 * CIS152
 * Apr 25, 2022
 */
public class Room extends Hotel{
	
		int numGuests;
		int roomID;
		int hotelID;
		String type;
		Boolean bookingStatus = true;
		LocalDate stay;
		LocalDate leave;
		
		public Queue<Customer> q = new LinkedList<>();
		
		public Room()
		{
			super();
		}
		//constructor for room
		public Room(String hn, String type, int roomID, int hotelID) {
			super();
			hotelName=hn;
			this.type=type;
			this.roomID=roomID;
			this.hotelID=hotelID;
		}
		public String getHotel() {
			return hotelName;
		}
		
		public int getRoom() {
			return roomID;
		}
		
		public Boolean Availability() {
			return bookingStatus;
		}
		//method for booking customers to a room  based on the time
		public void Booking(LocalDate from, LocalDate to){
			this.stay=from;
			this.leave=to;
			
			System.out.println("You have Successfully Booked a " + type + " room at " + hotelName + " hotel.");
			System.out.println(" Your room number is " + this.roomID + ". Check in at the front desk on " + from);
			
			
			bookingStatus=false;
		}
		
		
	}
	
