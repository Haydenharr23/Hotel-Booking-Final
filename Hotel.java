import java.util.LinkedList;


/**
 * Hayden Harris - hcharris
 * CIS152
 * Apr 25, 2022
 */
public class Hotel {
		 
	    String hotelName;
	    int roomId;
	    int hotelID;
	    
	 
	    // hotel contains the list of rooms
	    LinkedList<Room> rooms;
	    double rating;
	    
	    //making an object that sorts my linked list of hotels
	   public static LinkedListInsert sortRatings = new LinkedListInsert();
	    
	    public Hotel() {
	    	
	    }
	    
	    //hotel constructor
	    public Hotel(String hn, double r, int hID) {
	    	
	    	
	    	hotelName = hn;
	    	rating = r;
	    	hotelID = hID;
	    	
	    	//pushing hotels into method to then sort
	    	sortRatings.push(rating, hotelID, hotelName);
	    	
	    }
	    
	    public String getHotel() {
	    	return hotelName;
	    }
	    
	   
	    public LinkedListInsert getList() {
	    	//initiates sorting + returns list after sorted
	    	sortRatings.insertionSort(sortRatings.head);
			return sortRatings;
	    	
	    }
	    
	    public void printHotelList() {
	    	System.out.println(this.hotelName + ":  Rating: " + this.rating);
	    }
	}

