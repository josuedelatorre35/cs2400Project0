import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Read input
        String artistName = scnr.nextLine();
        int birthYear = scnr.nextInt();
        int deathYear = scnr.nextInt();
        scnr.nextLine(); // Consume the newline character
        String artworkTitle = scnr.nextLine();
        int yearCreated = scnr.nextInt();

        // Create Artist and Artwork objects
        Artist artist = new Artist(artistName, birthYear, deathYear);
        Artwork artwork = new Artwork(artworkTitle, yearCreated, artist);

        // Display the information
        artwork.printInfo();
    }
}