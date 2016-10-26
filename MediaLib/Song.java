
/**
 * Write a description of class Song here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    private double totalCost;
    private static int numSongs = 0;

    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;
        totalCost = 0.0;
        numSongs++;
    }
    
    public Song(String title, double price)
    {
        this.title = title;
        this.price = price;
        numSongs++;
    }
    
    public Song(String title, double price, int rating)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
        numSongs++;
    }
    
    public static int numSongs() {
        return numSongs;
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
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
    
    public void addToFavorites()
    {
        favorite = true;
    }
    
}
