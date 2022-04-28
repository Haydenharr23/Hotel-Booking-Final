import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


/**
 * Hayden Harris - hcharris
 * CIS152
 * Apr 6, 2022
 */
public class Driver {
	 

	
	
	public static void main(String[] args) {
		
		//making multiple hotels to be displayed and stored
		Hotel a = new Hotel("Hilton", 4.3,1);
		Hotel b = new Hotel("Ramada",3.8,2);	
		Hotel c = new Hotel("Hampton Inn",4.5,3);	
		Hotel d = new Hotel("Des Lux Hotel",4.6,4);
		Hotel e = new Hotel("Sheraton",4.1,5);
		
		//making rooms to go in hotel
		Room One = new Room("Hilton", "Single", 1, 1);
		Room Two = new Room("Hilton", "Double", 2, 1);
		Room Three = new Room("Hilton", "Triple", 3, 1);
		Room Quad = new Room("Hilton", "Quad", 4, 1);
		
		Room Four = new Room("Ramada", "Single", 1, 2);
		Room FiveA = new Room("Ramada", "Double",2, 2);
		Room FiveB = new Room("Ramada", "Triple",3, 2);
		Room FiveC = new Room("Ramada", "Quad",4, 2);
		
		Room Six = new Room("Hampton Inn", "Single", 1, 3);
		Room Seven = new Room("Hampton Inn", "Double", 2, 3);
		Room Eight = new Room("Hampton Inn", "Triple", 3, 3);
		Room EightA = new Room("Hampton Inn", "Quad", 4, 3);
		
		Room Nine = new Room("Des Lux", "Single", 1, 4);
		Room Ten = new Room("Des Lux", "Double", 2, 4);
		Room Eleven = new Room("Des Lux", "Triple", 3, 4);
		Room Twelve = new Room("Des Lux", "Quad", 4, 4);
		
		Room TwelveA = new Room("Sheraton", "Single", 1, 5);
		Room TwelveB = new Room("Sheraton", "Double", 2, 5);
		Room TwelveC = new Room("Sheraton", "Triple", 3, 5);
		Room TwelveD = new Room("Sheraton", "Quad", 4, 5);
		
		
		
		LocalDate holdDate = LocalDate.parse("2022-05-12");
		LocalDate holdDate2 = LocalDate.parse("2022-05-13");
		
		QueueCustomer x = new QueueCustomer();
		
		//creating a sample customer to display later
		Customer takeRoom = new Customer("Roger", holdDate, holdDate2, TwelveB);

		
	
		
		
		Scanner in = new Scanner(System.in);
		int beans = 1;
		while(beans != 0) {
			
		x.addCustomer(takeRoom);
			
		//getting information from user
		System.out.println("Please enter first name");
		String fn = in.next();

		
		System.out.println("Choose from the following options. (1-5)");

	LinkedListInsert list = d.getList();
		list.printlist(list.head);
		
		int selectHotel = in.nextInt();		
		
		System.out.println("Choose from the following options. (1-4)");
		System.out.println("1 - Single");
		System.out.println("2 - Double");
		System.out.println("3 - Triple");
		System.out.println("4 - Quad");
		
		int selectRoom = in.nextInt();	
		
		System.out.println("Enter Date of first day you want to stay. (yyyy-mm-dd)");
		String stay = in.next();
		
		
		System.out.println("Enter Date of day you expect to leave. (yyyy-mm-dd)");
		String leave = in.next();
		
		//turning date strings into LocalDate to be used in objects
		LocalDate bookStay = LocalDate.parse(stay);
		LocalDate bookLeave = LocalDate.parse(leave);
		
	
		
		//switch statements book and create customers depending on what they selected
		//then customers get added to queue
		switch (selectHotel) {
		
		case 1:
			switch (selectRoom) {
			
			case 1:
				if(Nine.Availability()==true) {
					Nine.Booking(bookStay, bookLeave);
					Customer cus = new Customer(fn, bookStay, bookLeave, Nine);
					x.addCustomer(cus);
				} else {
					beans=0;
				}
				
			
				break;
			case 2:
				
				if(Ten.Availability()==true) {
				
					Ten.Booking(bookStay, bookLeave);
					Customer cus1 = new Customer(fn, bookStay, bookLeave, Ten);
					x.addCustomer(cus1);
				}
				else { beans=0;}
				
				break;
			case 3:
				if(Eleven.Availability()==true) {
					
				
				Eleven.Booking(bookStay, bookLeave);
				Customer cus2 = new Customer(fn, bookStay, bookLeave, Eleven);
				x.addCustomer(cus2);
				} else {
					beans=0;
				}
				break;
			case 4:
				if(Twelve.Availability()==true) {
				Twelve.Booking(bookStay, bookLeave);
				Customer cus3 = new Customer(fn, bookStay, bookLeave, Twelve);
				x.addCustomer(cus3);
				} else {
					beans=0;
				}
				break; 
			}
			break;
			case 2:
			switch (selectRoom) {
			
			case 1:
				if(Six.Availability()==true) {
					
				
				Six.Booking(bookStay, bookLeave);
				Customer cus4 = new Customer(fn, bookStay, bookLeave, Six);
				x.addCustomer(cus4);
				}
				else {
					beans=0;
				}
				break;
			case 2:
				if(Seven.Availability()==true) {
				Seven.Booking(bookStay, bookLeave);
				Customer cus5 = new Customer(fn, bookStay, bookLeave, Seven);
				x.addCustomer(cus5);
				} else { 
					beans=0;
				}
				break;
			case 3:
				if(Eight.Availability()==true) {
				Eight.Booking(bookStay, bookLeave);
				Customer cus6 = new Customer(fn, bookStay, bookLeave, Eight);
				x.addCustomer(cus6);
				} else {
					beans=0;
				}
				break;
			case 4:
				if(EightA.Availability()==true) {
				EightA.Booking(bookStay, bookLeave);
				Customer cus7 = new Customer(fn, bookStay, bookLeave, EightA);
				x.addCustomer(cus7);
				} else {
					beans=0;
				}
				break;
			}
			break;
		case 3:
			switch (selectRoom) {
			
			case 1:
				if(One.Availability()==true) {
				One.Booking(bookStay, bookLeave);
				Customer cus8 = new Customer(fn, bookStay, bookLeave, One);
				x.addCustomer(cus8);
				} else {
					beans=0;
				}
				break;
			case 2:
				if(Two.Availability()==true) {
				Two.Booking(bookStay, bookLeave);
				Customer cus9 = new Customer(fn, bookStay, bookLeave, Two);
				x.addCustomer(cus9);
				} else {
					beans=0;
				}
				
				break;
			case 3:
				if(Three.Availability()==true) {
				Three.Booking(bookStay, bookLeave);
				Customer cus10 = new Customer(fn, bookStay, bookLeave, Three);
				x.addCustomer(cus10);
				} else {
					beans = 0;
				}
				break;
			case 4:
				if(Quad.Availability()==true) {
				Quad.Booking(bookStay, bookLeave);
				Customer cus11 = new Customer(fn, bookStay, bookLeave, Quad);
				x.addCustomer(cus11);
				} else {
					beans = 0;
				}
				break;
			}
			break;
		case 4:
			switch (selectRoom) {
			
			case 1:
				if(TwelveA.Availability()==true) {
				TwelveA.Booking(bookStay, bookLeave);
				Customer cus12 = new Customer(fn, bookStay, bookLeave, TwelveA);
				x.addCustomer(cus12);
				} else {
					beans=0;
				}
				break;
			case 2:
				if (TwelveB.Availability()==true) {
				TwelveB.Booking(bookStay, bookLeave);
				Customer cus13 = new Customer(fn, bookStay, bookLeave, TwelveB);
				x.addCustomer(cus13);
				} else {
					beans=0;
				}
				break;
			case 3:
				if(TwelveC.Availability()==true) {
				TwelveC.Booking(bookStay, bookLeave);
				Customer cus14 = new Customer(fn, bookStay, bookLeave,TwelveC);
				x.addCustomer(cus14);
				} else {
					beans=0;
				}
				break;
			case 4:
				if(TwelveD.Availability()==true) {
				TwelveD.Booking(bookStay, bookLeave);
				Customer cus15 = new Customer(fn, bookStay, bookLeave, TwelveD);
				x.addCustomer(cus15);
				} else {
					beans=0;
				}
				break;
			}
			break;
		case 5:
			switch (selectRoom) {
			
			case 1:
				if(Four.Availability()==true) {
				Four.Booking(bookStay, bookLeave);
				Customer cus16 = new Customer(fn, bookStay, bookLeave,Four);
				x.addCustomer(cus16);
				} else {
					beans=0;
				}
				break;
			case 2:
				if(FiveA.Availability()==true) {
					
				
				FiveA.Booking(bookStay, bookLeave);
				Customer cus17 = new Customer(fn, bookStay, bookLeave, FiveA);
				x.addCustomer(cus17);
				} else {
					beans=0;
				}
				break;
			case 3:
				if(FiveB.Availability()==true) {
				FiveB.Booking(bookStay, bookLeave);
				Customer cus18 = new Customer(fn, bookStay, bookLeave, FiveB);
				x.addCustomer(cus18);
				} else {
					beans=0;
				}
				break;
			case 4:
				if(FiveC.Availability()==true) {
				FiveC.Booking(bookStay, bookLeave);
				Customer cus19 = new Customer(fn, bookStay, bookLeave, FiveC);
				x.addCustomer(cus19);
				} else {
					beans = 0;
				}
				break;
			}
			break;
			
		
		}
		
		System.out.println("-------------");
		
		System.out.println("Displaying results..");
		//display queued customers
		x.displayQueue();
		
		
		}
		
		

	}

	}

