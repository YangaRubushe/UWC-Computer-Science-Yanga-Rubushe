class PlayTester {
    public static void main(String[] args) {
        // Create an instance of Playlist
        Playlist playlist = new Playlist();
        
        // Insert tracks into the playlist
        playlist.insert("11", "Use This Gospel", "Kanye West",  "JESUS IS KING", 3, 30);
        playlist.insert("12", "Waves", "Kanye West", "THE LIFE OF PABLO", 4, 15);
        playlist.insert("13", "Godlike", "A-Reece", "DEADLINES", 2, 45);
        playlist.insert("14", "About the Dough", "A-Reece", "FROM ME TO YOU & ONLY YOU", 5, 0);
        
        System.out.println("Final Playlist: \n");
        // Display the tracks in ascending order
        playlist.displayInOrder(playlist.getRoot());
        
        // Search for a particular track by title
        boolean isTrackFound = playlist.search("Track 2");
        System.out.println("Is Track 2 in the playlist? " + isTrackFound);
        
        // Delete a particular track by title
        playlist.delete("Track 4");
    }
}