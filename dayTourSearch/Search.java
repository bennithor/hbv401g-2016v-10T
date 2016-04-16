package dayTourSearch;


import dayTourSearch.data.DataBaseHandler;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Orn
 */
public class Search {
    DataBaseHandler dataBase = new DataBaseHandler();
    DayTours[] dayTours = dataBase.getDayTours();
    DayTours[] searchResults;
    int numberOfDayTours = dayTours.length;
    
    public Search(){
    }
    
    public Search(DayTours[] dayTours){
        this.dayTours = dayTours;
    }
    //Search by price
    public DayTours[] searchDayTours( int parameter1, int parameter2){
        for(int i = 0; i< numberOfDayTours;i++){
            if(dayTours[i].getPrice() >= parameter1 && dayTours[i].getPrice() <= parameter2){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
        }
        return searchResults;
    }
    //Searches by ageRestriction
    public DayTours[] searchDayTours(String sortBy, int ageRestriction){
        for(int i = 0; i< numberOfDayTours;i++){
            if(dayTours[i].getAgeRestriction() <= ageRestriction){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
        }
        return searchResults;
    }
    //Search by location
    public DayTours[] searchDayTours(String something, String location){
        for(int i = 0; i< numberOfDayTours;i++){
            if(dayTours[i].getLocation() == location){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
        }
        return searchResults;
    }
    //Search by stars
    public DayTours[] searchDayTours(double minimumStarRating){
        for(int i = 0; i< numberOfDayTours;i++){
            if(dayTours[i].getStars() >= minimumStarRating){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
        }
        return searchResults;
    }
    //Search by departure Time
    public DayTours[] searchDayTours(String startingTime){
        for(int i = 0; i< numberOfDayTours;i++){
            String time = dayTours[i].getDepartureTime();
            int hour1 = Integer.parseInt(time.substring(0, 2));
            int minute1 = Integer.parseInt(time.substring(3, 5));
            int hour2 = Integer.parseInt(startingTime.substring(0, 2));
            int minute2 = Integer.parseInt(startingTime.substring(3, 5));
            System.out.println("hour1: "+hour1+", minute1: " +minute1+", hour2: "+hour2+", minute2: " +minute2);
            if(hour1 > hour2){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
            else if(hour1 == hour2 && minute1 >= minute2){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
        }
        return searchResults;
    }

    //Search by if hotelpickup is available
    public DayTours[] searchDayTours(boolean hotelPickupAvailable){
        for(int i = 0; i< numberOfDayTours;i++){
            if(dayTours[i].isHotelPickupAvailable() == hotelPickupAvailable){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
        }
        return searchResults;
    }
    
    //Search by seats Available
    public DayTours[] searchDayTours(int seatsAvailable){
        for(int i = 0; i< numberOfDayTours;i++){
            if(dayTours[i].getSeatsAvailable() >= seatsAvailable){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
        }
        return searchResults;
    }
    //Search by days of Week
    public DayTours[] searchDayTours(boolean[] daysOfWeek){
        for(int i = 0; i< numberOfDayTours;i++){
            boolean[] daysAvailable = dayTours[i].getDaysOfWeek();
            boolean constant = false;
            for(int j = 0; j < 7;j++){
                if(daysOfWeek[j] == true && daysAvailable[j] == true ){
                    constant = true;
                }     
            }
            if(constant){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
        }
        return searchResults;
    }
   
    
}
