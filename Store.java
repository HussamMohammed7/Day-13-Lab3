import java.util.ArrayList;

public class Store {


    private ArrayList<User> users;
    private ArrayList<Media>medias ;


    public Store() {
    }

    public Store(ArrayList<User> users, ArrayList<Media> medias) {
        this.users = users;
        this.medias = medias;
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully");
    }
    public void addMedia(Media media) {
        medias.add(media);
        System.out.println("Media added successfully");
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }

    public void setMedias(ArrayList<Media> medias) {
        this.medias = medias;
    }

    public ArrayList<User> displayUsers() {
        return users;

    }
    public ArrayList<Media> displayMedias() {
        return medias;

    }

    public Book searchBook (String title){

        for (Media m : medias) {
            if (m.getTitle().equals(title) && m instanceof Book) {
                return (Book) m;
            }
        }
        return null;

    }


}
