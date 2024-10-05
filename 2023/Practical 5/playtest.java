// Surname:     Rubushe
// Name:        Yanga
// Year:        2023 
// Assignment:  Practical 1 Term 2
// File:        playtest.java

/*This code creates an instance of the Playlist class, inserts FOUR tracks into it,
displays all the tracks in the playlist, deletes SECOND song on the playlist, displays the playlist again, 
and performs search operations for FIRST and SECOND songs before exiting. */

public class playtest {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.insert("11", "Use This Gospel", "Kanye West",  "JESUS IS KING", 3, 30);
        playlist.insert("12", "Waves", "Kanye West", "THE LIFE OF PABLO", 4, 15);
        playlist.insert("13", "Godlike", "A-Reece", "DEADLINES", 2, 45);
        playlist.insert("14", "About the Dough", "A-Reece", "FROM ME TO YOU & ONLY YOU", 5, 0);
        
        System.out.println("Final Playlist: \n");

        playlist.displayInOrder(playlist.getRoot());

        System.out.println("Deleting Waves...");
        playlist.delete("Waves");

        playlist.displayInOrder(playlist.getRoot());

        System.out.println("Searching for Use This Gospel: " + playlist.search("Use This Gospel"));
        System.out.println("Searching for Waves: " + playlist.search("Waves"));
    }
}