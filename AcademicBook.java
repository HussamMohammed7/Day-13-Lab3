import java.util.ArrayList;

public class AcademicBook extends Book {

    private String subject ;

    public AcademicBook() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews, String subject) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }


    public String getMediaType(){
        if(isBestSeller()){
            return "Bestselling AcademicBook";

        }else{
            return "AcademicBook";
        }

    }
}
