import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //Output message before taking input
        System.out.println("Please enter information for the following fields:");
        System.out.println("Artist Name, Birth Year, Death Year, Artwork Title, Artwork Year Published");
        System.out.println("After entering information for one field, hit \"Enter\" to go to next field.");
        System.out.println("For Birth/Death years unknown, type \"-1\". ");

        // Read input
        String artistName = scnr.nextLine();
        int birthYear = scnr.nextInt();
        int deathYear = scnr.nextInt();
        scnr.nextLine(); // Consume the newline character
        String artworkTitle = scnr.nextLine();
        int yearCreated = scnr.nextInt();
        scnr.close(); //close after done with scanner (prevent memory leak)

        // Create Artist and Artwork objects
        Artist artist = new Artist(artistName, birthYear, deathYear);
        Artwork artwork = new Artwork(artworkTitle, yearCreated, artist);

        // Display the information
        artwork.printInfo();
    }
}