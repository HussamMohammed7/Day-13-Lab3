import java.util.ArrayList;

public class Novel extends Book{

    private String genre ;

    public Novel() {
    }

    public Novel(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }

    public Novel(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews , String genre) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.genre = genre;

    }

    public String getMediaType(){
        if(isBestSeller()){
            return "Bestselling Novel";

        }else{
            return "Novel";
        }

    }



}
