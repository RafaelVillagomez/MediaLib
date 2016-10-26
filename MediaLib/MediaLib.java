
/**
 * Write a description of class MediaLib here.
 * 
 * @author (Rafael Villagomez) 
 * @version (9/12/16)
 */
public class MediaLib
{
    public static void main()
    {
        int numSongs = 0;
        
 
        System.out.println ("Welcome to your Media Library");
        
        Song song1 = new Song();
        System.out.println(song1);
        song1.setTitle("Johnny B. Goode");
        System.out.println(song1.getTitle());
        
        song1.setRating(2);
        System.out.println(song1.getRating());
        
        song1.setPrice(5.2);
        System.out.println(song1.getPrice());
        
        Song song2 = new Song ("M", 1.29, 2);
        System.out.println(song2);
        System.out.println(song2.getTitle());
        System.out.println(song2.getRating());
        System.out.println(song2.getPrice());
        
        Song song3 = new Song ("Loco", .99, 6);
        System.out.println(song3);
        System.out.println(song3.getTitle());
        System.out.println(song3.getRating());
        System.out.println(song3.getPrice());
        
        Song song4 = new Song ("Coko", .99, 6);
        System.out.println(song4);
        System.out.println(song4.getTitle());
        System.out.println(song4.getRating());
        System.out.println(song4.getPrice());
        
        Song song5 = new Song ("Staying Alive", .99, 6);
        System.out.println(song5);
        System.out.println(song5.getTitle());
        System.out.println(song5.getRating());
        System.out.println(song5.getPrice());
        
        Song song6 = new Song ("Probability", .99, 6);
        System.out.println(song6);
        System.out.println(song6.getTitle());
        System.out.println(song6.getRating());
        System.out.println(song6.getPrice());
        
        Song song7 = new Song ("Soko", .99, 6);
        System.out.println(song7);
        System.out.println(song7.getTitle());
        System.out.println(song7.getRating());
        System.out.println(song7.getPrice());
        
        MediaFile.writeString(song1.getTitle() + "|" + song1.getRating());
        MediaFile.writeString(song2.getTitle() + "|" + song2.getRating());
        MediaFile.writeString(song3.getTitle() + "|" + song3.getRating());
        MediaFile.writeString(song4.getTitle() + "|" + song4.getRating());
        MediaFile.writeString(song5.getTitle() + "|" + song5.getRating());
        MediaFile.saveAndClose();   
        
        // testing a calculation:
        double totalCost;
        totalCost = song1.getPrice() + song2.getPrice() + song3.getPrice() + song4.getPrice() + song5.getPrice()
        + song6.getPrice() + song7.getPrice();
        System.out.printf("totalCost = %f\n", totalCost);
        System.out.printf("numSongs = %d\n", Song.numSongs());
        
        ////Average Rating////
        double aveRating = 0.0;
        aveRating = song1.getRating() + song2.getRating() + song3.getRating() + song4.getRating() + song5.getRating()
        + song6.getRating() + song7.getRating();
        System.out.printf("aveRating = %f\n", aveRating);
        
        Book book1 = new Book();
        System.out.println(book1);
        book1.setTitle("Steve Jobs");
        System.out.println(book1.getTitle());
        
        book1.setRating(8);
        System.out.println(book1.getRating());
        
        Movie movie1 = new Movie();
        System.out.println(movie1);
        movie1.setTitle("Batman Returns");
        System.out.println(movie1.getTitle());
        movie1.setDuration(97);
        movie1.setRating(10);
        System.out.println(song1.getRating());
        
        Movie movie2 = new Movie("Batman Dark Knight", 6, 134);
        System.out.println(movie2);
        System.out.println(movie2.getTitle());
        System.out.println(movie2.getRating());
        System.out.println(movie2.getDuration());
        
         Movie movie3 = new Movie("Cookie Monster", 8, 199);
        System.out.println(movie3);
        System.out.println(movie3.getTitle());
        System.out.println(movie3.getRating());
        System.out.println(movie3.getDuration());
        
        int totalHours = 0;
        totalHours = movie1.getDuration() + movie2.getDuration() + movie3.getDuration();
        System.out.printf("totalHours = %d ", totalHours);
        
        
    }
}
