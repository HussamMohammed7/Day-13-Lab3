import java.util.ArrayList;

public class Music extends Media {
    private String artist;

    public Music() {
    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user) {
        try {
            user.addToCart(this);
            user.checkOut();
        } catch (Exception e) {
            System.err.println("An error occurred while listening to music: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Music {\n" +
                "    Artist: '" + artist + "',\n" +
                "    " + super.toString() + "\n" +
                "}";
    }

    public ArrayList<Music> generate(ArrayList<Music> generatePlayList) {
        ArrayList<Music> playList = new ArrayList<>();

        try {
            for (Music music : generatePlayList) {
                if (music.artist.equals(this.artist)) {
                    playList.add(music);
                }
            }
        } catch (Exception e) {
            System.err.println("An error occurred while generating the playlist: " + e.getMessage());
        }

        return playList;
    }

    @Override
    public String getMediaType() {
        if (getPrice() >= 10) {
            return "Premium music";
        } else {
            return "Music";
        }
    }
}
