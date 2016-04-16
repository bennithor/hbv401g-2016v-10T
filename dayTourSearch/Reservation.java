package dayTourSearch;
/*
**
*
* @author Orn
*/
class Reservation {
   
   private String buyerName;
   private int tourID;
   private int nrOfAdults;
   private int nrOfChildren;
   private String nameOfTour;
   private boolean hotelPickupRequested;
   private String hotelLocation;

   Reservation(DayTours chosenTour, String buyerName, int adults, int children, boolean hotelPickupRequested, String hotelLocation) {
       this.buyerName = buyerName;
       this.tourID = chosenTour.getID();
       this.nameOfTour = chosenTour.getName();
       this.nrOfAdults = adults;
       this.nrOfChildren = children;
       this.hotelPickupRequested = hotelPickupRequested;
       this.hotelLocation = hotelLocation;
   }

   /**
    * @return the name
    */
   public String getBuyerName() {
       return buyerName;
   }

   /**
    * @param name the name to set
    */
   public void setName(String buyerName) {
       this.buyerName = buyerName;
   }

   /**
    * @return the nrOfAdults
    */
   public int getNrOfAdults() {
       return nrOfAdults;
   }

   /**
    * @param nrOfAdults the nrOfAdults to set
    */
   public void setNrOfAdults(int nrOfAdults) {
       this.nrOfAdults = nrOfAdults;
   }

   /**
    * @return the nrOfChildren
    */
   public int getNrOfChildren() {
       return nrOfChildren;
   }

   /**
    * @param nrOfChildren the nrOfChildren to set
    */
   public void setNrOfChildren(int nrOfChildren) {
       this.nrOfChildren = nrOfChildren;
   }

   /**
    * @return the nameOfTour
    */
   public String getNameOfTour() {
       return nameOfTour;
   }

   /**
    * @param nameOfTour the nameOfTour to set
    */
   public void setNameOfTour(String nameOfTour) {
       this.nameOfTour = nameOfTour;
   }

   /**
    * @return the hotelPickupRequested
    */
   public boolean isHotelPickupRequested() {
       return hotelPickupRequested;
   }

   /**
    * @param hotelPickupRequested the hotelPickupRequested to set
    */
   public void setHotelPickupRequested(boolean hotelPickupRequested) {
       this.hotelPickupRequested = hotelPickupRequested;
   }

   /**
    * @return the hotelLocation
    */
   public String getHotelLocation() {
       return hotelLocation;
   }

   /**
    * @param hotelLocation the hotelLocation to set
    */
   public void setHotelLocation(String hotelLocation) {
       this.hotelLocation = hotelLocation;
   }
   
}
