import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

/**
 * Hayden Harris - hcharris
 * CIS152
 * Apr 28, 2022
 */
class Testing {

	
	@Test
	//testing my Queue
	void testQueue() {
		QueueCustomer queue = new QueueCustomer();
		
		
		String stay = "2023-01-01";
		String leave = "2023-02-01";
				LocalDate bookStay = LocalDate.parse(stay);
		LocalDate bookLeave = LocalDate.parse(leave);
		Room One = new Room("Hilton", "Single", 1, 1);
		Customer customer = new Customer("bob", bookStay, bookLeave, One);
		
		queue.addCustomer(customer);
		queue.displayQueue();
		assertEquals(queue.displayQueue(),queue.displayQueue());
	}
	
	@Test	
	//testing my hotel class and retrieving information
	void testHotel() {
		
		Hotel a = new Hotel("hotelly",5,2);
		LinkedListInsert list2 = a.getList();
		
		assertEquals(a.getHotel(),"hotelly");
	}
	@Test
	//testing my room class and retrieving info
	void testRoom() {
		
		Room room = new Room("HotelRoom","Single",3,4);
		
		room.Availability();
		assertTrue(room.Availability());
	}
	
	@Test
	//testing my Customer class and retrieving info
	void testCustomer() {
		String stay = "2023-01-01";
		String leave = "2023-02-01";
				LocalDate bookStay = LocalDate.parse(stay);
		LocalDate bookLeave = LocalDate.parse(leave);
		Room One = new Room("Hilton", "Single", 1, 1);
	Customer cust = new Customer("bobby",bookStay,bookLeave,One);	
	
	assertEquals(bookStay,cust.getDate());
	}
	
	
	@Test
	//testing linked list class
	void testLinkedList() {
		Hotel test = new Hotel("beans",5,1);
		LinkedListInsert list = test.getList();
		// list.printlist(list.head);
		//assertEquals("beans",list.getHotelName());
		
	}
	

}
