import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchaseMediaList = new ArrayList<>();
    private ArrayList<Media> shoppingCart = new ArrayList<>();

    public User() {
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public User(String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart, String username) {
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public void addToCart(Media media) {
        try {
            shoppingCart.add(media);
        } catch (Exception e) {
            System.err.println("Error adding to cart: " + e.getMessage());
        }
    }

    public void removeFromCart(Media media) {
        try {
            if (shoppingCart.contains(media)) {
                shoppingCart.remove(media);
            } else {
                System.err.println("Media not found in the shopping cart.");
            }
        } catch (Exception e) {
            System.err.println("Error removing from cart: " + e.getMessage());
        }
    }

    public void checkOut() {
        try {
            purchaseMediaList.addAll(shoppingCart);
            shoppingCart.clear();
        } catch (Exception e) {
            System.err.println("Error during checkout: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "User {\n" +
                "    Username: '" + username + "',\n" +
                "    Email: '" + email + "',\n" +
                "    Purchased Media List: " + purchaseMediaList + ",\n" +
                "    Shopping Cart: " + shoppingCart + "\n" +
                "}";
    }
}
