
/**
 * Write a description of class Movie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int duration;
    private int totalHours;
    private int hours;

    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        duration = 0;
        totalHours = 0;
        hours = 60;
    }
    
    public Movie( String title, int rating, int duration)
    {
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle (String t) 
    {
        title = t;
    }
    
     public int getRating()
    {
        return rating;
    }
    
    public void setRating(int r)
    {
        rating = r;
    }
    
    public int getDuration()
    {
        return duration;
    }
    
    public void setDuration(int d)
    {
        duration = d;
    }
    
    public void setHours(int h)
    {
        hours = h;
    }
    
    public int getHours()
    {
        return hours;
    }
    
}
