public class Artwork {
    private String title;
    private int yearCreated;
    private Artist artist;

    // Default constructor
    public Artwork() {
        this.title = "unknown";
        this.yearCreated = -1;
        this.artist = new Artist();
    }

    // Parameterized constructor
    public Artwork(String title, int yearCreated, Artist artist) {
        this.title = title;
        this.yearCreated = yearCreated;
        this.artist = artist;
    }

    // Get methods
    public String getTitle() {
        return title;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public Artist getArtist() {
        return artist;
    }

    // printInfo method
    public void printInfo() {
        artist.printInfo();
        System.out.println("Title: " + title + ", " + yearCreated);
    }
}