package dayTourSearch;


/**
 *
 * @author Orn
 */
public class Review {
    private String legend;
    private String owner;
    private String content;
    private double stars;
    private String date;
    private int ID;

    /**
     * @return the legend
     */
    
    public Review(String legend, String owner, String content, 
            double stars, String date, int dayTourID){
        this.legend = legend;
        this.owner= owner;
        this.content= content;
        this.stars= stars;
        this.date= date;
        this.ID = dayTourID;
    }
    
    public String getLegend() {
        return legend;
    }

    /**
     * @param legend the legend to set
     */
    public void setLegend(String legend) {
        this.legend = legend;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the stars
     */
    public double getStars() {
        return stars;
    }

    /**
     * @param stars the stars to set
     */
    public void setStars(double stars) {
        this.stars = stars;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
     /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    
}
