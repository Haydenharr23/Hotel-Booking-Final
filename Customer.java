import java.time.LocalDate;


/**
 * Hayden Harris - hcharris
 * CIS152
 * Apr 26, 2022
 */
public class Customer extends Room {

	String name;
	String hotelID;
	String hotelName;
	int roomNum;
	
	LocalDate from;
	LocalDate to;
	

	//customer constructor
	public Customer(String n, LocalDate f, LocalDate to, Room r) {
		super();
		
		name = n;
		from = f;	
		this.to = to;
		this.hotelName = r.getHotel();
		this.roomNum = r.getRoom();
		
	}
	
	//methods to get attributes.
	public String getName() {
		return name;
	}
	
	public String getHotel() {
		return hotelName;
	}
	public int getRoom() {
		return roomNum;
	}
	public LocalDate getDate() {
		return from;
	}
	
	//this method displays information regarding the customers stay in a hotel
	public String displayCus() {
		
		return name + " is staying in " + hotelName + " Hotel in room " + roomNum + " on " + from;
	}
	
	
	
}
