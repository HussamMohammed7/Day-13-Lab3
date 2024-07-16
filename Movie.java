import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {
    private int duration;

    public Movie() {
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        try {
            if (duration < 0) {
                throw new IllegalArgumentException("Duration cannot be negative");
            }
            this.duration = duration;
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting duration: " + e.getMessage());
        }
    }

    public void watch(User user) {
        try {
            if (user == null) {
                throw new IllegalArgumentException("User cannot be null");
            }
            user.addToCart(this);
            user.checkOut();
        } catch (IllegalArgumentException e) {
            System.out.println("Error in watch method: " + e.getMessage());
        }
    }

    public ArrayList<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        ArrayList<Movie> playList = new ArrayList<>();
        try {
            if (movieCatalog == null) {
                throw new IllegalArgumentException("Movie catalog cannot be null");
            }

            for (Movie movie : movieCatalog) {
                if (this.getAuteur().equals(movie.getAuteur()) && !this.equals(movie)) {
                    playList.add(movie);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error recommending movies: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
        return playList;
    }

    @Override
    public String getMediaType() {
        if (duration >= 120){
            return  "Long Movie";
        }else {
            return "Movie";
        }

    }

    @Override
    public String toString() {
        return "Movie {\n" +
                "    Title: '" + getTitle() + "',\n" +
                "    Auteur: '" + getAuteur() + "',\n" +
                "    ISBN: '" + getISBN() + "',\n" +
                "    Price: " + getPrice() + ",\n" +
                "    Duration: " + duration + "\n" +
                "}";
    }
}
