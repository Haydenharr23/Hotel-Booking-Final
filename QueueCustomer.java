import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Hayden Harris - hcharris
 * CIS152
 * Apr 26, 2022
 */
//using java's default library "interface" for a queue based on a linked list
public class QueueCustomer {
	Queue<String> q = new LinkedList<>();
	String hasHotel;
	String hasName;
	int hasRoom;
	LocalDate hasDate;
	public void addCustomer(Customer c) {
		
		 hasHotel = c.getHotel();
		 hasName = c.getName();
	 	 hasRoom = c.getRoom();
	 	 hasDate = c.getDate();
	 	 
	 	//using customer information and adding it to queue
	 	q.add(hasName + " is staying in " + hasHotel + " on " + hasDate); 
	 	 
	}
	
	public void displayQueue() {
			
		
			System.out.println(q);
				
		
	}
}
