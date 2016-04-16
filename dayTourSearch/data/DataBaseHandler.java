package dayTourSearch.data;


import dayTourSearch.DayTours;
import dayTourSearch.Review;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Orn
 */
public class DataBaseHandler {
    private DayTours[] dayTours;
    private DayTours dayTour;
    private DayTourGogn gogn;
    private String[][] data;
    private int index;
    private int idCounter;
    
    
    public DataBaseHandler(){
        index = 0;
        idCounter = 1;
        gogn = new DayTourGogn();
        data = gogn.getData();
       
        for(int i = 0; i < data.length;i++){
            boolean[] daysAvailable = new boolean[7];
            for(int j = 0; j < 7;j++){
                if(data[i][6].substring(j,j+1).compareTo("1") == 0){
                    daysAvailable[j] = true;
                }
            }
            addDayTour(data[i][0],data[i][1],Integer.parseInt(data[i][2]),Integer.parseInt(data[i][3]),
                    data[i][4], data[i][5],daysAvailable,Boolean.parseBoolean(data[i][7]),Float.parseFloat(data[i][8]),data[i][9],
                    Float.parseFloat(data[i][10]),data[i][11]);
        }

    }
    
    public DayTours[] getDayTours(){
        return dayTours;
    }
    
    public void addDayTour(String name, String description, int price,
        int ageRestriction, String departureTime, String duration, boolean[] daysOfWeek,
        boolean hotelPickupAvailable,float ratioOfSeatsSold, String date, float stars,
        String location){
        dayTour = new DayTours(name,description,price, ageRestriction, departureTime, duration,
                daysOfWeek, hotelPickupAvailable, ratioOfSeatsSold, date, stars, location,idCounter++);
        dayTours = ArrayUtils.add(dayTours, dayTour);
    }
    
    public void removeDayTour(DayTours dayTour){
        index = ArrayUtils.indexOf(dayTours, dayTour);
        if(index>=0){
            dayTours = ArrayUtils.remove(dayTours, index);
        }
    }
    
    public int getNumberOfDayTours(){
        return dayTours.length;
    }
    
    public DayTours getTourWithID(int ID){
        for(int i = 0; i< dayTours.length; i++){
            if(dayTours[i].getID() == ID){
                return dayTours[i];
            }
        }
        return null;
    }
    
    public void addReview(String legend, String owner, String content, double stars, 
            String date, int dayTourID){
    }
    
    public void removeReview(int ID){
        
    }
    
    public Review getReview(){
        return null;
    }
    
    
}
