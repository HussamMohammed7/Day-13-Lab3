import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       // general testing
        User user1 = new User("Hussam","moh@gmail.com");;
        User user2 = new User("khaled","moh@gmail.com");
        User user3 = new User("ali","mohfdsafdsaf@gmail.com");


        Music music1 = new Music("hello","joa cool","94395439259",33,"joa cool");
        Music music2 = new Music("tsdk wala a7lef lk","talal madah","94395439259",20,"talal madah");
        Music music3 = new Music("jetk mthl ","talal madah","94395439259",20,"talal madah");
        Music music4 = new Music("meaw 12","talal madah","94395439259",20,"talal madah");

        ArrayList<Music> listMusic = new ArrayList<Music>();
        listMusic.add(music1);
        listMusic.add(music2);
        listMusic.add(music3);
        listMusic.add(music4);

        Review review1 = new Review("hussam44",5,"i like this book");


         Book book1 = new Book("tajweed","ali mohsn","94395439259",33,5);
         Book book2 = new Book("Coputer science","majd","94395439259",33,5);

         Movie movie1 = new Movie("matrix","jon jones","9431111111159",10,140);
         Novel novel1 = new Novel("lyla w qes","hussam","943954392fdsaf59",33,5,"action");


        System.out.println(novel1.getMediaType());
        novel1.addReview(review1);
        System.out.println(novel1.getMediaType());





        music2.listen(user1);



        book1.reStock(10);
        book1.getAverageRating();
        book1.purchase(user1);
        book2.addReview(review1);
        System.out.println(book2.getMediaType());
        movie1.watch(user1);


        System.out.println(user1);

        Review review4 = new Review("User1", 5, "Great book");
        Review review5 = new Review("User2", 4, "Very good");
        ArrayList<Review> reviews = new ArrayList<>();
        reviews.add(review5);
        reviews.add(review4);

        AcademicBook academicBook1 = new AcademicBook("Java Programming", "Author A", "432432432", 49.99, 10, reviews, "Computer Science");

        System.out.println(academicBook1);

        System.out.println("Media type of academicBook1: " + academicBook1.getMediaType());

        System.out.println("Is academicBook1 a bestseller? " + academicBook1.isBestSeller());


       //Store testing


        Book book4 = new Book("Effective Java", "mohammed", "9780134685991", 45.00, 10);
        Book book5 = new Book("Clean Code", "ana", "9780132350884", 40.00, 5);
        Movie movie4 = new Movie("Inception", "hussam", "883929118688", 20.00, 148);
        Movie movie5 = new Movie("The Matrix", "Wachowskis", "883929118689", 15.00, 136);

        User user11 = new User("john", "john.doe@example.com");
        User user15 = new User("jane", "jane.smith@example.com");


//
//        ArrayList<User> users = new ArrayList<>();
//        ArrayList<Media> medias = new ArrayList<>();
//        Store store = new Store(users, medias);
//
//        store.addUser(user11);
//        store.addUser(user11);
//
//        store.addMedia(book1);
//        store.addMedia(book2);
//        store.addMedia(book5);
//        store.addMedia(movie1);
//        store.addMedia(movie4);
//        store.addMedia(movie5);
//
//        System.out.println("Users in store:");
//        for (User user : store.displayUsers()) {
//            System.out.println(user);
//        }
//
//        System.out.println("Medias in store:");
//        for (Media m : store.displayMedias()) {
//            System.out.println(m);
//        }
//
//
//        String searchTitle = "Clean Code";
//        Book found= store.searchBook(searchTitle);
//
//        if (found != null) {
//            System.out.println("Found book: " + found);
//        } else {
//            System.out.println("Book not found: " + searchTitle);
//        }

        //testing movies
        Movie movie2 = new Movie("The Dark Knight", "Christopher Nolan", "88fdsaf9", 25.00, 152);
        Movie movie3 = new Movie("Interstellar", "Christopher Nolan", "8838690", 22.00, 169);
        Movie movie22 = new Movie("ahmed morgan", "Christopher Nolan", "88w38690", 222.00, 133);

        ArrayList<Movie> movieCatalog = new ArrayList<>();
        movieCatalog.add(movie1);
        movieCatalog.add(movie2);
        movieCatalog.add(movie3);
        movieCatalog.add(movie4);
        movieCatalog.add(movie5);
        movieCatalog.add(movie22);

        System.out.println(movie1.getTitle() + " is a " + movie1.getMediaType());
        System.out.println(movie4.getTitle() + " is a " + movie4.getMediaType());
        ArrayList<Movie> recommendedMovies = (movie2.recommendSimilarMovies(movieCatalog));
        System.out.println(recommendedMovies.size());


        System.out.println("Movies recommended based on " + movie2.getTitle() + ":");
        for (Movie movie : recommendedMovies) {
            System.out.println(movie);
        }


        // test music
        Music music5 = new Music("Song One", "Artist One", "4331432", 9.99, "Artist One");
        Music music6 = new Music("Song Two", "Artist One", "4325435", 10.99, "Artist One");
        Music music7 = new Music("Song Three", "Artist Two", "432432", 5.99, "Artist Two");

        System.out.println(music5);
        System.out.println(music6);
        System.out.println(music7);
        User user = new User("test", "test@test.com");
        music5.listen(user);
        System.out.println("istening to: " + user.getPurchaseMediaList());

        ArrayList<Music> musicCatalog = new ArrayList<>();
        musicCatalog.add(music5);
        musicCatalog.add(music6);
        musicCatalog.add(music7);

        ArrayList<Music> generatedPlayList = music5.generate(musicCatalog);
        System.out.println("Generated Playlist for Artist One:");
        for (Music music : generatedPlayList) {
            System.out.println(music);
        }
        System.out.println("Media type 5: " + music5.getMediaType());
        System.out.println("Media type 6: " + music6.getMediaType());









    }


}