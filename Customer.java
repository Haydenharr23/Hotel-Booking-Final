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
	

	
	public Customer(String n, LocalDate f, LocalDate to, Room r) {
		super();
		
		name = n;
		from = f;	
		this.to = to;
		this.hotelName = r.getHotel();
		this.roomNum = r.getRoom();
		
	}
	
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
	
	public String displayCus() {
		//System.out.println(name + " is staying in " + hotelName + " Hotel in room " + roomNum + " on " + from);
		return name + " is staying in " + hotelName + " Hotel in room " + roomNum + " on " + from;
	}
	
	
	
}
