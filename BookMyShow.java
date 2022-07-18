/**
 * BookMyShow
 */
public class BookMyShow {

    List<Cinema> cinema_list;
    public List<Cinema> getCinemaList(String city, Movie movie);
    public List<Movie> getMovieList(String city);
}

public class Cinema {

    int cinID;
    String cinemaName;
    Address addressObj;
    List<Show> show_list;
    List<Audis> audi_list;

	public Map<Date, Show> getShows(List<Date> dateList);
    
}

public class Show {

    int show_id;
    Time timeObj;
    Movie movieObj;
    Audis audiObj;
    List<Seats> list_seats;

    // void show_seats(List<Seats> list_seats);
}

public class Seats {

    String seatType;
    double price;
    Status statusObj;
    
}
public enum Status {
    OCCUPIED,VACANT;
}

public class User{

    int user_id;
    Search searchObj;
}

public class Search {

    public List<Movie> searchMoviesByNames(String movieName);
    public List<Movie> searchMoviesByNames(String city);
    public List<Movie> searchMoviesByNames(String genre);
    public List<Movie> searchMoviesByNames(String cinemaName);

}

public class Member extends User{

    Account accObj;
    public List<Booking> getBooking(Show showObj, Account accObj);
    public Booking doBooking(Show showObj, Account accObj);

}
public class Guest extends User{
    
    public boolean makeAccount(Account accObj);
}
public class Booking{

    Show showObj;
    Date dateOfShow;
    double bookingAmount;
    List<Seats> list_seats;
    BookingStatus status;
    public boolean makePayment(Booking bookObj);

}
public enum BookingStatus{
    CONFIRMED, IN_PROGRESS, CANCELLED;
}


