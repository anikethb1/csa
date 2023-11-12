import java.lang.Math;

public class Media {
    private String title;
    private boolean isMovie;
    private String genre;
    private boolean isWatched;

    public Media(String t, boolean m, String g) {
        title = t;
        isMovie = m;
        genre = g;
        isWatched = false;
    }

    public void watch() {
        isWatched = true;
    }

    public boolean getWatched() {
        return isWatched;
    }
}