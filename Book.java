import java.util.ArrayList;

public class Book extends Media {
    private int stock;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Book() {
    }

    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
    }

    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = reviews;
    }

    public int getStock() {
        try {
            return stock;
        } catch (Exception e) {
            System.err.println("Error getting stock: " + e.getMessage());
            return 0;
        }
    }

    public void setStock(int stock) {
        try {
            this.stock = stock;
        } catch (Exception e) {
            System.err.println("Error setting stock: " + e.getMessage());
        }
    }

    public ArrayList<Review> getReviews() {
        try {
            return reviews;
        } catch (Exception e) {
            System.err.println("Error getting reviews: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void setReviews(ArrayList<Review> reviews) {
        try {
            this.reviews = reviews;
        } catch (Exception e) {
            System.err.println("Error setting reviews: " + e.getMessage());
        }
    }

    public void addReview(Review review) {
        try {
            reviews.add(review);
        } catch (Exception e) {
            System.err.println("Error adding review: " + e.getMessage());
        }
    }

    public double getAverageRating() {
        try {
            double sum = 0;
            for (Review review : reviews) {
                sum += review.getRating();
            }
            return sum / reviews.size();
        } catch (Exception e) {
            System.err.println("Error calculating average rating: " + e.getMessage());
            return 0;
        }
    }

    public void purchase(User user) {
        try {
            if (this.stock > 0) {
                user.addToCart(this);
                user.checkOut();
                stock--;
            } else {
                System.out.println("Out of stock, please try again later.");
            }
        } catch (Exception e) {
            System.err.println("Error during purchase: " + e.getMessage());
        }
    }

    public boolean isBestSeller() {
        try {
            return getAverageRating() >= 4.5;
        } catch (Exception e) {
            System.err.println("Error determining if book is a bestseller: " + e.getMessage());
            return false;
        }
    }

    public void reStock(int quantity) {
        try {
            setStock(getStock() + quantity);
            System.out.println("Stock quantity has increased by " + quantity);
        } catch (Exception e) {
            System.err.println("Error restocking: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        try {
            return "Book {\n" +
                    "    Stock: " + stock + ",\n" +
                    "    Reviews: " + reviews + ",\n" +
                    "    " + super.toString() + "\n" +
                    "}";
        } catch (Exception e) {
            return "Error generating string representation: " + e.getMessage();
        }
    }

    @Override
    public String getMediaType() {
        try {
            if (isBestSeller()) {
                return "Bestselling Book";
            } else {
                return "Book";
            }
        } catch (Exception e) {
            System.err.println("Error getting media type: " + e.getMessage());
            return "Book";
        }
    }
}
